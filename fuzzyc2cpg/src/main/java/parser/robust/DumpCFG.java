package parser.robust;

import gremlin.scala.GremlinScala;
import gremlin.scala.ScalaVertex;
import io.circe.Json;
import io.circe.JsonObject;
import io.shiftleft.codepropertygraph.Cpg;
import io.shiftleft.codepropertygraph.generated.EdgeTypes;
import io.shiftleft.joern.CpgLoader;
import io.shiftleft.semanticcpg.language.NodeTypeStarters;
import io.shiftleft.semanticcpg.language.types.structure.Method;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import scala.Tuple2;
import scala.collection.Iterator;
import scala.collection.immutable.Seq;
import scala.jdk.CollectionConverters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DumpCFG {
    private String mPath;

    DumpCFG(String path) {
        mPath = path;
    }

    void getFiles(File dir, List<File> cfgFiles) {
        File[] all = dir.listFiles();
        for (File f : all) {
            if (f.isDirectory()) {
                getFiles(f, cfgFiles);
            } else if (f.getName().endsWith(".bin.zip")) {
                cfgFiles.add(f);
            }
        }
    }

    Seq<String> singleStringToSeq(String s) {
        List<String> list = Arrays.asList(new String[]{s});
        return CollectionConverters.IteratorHasAsScala(list.iterator()).asScala().toSeq();
    }

    Seq<Tuple2<String, Json>> tuplesToSeq(Tuple2<String, Json>... objs) {
        List<Tuple2<String, Json>> list = new LinkedList<>();
        for (Tuple2<String, Json> obj : objs) {
            list.add(obj);
        }
        return CollectionConverters.IteratorHasAsScala(list.iterator()).asScala().toSeq();
    }

    Seq<Json> javaCollToSeq(java.util.Collection<Json> collection) {
        return CollectionConverters.IteratorHasAsScala(collection.iterator()).asScala().toSeq();
    }

    Json cfg2Json(io.shiftleft.codepropertygraph.generated.nodes.Method method) {

        Tuple2<String, Json> fJson = new Tuple2<String, Json>("function", Json.fromString(method.name()));
        Tuple2<String, Json> midJson = new Tuple2<String, Json>("id", Json.fromString(method.toString()));

        List<Json> cfgList = new LinkedList<>();
        List<Json> edgeJson = new LinkedList<>();
        List<Json> propJson = new LinkedList<>();

        ScalaVertex vertex = new ScalaVertex(method.underlying());
        GremlinScala<Vertex> outV = vertex.out(singleStringToSeq(EdgeTypes.CONTAINS));
        scala.collection.immutable.List<Vertex> l = outV.l();
        Set<Vertex> vset = new HashSet<>();
        java.util.Iterator<Vertex> javaIter = (java.util.Iterator<Vertex>) CollectionConverters.IteratorHasAsJava(l.iterator()).asJava();
        javaIter.forEachRemaining(vertex1 -> vset.add(vertex1));
        vset.add(method);
        System.out.println(method.name() + " -> " + method._cfgOut().next().toString());
        Iterator<Vertex> i = l.iterator();
        while (i.hasNext()) {
            Vertex vv = i.next();
            edgeJson.clear();
            propJson.clear();
            System.out.println("  * " + vv.label() + " " + vv.toString());
            JsonObject vidJson = JsonObject.singleton("id", Json.fromString(vv.toString()));
            Tuple2<String, Json> vJsonT = new Tuple2<>("id", Json.fromString(vv.toString()));

            ScalaVertex gvtx = new ScalaVertex(vv);
            GremlinScala<Edge> inE = gvtx.inE(singleStringToSeq(EdgeTypes.CFG));
            GremlinScala<Edge> outE = gvtx.outE(singleStringToSeq(EdgeTypes.CFG));
            Iterator<Edge> inIter = inE.toIterator();
            while (inIter.hasNext()) {
                Edge in = inIter.next();
                Vertex inv = in.inVertex();
                Vertex outv = in.outVertex();
                //if (vset.contains(inv) && vset.contains(outv)) {
                    Tuple2<String, Json> eid = new Tuple2<String, Json>("id", Json.fromString(in.toString()));
                    Tuple2<String, Json> inj = new Tuple2<String, Json>("in", Json.fromString(inv.toString()));
                    Tuple2<String, Json> outj = new Tuple2<String, Json>("out", Json.fromString(outv.toString()));
                    Json inJson = Json.obj(tuplesToSeq(eid, inj, outj));
                    edgeJson.add(inJson);
                //}
            }
            Iterator<Edge> outIter = outE.toIterator();
            while (outIter.hasNext()) {
                Edge out = outIter.next();
                Vertex inv = out.inVertex();
                Vertex outv = out.outVertex();
                //if (vset.contains(inv) && vset.contains(outv)) {
                    Tuple2<String, Json> eid = new Tuple2<String, Json>("id", Json.fromString(out.toString()));
                    Tuple2<String, Json> inj = new Tuple2<String, Json>("in", Json.fromString(inv.toString()));
                    Tuple2<String, Json> outj = new Tuple2<String, Json>("out", Json.fromString(outv.toString()));
                    Json outJson = Json.obj(tuplesToSeq(eid, inj, outj));
                    edgeJson.add(outJson);
                //}
            }
            Json edgeJ = Json.fromValues(javaCollToSeq(edgeJson));
            Tuple2<String, Json> eJsonT = new Tuple2<>("edges", edgeJ);

            java.util.Iterator<VertexProperty<Object>> pps = vv.properties(new String[0]);
            while (pps.hasNext()) {
                VertexProperty<Object> prop = pps.next();
                Tuple2<String, Json> kJson = new Tuple2<String, Json>("key", Json.fromString(prop.key()));
                Tuple2<String, Json> vJson = new Tuple2<String, Json>("value", Json.fromString(prop.value().toString()));
                Json pJson = Json.obj(tuplesToSeq(kJson, vJson));
                propJson.add(pJson);
            }
            Json propJ = Json.fromValues(javaCollToSeq(propJson));
            Tuple2<String, Json> pJsonT = new Tuple2<>("properties", propJ);

            Json vertexJ = Json.obj(tuplesToSeq(vJsonT, eJsonT, pJsonT));
            cfgList.add(vertexJ);
        }

        Json cfgJ = Json.fromValues(javaCollToSeq(cfgList));
        Tuple2<String, Json> cJson = new Tuple2<String, Json>("CFG", cfgJ);
        return Json.obj(tuplesToSeq(fJson, midJson, cJson));
    }

    void iterateAndDump() throws IOException {
        List<File> cpgFiles = new LinkedList<>();
        File root = new File(mPath);
        getFiles(root, cpgFiles);
        if (cpgFiles.isEmpty()) {
            System.out.println("No CPG (.bin.zip) files are found. Program exits.");
            return;
        }
        for (File f : cpgFiles) {
            Cpg cpg = CpgLoader.load(f.getAbsolutePath(), null);
            NodeTypeStarters nts = new NodeTypeStarters(cpg);
            scala.collection.immutable.List<String> correspondingFiles = nts.file().name().l();
            if (correspondingFiles.isEmpty())
                continue;
            String corrFile = correspondingFiles.head();
            int idxOfDot = corrFile.lastIndexOf('.');
            File cfgFile = new File(corrFile.substring(0, idxOfDot) + "_cfg.json");
            /*if (cfgFile.exists() && cfgFile.lastModified() >= f.lastModified())
                continue;*/
////////////////////////////////////////////////////////////////////////////////避免重复计算
            Method method = nts.method();
            scala.collection.immutable.List<io.shiftleft.codepropertygraph.generated.nodes.Method> mns = method.l();
            Iterator<io.shiftleft.codepropertygraph.generated.nodes.Method> iter = mns.iterator();
            List<io.shiftleft.codepropertygraph.generated.nodes.Method> topMethods = new LinkedList<>();
            while (iter.hasNext()) {
                io.shiftleft.codepropertygraph.generated.nodes.Method m = iter.next();
                System.err.println(m.fullName() + "  " + m._cfgIn().hasNext() + " " + m._cfgOut().hasNext());
                if (!m.fullName().contains("<operator>") && m._cfgOut().hasNext()) {
                    topMethods.add(m);
                }
            }


            List<Json> funcJson = new LinkedList<>();

            int nm = topMethods.size();
            int midx = 0;
            for (io.shiftleft.codepropertygraph.generated.nodes.Method v : topMethods) {
                Json s = cfg2Json(v);
                funcJson.add(s);
            }
            FileWriter writer = new FileWriter(cfgFile);
            JsonObject jo = JsonObject.singleton("functions", Json.fromValues(javaCollToSeq(funcJson)));
            writer.write(Json.fromJsonObject(jo).toString());
            writer.flush();
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String t = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test";  //original code hjj
        //Original address（hjj）:String t = "D:\\Workspace\\RobustParser\\rp\\rp_c\\test1\\Workspace\\RobustParser\\rp";  mark20211017
        DumpCFG c = new DumpCFG(t);
        c.iterateAndDump();
    }
}
