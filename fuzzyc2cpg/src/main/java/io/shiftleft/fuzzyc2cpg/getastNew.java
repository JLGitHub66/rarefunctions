package io.shiftleft.fuzzyc2cpg;

import io.shiftleft.fuzzyc2cpg.ast.*;
import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.AstNodeBuilder;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.IfStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.CompoundStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.Statement;
import io.shiftleft.fuzzyc2cpg.cfg.AstToCfgConverter;
import io.shiftleft.fuzzyc2cpg.parser.AntlrParserDriverObserver;
import io.shiftleft.fuzzyc2cpg.parser.TokenSubStream;
import io.shiftleft.fuzzyc2cpg.parser.modules.AntlrCModuleParserDriver;

//mk
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import io.shiftleft.fuzzyc2cpg.ast.CodeLocation;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import io.shiftleft.fuzzyc2cpg.ModuleParser;

import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class getastNew {

    public static void main(String args[]) throws IOException {
        String input = "";
        String str = "";
        BufferedReader bufferR = null;
        //String path = args[0]; //original code hjj  测试时，修改为直接在代码中输入文件路径
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/testC-for-getCFG"; //test path
        String path = "/media/nie/Element/代码解析/testFile";//for niejianglei false output
        //String path = "/Volumes/TOSHIBA_MK/test-linux/linux-5.16"; //test path
        //String path = "/Volumes/TOSHIBA_MK/Project-testing/test-linux-kernel/linux-5.16"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test"; //test path
        //String path = "/Users/hellomark/Desktop/progex-test/test-c"; //test path 20220517
        //String path = "/Users/hellomark/Desktop/test_c_20220411"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test_c++_preprocessed_llvm14.0.1_bolt_lib_Core_part"; //test c++

        System.out.println("getast-- 输入路径：" + path); //输出文件所在位置
        List<String> filename = new ArrayList<>();  //存储路径中所有的file
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件  //20220418，添加了对c++的支持
        System.out.println("getast-- 当前路径下源码文件：\n" + filename);
        System.out.println("getast-- 当前路径下包含特定类型的文件的个数: " + filename.size());

        for(int i = 0; i < filename.size(); i++){ //逐个文件，遍历生成ast
            input = "";
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
            System.out.println("getast-- TIME:" + df.format(new Date()));
            System.out.println("getast-- 正在遍历第" + (i+1) + "个文件：" + filename.get(i));
            PrintStream ps = new PrintStream(filename.get(i) + ".ast"); //输出流的文件名修改为.ast文件
            System.out.println("getast-- 导出ast：" + filename.get(i) + ".ast");

            bufferR = new BufferedReader(new FileReader(filename.get(i)));//获取所有的流信息，然后存入bufferR
            while ((str = bufferR.readLine())!= null){
                //str = replace_escape_character(str);
                input = input + str + System.getProperty("line.separator");
            }//逐行把程序代码存入input
            bufferR.close();//关闭流bufferedreader
            List<AstNode> codeItems = parseInput(input); //开始调用函数parseInput
            Iterator it = codeItems.iterator();

            PrintStream out = System.out;//把system的输出转到printstream上面
            System.setOut(ps);

            while(it.hasNext()) {
                AstNode node = (AstNode) it.next();
                printAST(node, 0);
            }
            System.setOut(out);
        }
    }

    //替换转义字符
    public static String replace_escape_character(String original_str){
        String replaced_str;

        replaced_str=original_str.replace("\\","\\\\");
        replaced_str=replaced_str.replace("\"","\\\"");
        replaced_str=replaced_str.replace("\t","");
        replaced_str=replaced_str.replace("\n","");
        replaced_str=replaced_str.replace("\r","");
        replaced_str=replaced_str.replace("\0","\\0");

        return replaced_str;
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

    public static List<AstNode> parseInput(String input) { //主要的调用函数
        AntlrCModuleParserDriver parser = new AntlrCModuleParserDriver();
        AntlrParserDriverObserverNewTest testProcessor = new AntlrParserDriverObserverNewTest();
        parser.addObserver(testProcessor);

        CharStream inputStream = CharStreams.fromString(input); //original
        //ANTLRInputStream inputStream = new ANTLRInputStream(input);
        ModuleLexer lex = new ModuleLexer(inputStream);//输入流
        //CLexer lex = new CLexer(inputStream);
        TokenSubStream tokens = new TokenSubStream(lex);//词法分析，转为token
        parser.parseAndWalkTokenStream(tokens); //遍历tokens
        return testProcessor.codeItems; //返回处理得到的codeitems
    }

    public static void printAST(AstNode node, int layer) {
        int layer_temp = layer;
        int flag = 0;

        for(int i = 0; i < layer; i++)
            System.out.print('\t');

        if(node.getTypeAsString().equals("ClassDefStatement")){
            ClassDefStatement n = (ClassDefStatement) node;
            //System.out.println(n.getEscapedCodeStr());
            CompoundStatement cs = n.content;
            CodeLocation location = node.getLocation();///////////////添加location
            if (location.startLine().isEmpty()) {
                System.out.println("None:ClassDef:" + n.getIdentifier().getEscapedCodeStr());
                node.setNodeStartLine(-1,node);//添加node的line/////////////
            }
            else {
                int startlineSome = (int) location.startLine().get();
                System.out.println(startlineSome + ":ClassDef:" + n.getIdentifier().getEscapedCodeStr());
                node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
            }///////////////添加location
            printAST(cs, layer_temp + 1);
        }
        if(!node.getTypeAsString().equals("ClassDefStatement")) {
            if (node.getTypeAsString().equals("IfStatement")) {
                IfStatement ifItem = (IfStatement) node;

                CodeLocation location = node.getLocation();///////////////添加location
                if (location.startLine().isEmpty()) {
                    System.out.println("None:" + node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                    node.setNodeStartLine(-1,node);//添加node的line/////////////
                }
                else {
                    int startlineSome = (int) location.startLine().get();
                    System.out.println(startlineSome + ":" + node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location

                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        printAST((AstNode) children.next(), layer_temp + 1);

                    }
                }
                if (ifItem.getElseNode() != null){
                    for(int i = 0; i < layer; i++)
                        System.out.print('\t');
                    System.out.println("ElseStatement : else");
                    Statement s = ifItem.getElseNode().getStatement();
                    while(s.getTypeAsString().equals("IfStatement")){
                        IfStatement ifs = (IfStatement) s;
                        for(int i = 0; i < layer; i++)
                            System.out.print('\t');
                        location = s.getLocation();///////////////添加location
                        if (location.startLine().isEmpty()) {
                            System.out.println("None:" + s.getTypeAsString() + ":" + s.getEscapedCodeStr());
                            node.setNodeStartLine(-1,node);//添加node的line/////////////
                        }
                        else {
                            int startlineSome = (int) location.startLine().get();
                            System.out.println(startlineSome + ":" + s.getTypeAsString() + ":" + s.getEscapedCodeStr());
                            node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                        }///////////////添加location
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                printAST((AstNode) children.next(), layer_temp + 1);

                            }
                        }
                        if(ifs.getElseNode() != null){
                            s = ifs.getElseNode().getStatement();
                        }
                        else{
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        for(int i = 0; i < layer; i++)
                            System.out.print('\t');
                        location = node.getLocation();///////////////添加location
                        if (location.startLine().isEmpty()) {
                            System.out.println("None:" + node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                            node.setNodeStartLine(-1,node);//添加node的line/////////////
                        }
                        else {
                            int startlineSome = (int) location.startLine().get();
                            System.out.println(startlineSome + ":" + s.getTypeAsString() + ":" + s.getEscapedCodeStr());
                            node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                        }///////////////添加location
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                printAST((AstNode) children.next(), layer_temp + 1);
                            }
                        }
                    }
                }

            }
            else{
                CodeLocation location = node.getLocation();///////////////添加location
                if (location.startLine().isEmpty()) {
                    System.out.println("None:" + node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                    node.setNodeStartLine(-1,node);//添加node的line/////////////
                }
                else {
                    int startlineSome = (int) location.startLine().get();
                    System.out.println(startlineSome + ":" + node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        printAST((AstNode) children.next(), layer_temp + 1);
                    }
                }
            }
        }
    }
}

class AntlrParserDriverObserverNewTest implements AntlrParserDriverObserver {

    public List<AstNode> codeItems;

    public AntlrParserDriverObserverNewTest() {
        codeItems = new LinkedList<>();
    }

    @Override
    public void begin() {

    }

    @Override
    public void end() {

    }

    @Override
    public void startOfUnit(ParserRuleContext ctx, String filename)
    {

    }

    @Override
    public void endOfUnit(ParserRuleContext ctx, String filename)
    {

    }

    @Override
    public <T extends AstNode> void processItem(T item, Stack<AstNodeBuilder<? extends AstNode>> builderStack)
    {
        codeItems.add(item);
    }
    //New
}