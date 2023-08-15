//Just for c (not yet c++), because grammar just supports C.(antlr4 grammar C)
//Just ignore java for now ...(so easy)
package progex.graphs.cfg;

import ghaffarian.graphs.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import io.shiftleft.fuzzyc2cpg.*;
import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import progex.graphs.cfg.CFEdge;
import progex.graphs.cfg.CFNode;
import progex.graphs.cfg.ControlFlowGraph;

//import ghaffarian.progex.java.parser.JavaBaseVisitor;
//import ghaffarian.progex.java.parser.JavaLexer;
//import ghaffarian.progex.java.parser.JavaParser;

import ghaffarian.nanologger.Logger;


public class getCFG{
    public static void main(String args[]) throws IOException {
        //String input = "";
        String str = "";
        BufferedReader bufferR = null;
        //String path = args[0]; //original code hjj  测试时，修改为直接在代码中输入文件路径
        String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/testC-for-getCFG"; //test path
        //String path = "/Volumes/TOSHIBA_MK/test-linux/linux-5.16"; //test path
        //String path = "/Volumes/TOSHIBA_MK/Project-testing/test-linux-kernel/linux-5.16"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test"; //test path
        //String path = "/Users/hellomark/Desktop/test_c_20220411"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test_c++_preprocessed_llvm14.0.1_bolt_lib_Core_part"; //test c++


        System.out.println("getCFG-- 输入路径：" + path); //输出文件所在位置
        List<String> filename = new ArrayList<>();  //存储路径中所有的file
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件  //20220418，添加了对c++的支持
        System.out.println("getCFG-- 当前路径下源码文件：\n" + filename);
        System.out.println("getast-- 当前路径下包含特定类型的文件的个数: " + filename.size());


        for(int i = 0; i < filename.size(); i++){ //逐个文件，遍历生成ast
            //input = "";
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
            System.out.println("\n\ngetCFG-- TIME:" + df.format(new Date()));
            System.out.println("getCFG-- 正在遍历第" + (i+1) + "个文件：" + filename.get(i));
            System.out.println("getCFG-- 导出cfg：" + filename.get(i) + ".-CFGNEW.json");

            File cFileTemp = new File(filename.get(i));

            if (!cFileTemp.getName().endsWith(".c"))
                throw new IOException("Not a C File!");
            InputStream inFile = new FileInputStream(cFileTemp);
            ANTLRInputStream input = new ANTLRInputStream(inFile);
            CLexer lexer = new CLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CParser parser = new CParser(tokens);
            ParseTree tree = parser.compilationUnit();  //参考的代码，存疑
            // 启动语法分析，获取语法树(根节点)  参考来自csdn：【ANTLR学习笔记】4：语法导入和访问者(Visitor)模式
            // https://lauzyhou.blog.csdn.net/article/details/106331151?spm=1001.2101.3001.6650.3&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-3-106331151-blog-108911828.topblog&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-3-106331151-blog-108911828.topblog&utm_relevant_index=6

            try{
                ControlFlowGraph cfgTemp = build(cFileTemp.getName(), tree, null, null); //开始处理，并生成对应的cfg
                cfgTemp.export("JSON",filename.get(i).substring(0,filename.get(i).lastIndexOf(File.separator))); //根据生成的cfg，生成对应需求的格式
                System.out.println("finish!!!!!!!!!!!!");
            } catch (IOException ex) {
                Logger.error(ex);
            }





        }
    }



    /**
     * ‌Build and return the Control Flow Graph (CFG) for the given Parse-Tree.
     * The 'ctxProps' map includes contextual-properties for particular nodes
     * in the parse-tree, which can be used for linking this graph with other
     * graphs by using the same parse-tree and the same contextual-properties.
     */
    public static ControlFlowGraph build(String cFileName, ParseTree tree, String propKey, Map<ParserRuleContext, Object> ctxProps) {
        ControlFlowGraph cfg = new ControlFlowGraph(cFileName);
        ControlFlowVisitor visitor = new ControlFlowVisitor(cfg, propKey, ctxProps);
        visitor.visit(tree);
        return cfg;
    }





    private static class ControlFlowVisitor extends CBaseVisitor<Void> {

        private ControlFlowGraph cfg;
        private Deque<CFNode> preNodes;
        private Deque<CFEdge.Type> preEdges;
        private Deque<Block> loopBlocks;
        private List<Block> labeledBlocks;
        private Deque<Block> tryBlocks;
        private Queue<CFNode> casesQueue;
        private boolean dontPop;
        private String propKey;
        private Map<ParserRuleContext, Object> contexutalProperties;
        private Deque<String> functionNames;

        public ControlFlowVisitor(ControlFlowGraph cfg, String propKey, Map<ParserRuleContext, Object> ctxProps) {
            preNodes = new ArrayDeque<>();
            preEdges = new ArrayDeque<>();
            loopBlocks = new ArrayDeque<>();
            labeledBlocks = new ArrayList<>();
            tryBlocks = new ArrayDeque<>();
            casesQueue = new ArrayDeque<>();
            functionNames = new ArrayDeque<>();
            dontPop = false;
            this.cfg = cfg;
            //
            this.propKey = propKey;
            contexutalProperties = ctxProps;
        }

        /**
         * Reset all data-structures and flags for visiting a new method declaration.
         */
        private void init() {
            preNodes.clear();
            preEdges.clear();
            loopBlocks.clear();
            labeledBlocks.clear();
            tryBlocks.clear();
            dontPop = false;
        }

        /**
         * Add contextual properties to the given node.
         * This will first check to see if there is any property for the
         * given context, and if so, the property will be added to the node.
         */
        private void addContextualProperty(CFNode node, ParserRuleContext ctx) {
            if (propKey != null && contexutalProperties != null) {
                Object prop = contexutalProperties.get(ctx);
                if (prop != null)
                    node.setProperty(propKey, prop);
            }
        }






        ///////////////////////start————override方法，对basevisitor中的方法进行重写————mark2022.5.15///////////////////////



        ///////////////////////end————override方法，对basevisitor中的方法进行重写————mark2022.5.15///////////////////////






        /**
         * Get resulting Control-Flow-Graph of this CFG-Builder.
         */
        public ControlFlowGraph getCFG() {
            return cfg;
        }

        /**
         * Add this node to the CFG and create edge from pre-node to this node.
         */
        private void addNodeAndPreEdge(CFNode node) {
            cfg.addVertex(node);
            popAddPreEdgeTo(node);
        }

        /**
         * Add a new edge to the given node, by poping the edge-type of the stack.
         */
        private void popAddPreEdgeTo(CFNode node) {
            if (dontPop)
                dontPop = false;
            else {
                Logger.debug("\nPRE-NODES = " + preNodes.size());
                Logger.debug("PRE-EDGES = " + preEdges.size() + '\n');
                cfg.addEdge(new Edge<>(preNodes.pop(), new CFEdge(preEdges.pop()), node));
            }
            //
            for (int i = casesQueue.size(); i > 0; --i)
                cfg.addEdge(new Edge<>(casesQueue.remove(), new CFEdge(CFEdge.Type.TRUE), node));
        }

        /**
         * Get the original program text for the given parser-rule context.
         * This is required for preserving whitespaces.
         */
        private String getOriginalCodeText(ParserRuleContext ctx) {
            int start = ctx.start.getStartIndex();
            int stop = ctx.stop.getStopIndex();
            Interval interval = new Interval(start, stop);
            return ctx.start.getInputStream().getText(interval);
        }

        /**
         * A simple structure for holding the start, end, and label of code blocks.
         * These are used to handle 'break' and 'continue' statements.
         */
        private class Block {

            public final String label;
            public final CFNode start, end;

            Block(CFNode start, CFNode end, String label) {
                this.start = start;
                this.end = end;
                this.label = label;
            }

            Block(CFNode start, CFNode end) {
                this(start, end, "");
            }
        }
    }





    private static List<String> getFile(String path, List<String> filename) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                if(array[i].getPath().endsWith(".c")||array[i].getPath().endsWith(".cpp")||array[i].getPath().endsWith(".cc")) {
                    //System.out.println(array[i].getPath());
                    filename.add(array[i].getPath());
                }
                //System.out.println(array[i].getPath());
            } else if (array[i].isDirectory()) {
                filename = getFile(array[i].getPath(), filename);
            }
        }
        return filename;
    }
}