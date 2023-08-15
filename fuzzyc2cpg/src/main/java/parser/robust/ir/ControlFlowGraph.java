package parser.robust.ir;

import gremlin.scala.GremlinScala;
import gremlin.scala.ScalaVertex;
import io.shiftleft.codepropertygraph.Cpg;
import io.shiftleft.codepropertygraph.generated.EdgeTypes;
import io.shiftleft.codepropertygraph.generated.NodeTypes;
import io.shiftleft.codepropertygraph.generated.Operators;
import io.shiftleft.codepropertygraph.generated.nodes.*;
import io.shiftleft.joern.CpgLoader;
import io.shiftleft.semanticcpg.language.NodeTypeStarters;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import scala.collection.immutable.Seq;
import scala.jdk.CollectionConverters;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ControlFlowGraph {
    private BasicBlock mEntry;
    private BasicBlock mExit;
    private String mMethodName;
    private Method mMethod;
    private List<BasicBlock> mNodes;
    private Map<BasicBlock, EDGE> mGraph;
    private Map<Vertex, BasicBlock> mCache;

    public ControlFlowGraph(Method method) {
        mMethod = method;
        mMethodName = method.fullName();
        mNodes = new LinkedList<>();
        mGraph = new HashMap<>();
        mCache = new HashMap<>();
    }

    public void buildCFG() {
        mEntry = new BasicBlock(mMethod.lineNumber().get(), 0);
        mExit = new BasicBlock(mMethod.lineNumberEnd().get(), 1);
        mNodes.add(mEntry);
        mNodes.add(mExit);
        mCache.put(mMethod.underlying(), mEntry);
        buildCFG(mEntry, mMethod.underlying());
    }

    private EDGE getOrCreate(BasicBlock bb) {
        EDGE E = mGraph.get(bb);
        if (E == null) {
            E = new EDGE(bb);
            mGraph.put(bb, E);
        }
        return E;
    }

    public void dumpCFG() {
        System.out.println("CFG: " + mMethodName);
        for (Map.Entry<BasicBlock, EDGE> entry : mGraph.entrySet()) {
            BasicBlock bb = entry.getKey();
            EDGE E = entry.getValue();
            System.out.println("BB[" + bb.id() + "]: " + bb.code() + "\n      : " + bb.normalized());
            CFGEdge edge = E.fallthroughForwardEdge();
            if (null == edge) {
                Iterator<CFGEdge> iterator = E.iterateForwardEdges();
                while (iterator.hasNext()) {
                    edge = iterator.next();
                    BasicBlock tgt = edge.target();
                    System.out.println(" -> BB[" + tgt.id() + "]: " + tgt.code() + "\n      : " + tgt.normalized());
                }
            } else {
                BasicBlock tgt = edge.target();
                System.out.println(" -> BB[" + tgt.id() + "]: " + tgt.code() + "\n      : " + tgt.normalized());
            }
        }
    }

    private void buildCFG(BasicBlock currBB, Vertex node) {
        List<Vertex> stack = new LinkedList<>();
        List<Vertex> successors = new LinkedList<>();
        ScalaVertex V = new ScalaVertex(node);
        GremlinScala<Edge> out = V.outE(singleStringToSeq(EdgeTypes.CFG));
        scala.collection.immutable.List<Edge> succEdges = out.l();
        int nSuccessors = succEdges.size();
        System.out.println("{NODE} " + node + " : " + nSuccessors);
        for (int i = 0; i < nSuccessors; i++) {
            Edge edge = succEdges.apply(i);
            Vertex succ = edge.inVertex();
            BasicBlock succBB = mCache.get(succ);
            System.out.println("[i=" + i + "]: " + succ.property("CODE").value() + " " + ((succBB != null) ? succBB.code() : "XXX"));
            if (null != succBB) {
                EDGE Ef = getOrCreate(currBB);
                EDGE Eb = getOrCreate(succBB);
                CFGEdge cfgEdge = Ef.findForwardEdge(succBB);
                System.out.println("fedge is null? " + (cfgEdge == null) + " " + currBB.code() + " <-> " + succBB.code());
                if (cfgEdge == null) {
                    cfgEdge = new CFGEdge(currBB, succBB);
                    Ef.addForwardEdge(cfgEdge);
                    Eb.addBackwardEdge(cfgEdge);
                }
                continue;
            }
            Vertex stop = collect(succ, stack);
            System.out.println("STOP: [" + i + "] " + stop.property("CODE").value() + " " + stop);
            if (NodeTypes.METHOD_RETURN.equals(stop.label())) {
                EDGE Ef = getOrCreate(currBB);
                EDGE Eb = getOrCreate(mExit);
                CFGEdge cfgEdge = Ef.findForwardEdge(mExit);
                if (cfgEdge == null) {
                    cfgEdge = new CFGEdge(currBB, mExit);
                    Ef.addForwardEdge(cfgEdge);
                    Eb.addBackwardEdge(cfgEdge);
                }
                mCache.put(succ, mExit);
                continue;
            }
            String norm = normalize(stop);
            String code = stop.property("CODE").value().toString();
            int line = Integer.valueOf(stop.property("LINE_NUMBER").value().toString());
            System.out.println("SSSS: " + stop + "  " + code);

            BasicBlock bb = new BasicBlock(code, line, norm);
            bb.setId(mNodes.size());
            System.out.println(" normalized: " + code + " " + norm + " [" + bb.id() + "]");
            mNodes.add(bb);
            mCache.put(succ, bb);
            EDGE Ef = getOrCreate(currBB);
            EDGE Eb = getOrCreate(bb);
            CFGEdge cfgEdge = Ef.findForwardEdge(bb);
            if (cfgEdge == null) {
                cfgEdge = new CFGEdge(currBB, bb);
                Ef.addForwardEdge(cfgEdge);
                Eb.addBackwardEdge(cfgEdge);
            }
            //
            buildCFG(bb, stop);
        }

    }

    private String buildInst(Vertex node, boolean inAssignment) {
        StringBuffer buffer = new StringBuffer();
        if (node instanceof Call) {
            Call call = (Call) node;
            List<Vertex> vlist = new LinkedList<>();
            Iterator<StoredNode> csn = call._astOut();
            while (csn.hasNext()) {
                StoredNode arg = csn.next();
                vlist.add(arg.underlying());
            }
            String mname = call.methodInstFullName().get();
            if (!mname.contains("<operator>")) {
                buffer.append("[CALL](");
                buffer.append(mname);
                buffer.append(") (");
                while (!vlist.isEmpty()) {
                    Vertex arg = vlist.remove(0);
//                    buffer.append(arg.property("TYPE_FULL_NAME").value().toString());
                    buildTypeFullName(buffer, arg);
                    if (!vlist.isEmpty()) {
                        buffer.append(", ");
                    }
                }
                buffer.append(")");
            } else if (mname.equals(Operators.addition)) {
                buildBinaryInst(buffer, vlist, "+", inAssignment);
            } else if (mname.equals(Operators.subtraction)) {
                buildBinaryInst(buffer, vlist, "-", inAssignment);
            } else if (mname.equals(Operators.multiplication)) {
                buildBinaryInst(buffer, vlist, "*", inAssignment);
            } else if (mname.equals(Operators.division)) {
                buildBinaryInst(buffer, vlist, "/", inAssignment);
            } else if (mname.equals(Operators.modulo)) {
                buildBinaryInst(buffer, vlist, "%", inAssignment);
            } else if (mname.equals(Operators.and)) {
                buildBinaryInst(buffer, vlist, "&", inAssignment);
            } else if (mname.equals(Operators.or)) {
                buildBinaryInst(buffer, vlist, "|", inAssignment);
            } else if (mname.equals(Operators.xor)) {
                buildBinaryInst(buffer, vlist, "^", inAssignment);
            } else if (mname.equals(Operators.not)) {
                buildUnaryInst(buffer, vlist, "~", inAssignment);
            } else if (mname.equals(Operators.notEquals)) {
                buildBinaryInst(buffer, vlist, "!=", inAssignment);
            } else if (mname.equals(Operators.equals)) {
                buildBinaryInst(buffer, vlist, "==", inAssignment);
            } else if (mname.equals(Operators.lessThan)) {
                buildBinaryInst(buffer, vlist, "<", inAssignment);
            } else if (mname.equals(Operators.lessEqualsThan)) {
                buildBinaryInst(buffer, vlist, "<=", inAssignment);
            } else if (mname.equals(Operators.greaterThan)) {
                buildBinaryInst(buffer, vlist, ">", inAssignment);
            } else if (mname.equals(Operators.greaterEqualsThan)) {
                buildBinaryInst(buffer, vlist, ">=", inAssignment);
            } else if (mname.equals(Operators.shiftLeft)) {
                buildBinaryInst(buffer, vlist, "<<", inAssignment);
            } else if (mname.equals(Operators.arithmeticShiftRight)) {
                buildBinaryInst(buffer, vlist, ">>", inAssignment);
            } else if (mname.equals(Operators.logicalShiftRight)) {
                buildBinaryInst(buffer, vlist, ">>", inAssignment);
            } else if (mname.equals(Operators.addressOf)) {
                buildUnaryInst(buffer, vlist, "&", inAssignment);
            } else if (mname.equals(Operators.cast)) {
                Vertex a = vlist.get(0);
                String op = "[CAST]";
                if (a instanceof Unknown) {
                    Unknown u = (Unknown) vlist.remove(0);
                    op = "(" + u.property("CODE").value().toString() + ")";
                }
                buildUnaryInst(buffer, vlist, op, inAssignment);
            } else if (mname.equals(Operators.logicalNot)) {
                buildUnaryInst(buffer, vlist, "!", inAssignment);
            } else if (mname.equals(Operators.logicalAnd)) {
                buildBinaryInst(buffer, vlist, "&&", inAssignment, "bool", "bool");
            } else if (mname.equals(Operators.logicalOr)) {
                buildBinaryInst(buffer, vlist, "||", inAssignment, "bool", "bool");
            } else if (mname.equals(Operators.assignmentPlus)) {
                buildAnyAssignmentInst(buffer, vlist, "+");
            } else if (mname.equals(Operators.assignmentMinus)) {
                buildAnyAssignmentInst(buffer, vlist, "-");
            } else if (mname.equals(Operators.assignmentMultiplication)) {
                buildAnyAssignmentInst(buffer, vlist, "*");
            } else if (mname.equals(Operators.assignmentDivision)) {
                buildAnyAssignmentInst(buffer, vlist, "/");
            } else if (mname.equals(Operators.assignmentModulo)) {
                buildAnyAssignmentInst(buffer, vlist, "%");
            } else if (mname.equals(Operators.assignmentAnd)) {
                buildAnyAssignmentInst(buffer, vlist, "&");
            } else if (mname.equals(Operators.assignmentOr)) {
                buildAnyAssignmentInst(buffer, vlist, "|");
            } else if (mname.equals(Operators.assignmentShiftLeft)) {
                buildAnyAssignmentInst(buffer, vlist, "<<");
            } else if (mname.equals(Operators.assignmentLogicalShiftRight)) {
                buildAnyAssignmentInst(buffer, vlist, ">>");
            } else if (mname.equals(Operators.assignmentArithmeticShiftRight)) {
                buildAnyAssignmentInst(buffer, vlist, ">>");
            } else if (mname.equals(Operators.assignmentXor)) {
                buildAnyAssignmentInst(buffer, vlist, "^");
            } else if (mname.equals(Operators.postIncrement)) {
                buildIncDecInst(buffer, vlist, "+");
            } else if (mname.equals(Operators.preIncrement)) {
                buildIncDecInst(buffer, vlist, "+");
            } else if (mname.equals(Operators.postDecrement)) {
                buildIncDecInst(buffer, vlist, "-");
            } else if (mname.equals(Operators.preDecrement)) {
                buildIncDecInst(buffer, vlist, "-");
            }
        } else if (node instanceof Identifier) {
            Identifier id = (Identifier) node;
            buffer.append(id.typeFullName());
        } else if (node instanceof Literal) {
            Literal literal = (Literal) node;
            buffer.append(literal.typeFullName());
        }
        return buffer.toString();
    }

    private String normalize(Vertex node) {
        System.out.println("NORM: " + " -- " + node.label());
        StringBuffer buffer = new StringBuffer();
        if (node instanceof Call) {
            Call call = (Call) node;
            List<Vertex> vlist = new LinkedList<>();
            Iterator<StoredNode> csn = call._astOut();
            while (csn.hasNext()) {
                StoredNode arg = csn.next();
                vlist.add(arg.underlying());
            }
            System.out.println(call.methodInstFullName() + "  " + Operators.assignment);
            String cname = call.methodInstFullName().get();
            if (cname.equals(Operators.assignment)) {
                System.out.println(call.code() + " <- " + call.methodInstFullName());
                Vertex LHS = vlist.remove(0);
//                buffer.append(LHS.property("TYPE_FULL_NAME").value().toString());
                buildTypeFullName(buffer, LHS);
                buffer.append(" = ");
                Vertex RHS = vlist.get(0);
                buffer.append(buildInst(RHS, true));
            } else {
                buffer.append(buildInst(node, false));
            }
        } else if (node instanceof Return) {
            Return retn = (Return) node;
            List<Vertex> vlist = new LinkedList<>();
            Iterator<StoredNode> csn = retn._astOut();
            while (csn.hasNext()) {
                StoredNode arg = csn.next();
                vlist.add(arg.underlying());
            }
            buffer.append("return ");
            while (!vlist.isEmpty()) {
                Vertex arg = vlist.remove(0);
//                buffer.append(arg.property("TYPE_FULL_NAME").value().toString());
                buildTypeFullName(buffer, arg);
                if (!vlist.isEmpty()) {
                    buffer.append(", ");
                }
            }
        }
        return buffer.toString();
    }

    private Vertex collect(Vertex starter, List<Vertex> stack) {
        Vertex retV = null;
        Vertex vertex = starter;

        do {
            stack.add(vertex);
            ScalaVertex V = new ScalaVertex(vertex);
            GremlinScala<Edge> out = V.outE(singleStringToSeq(EdgeTypes.CFG));
            scala.collection.immutable.List<Edge> succEdges = out.l();
            System.out.println("V: " + vertex.property("CODE").value());
            if (succEdges.size() != 1) {
                retV = vertex;
                break;
            }
            Vertex succ = succEdges.head().inVertex();
            System.out.println("   > " + vertex.label() + "  " + succ.label());
            if (NodeTypes.CALL.equals(vertex.label())) {
                String vinst = vertex.property("METHOD_INST_FULL_NAME").value().toString();
                if (vinst.contains("<operator>") &&
                        (vinst.contains("Increment") || vinst.contains("Decrement"))) {
                    retV = vertex;
                    break;
                }
                if (NodeTypes.CALL.equals(succ.label()) &&
                        Operators.assignment.equals(succ.property("METHOD_INST_FULL_NAME").value().toString())) {
                    stack.add(succ);
                    retV = succ;
                    break;
                }
                retV = vertex;
                break;
            } else if (NodeTypes.RETURN.equals(vertex.label())) {
                retV = vertex;
                break;
            } else if (NodeTypes.METHOD_RETURN.equals(vertex.label())) {
                retV = vertex;
                break;
            }
            vertex = succ;
        } while (true);
        return retV;
    }

    static Seq<String> singleStringToSeq(String s) {
        List<String> list = Arrays.asList(new String[]{s});
        return CollectionConverters.IteratorHasAsScala(list.iterator()).asScala().toSeq();
    }

    public static void main(String[] args) throws IOException {
        //String t = "D:\\Workspace\\RobustParser\\rp\\rp_c\\test1\\Workspace\\RobustParser\\rp";  //original code hjj
        String t = "/media/nie/Element/Linux5.19/linux";
        List<File> cpgFiles = new LinkedList<>();
        File root = new File(t);
        getFiles(root, cpgFiles);
        if (cpgFiles.isEmpty()) {
            System.out.println("No CPG (.bin.zip) files are found. Program exits.");
            return;
        }
        for (File f : cpgFiles) {
            Cpg cpg = CpgLoader.load(f.getAbsolutePath(), null);
            NodeTypeStarters nts = new NodeTypeStarters(cpg);

            io.shiftleft.semanticcpg.language.types.structure.Method method = nts.method();
            scala.collection.immutable.List<io.shiftleft.codepropertygraph.generated.nodes.Method> mns = method.l();
            scala.collection.Iterator<Method> iter = mns.iterator();
            System.out.println("*** " + method);
            while (iter.hasNext()) {
                io.shiftleft.codepropertygraph.generated.nodes.Method m = iter.next();
                System.err.println(m.fullName() + "  " + m._cfgIn().hasNext() + " " + m._cfgOut().hasNext());
                if (!m.fullName().contains("<operator>") && m._cfgOut().hasNext()) {

                    System.out.println(" -> " + m.lineNumber() + " " + m.lineNumberEnd());
                    ControlFlowGraph cfg = new ControlFlowGraph(m);
                    cfg.buildCFG();
                    cfg.dumpCFG();
//                    ScalaVertex vertex = new ScalaVertex(m);
//                    GremlinScala<Vertex> outs = vertex.out(singleStringToSeq(EdgeTypes.CONTAINS));
//                    GremlinScala<Edge> outs = vertex.outE(singleStringToSeq(EdgeTypes.CFG));
//                    scala.collection.immutable.List<Edge> el = outs.l();
//
//                    System.out.println(el.size() + " " + el.apply(0).inVertex() + " " + el.head().outVertex());


//                    scala.collection.Iterator<Vertex> iii = outs.toIterator();
//                    while (iii.hasNext()) {
//                        Vertex vi = iii.next();
//                        System.out.println("  + " + vi + "  " + vi.label() + " " + vi.property("LINE_NUMBER").value());
//                        if (vi instanceof Call) {
//                            System.out.println("  - " + ((Call) vi).code() + " " + ((Call) vi).asStored()._astIn().next().underlying());
////                            System.out.println("  * " + ((Call)vi).code()  + " " + ((Call) vi).asStored()._astOut().next().underlying());
//                            Iterator<StoredNode> isn = ((Call) vi)._astOut();
//                            while (isn.hasNext()) {
//                                StoredNode sn = isn.next();
//                                System.out.println("   * " + sn.property("CODE").value() + "  " + sn.underlying());
//                            }
//                        }
//                        if (vi.label().equals(NodeTypes.METHOD_RETURN)) {
//                            ScalaVertex gvtx = new ScalaVertex(vi);
//                            GremlinScala<Edge> eds = gvtx.inE(singleStringToSeq(EdgeTypes.CFG));
//                            scala.collection.Iterator<Edge> ei = eds.toIterator();
//                            while (ei.hasNext()) {
//                                Edge e = ei.next();
//                                System.out.println(e.inVertex() + " -> " + e.outVertex());
//                                System.out.println(vi.property("LINE_NUMBER").value());
//                            }
//                        }
//                    }
                }
            }

        }
    }

    static void getFiles(File dir, List<File> cfgFiles) {
        File[] all = dir.listFiles();
        for (File f : all) {
            if (f.isDirectory()) {
                getFiles(f, cfgFiles);
            } else if (f.getName().endsWith(".bin.zip")) {
                cfgFiles.add(f);
            }
        }
    }

    private void buildBinaryInst(StringBuffer buffer, List<Vertex> operands, String operator, boolean inAssignment) {
        buildBinaryInst(buffer, operands, operator, inAssignment, null, null);
    }

    private void buildBinaryInst(StringBuffer buffer, List<Vertex> operands, String operator, boolean inAssignment,
                                 String type1, String type2) {
        if (!inAssignment) {
            buffer.append("[T] = ");
        }
        Vertex op1 = operands.remove(0);
        Vertex op2 = operands.remove(0);
//        buffer.append(op1.property("TYPE_FULL_NAME").value().toString());
        if (null == type1)
            buildTypeFullName(buffer, op1);
        else buffer.append(type1);
        buffer.append(" ");
        buffer.append(operator);
        buffer.append(" ");
//        buffer.append(op2.property("TYPE_FULL_NAME").value().toString());
        if (null == type2)
            buildTypeFullName(buffer, op2);
        else buffer.append(type2);
    }

    private void buildUnaryInst(StringBuffer buffer, List<Vertex> operands, String operator, boolean inAssignment) {
        if (!inAssignment) {
            buffer.append("[T] = ");
        }
        Vertex op = operands.remove(0);
        buffer.append(operator);
        buffer.append(" ");
        buildTypeFullName(buffer, op);
    }

    private void buildAnyAssignmentInst(StringBuffer buffer, List<Vertex> operands, String operator) {
        Vertex op1 = operands.remove(0);
        Vertex op2 = operands.remove(0);
        String lhsType = buildTypeFullName(buffer, op1);
        buffer.append(" = ");
        buffer.append(lhsType);
        buffer.append(" ");
        buffer.append(operator);
        buffer.append(" ");
        buildTypeFullName(buffer, op2);
    }

    private void buildIncDecInst(StringBuffer buffer, List<Vertex> operands, String operator) {
        Vertex op1 = operands.remove(0);
        String lhsType = buildTypeFullName(buffer, op1);
        buffer.append(" = ");
        buffer.append(lhsType);
        buffer.append(" ");
        buffer.append(operator);
        buffer.append(" ");
        buffer.append("int");
    }

    private String buildTypeFullName(StringBuffer buffer, Vertex vertex) {
        String type = vertex.property("TYPE_FULL_NAME").value().toString();
        type = type.replaceAll(" \\*", "*");
        buffer.append(type);
        return type;
    }

    static class EDGE {
        static final Iterator<CFGEdge> ITER = Collections.EMPTY_LIST.iterator();
        BasicBlock mNode;
        CFGEdge mForwardEdge;
        List<CFGEdge> mMultiForwardEdges;
        CFGEdge mBackwardEdge;
        List<CFGEdge> mMultiBackwardEdges;

        EDGE(BasicBlock node) {
            mNode = node;
        }

        CFGEdge findForwardEdge(BasicBlock tgt) {
            CFGEdge edge = null;
            if (mForwardEdge != null) {
                if (tgt.id() == mForwardEdge.target().id()) {
                    edge = mForwardEdge;
                } else {
                    if (mMultiForwardEdges != null) {
                        for (int i = 1; i < mMultiForwardEdges.size(); i++) {
                            CFGEdge E = mMultiForwardEdges.get(i);
                            if (tgt.id() == E.target().id()) {
                                edge = E;
                                break;
                            }
                        }
                    }
                }
            }
            return edge;
        }

        void addForwardEdge(CFGEdge edge) {
            if (mForwardEdge == null) mForwardEdge = edge;
            else {
                if (mMultiForwardEdges == null) {
                    mMultiForwardEdges = new LinkedList<>();
                    mMultiForwardEdges.add(mForwardEdge);
                }
                mMultiForwardEdges.add(edge);
            }
        }

        void addBackwardEdge(CFGEdge edge) {
            if (mBackwardEdge == null) mBackwardEdge = edge;
            else {
                if (mMultiBackwardEdges == null) {
                    mMultiBackwardEdges = new LinkedList<>();
                    mMultiBackwardEdges.add(mBackwardEdge);
                }
                mMultiBackwardEdges.add(edge);
            }
        }

        int numOfForwardEdges() {
            if (mMultiForwardEdges != null)
                return mMultiForwardEdges.size();
            else if (mForwardEdge != null)
                return 1;
            else
                return -1;
        }

        int numOfBackwardEdges() {
            if (mMultiBackwardEdges != null)
                return mMultiBackwardEdges.size();
            else if (mBackwardEdge != null)
                return 1;
            else
                return -1;
        }

        CFGEdge fallthroughForwardEdge() {
            if (mMultiForwardEdges == null)
                return mForwardEdge;
            return null;
        }

        CFGEdge fallthroughBackwardEdge() {
            if (mMultiBackwardEdges == null)
                return mBackwardEdge;
            return null;
        }

        Iterator<CFGEdge> iterateForwardEdges() {
            if (mMultiForwardEdges != null)
                return mMultiForwardEdges.iterator();
            return ITER;
        }

        Iterator<CFGEdge> iterateBackwardEdges() {
            if (mMultiBackwardEdges != null)
                return mMultiBackwardEdges.iterator();
            return ITER;
        }

        List<CFGEdge> forwardEdges() {
            return mMultiForwardEdges;
        }

        List<CFGEdge> backwardEdges() {
            return mMultiBackwardEdges;
        }
    }
}
