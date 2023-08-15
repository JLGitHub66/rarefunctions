package io.shiftleft.fuzzyc2cpg;

import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.AstNodeBuilder;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.IfStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.CompoundStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.Statement;
import io.shiftleft.fuzzyc2cpg.parser.AntlrParserDriverObserver;
import io.shiftleft.fuzzyc2cpg.parser.TokenSubStream;
import io.shiftleft.fuzzyc2cpg.parser.modules.AntlrCModuleParserDriver;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.*;
import java.util.*;


class TestAntlrParserDriverObserver implements AntlrParserDriverObserver
{

    public List<AstNode> codeItems;

    public TestAntlrParserDriverObserver()
    {
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

}


public class getast {

    private static List<String> getFile(String path, List<String> filename) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                if(array[i].getPath().endsWith(".c")) {
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




    public static void printAST(AstNode node, int layer){
        int c = layer;
        int flag = 0;
        for(int i = 0; i < layer; i++)
            System.out.print('\t');
        if(node.getTypeAsString().equals("ClassDefStatement")){
            ClassDefStatement n = (ClassDefStatement) node;
            System.out.println("ClassDef:" + n.getIdentifier().getEscapedCodeStr());
            //System.out.println(n.getEscapedCodeStr());
            CompoundStatement cs = n.content;
            printAST(cs, c + 1);
        }
        if(!node.getTypeAsString().equals("ClassDefStatement")) {
            if (node.getTypeAsString().equals("IfStatement")) {
                IfStatement ifItem = (IfStatement) node;
                System.out.println(node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        printAST((AstNode) children.next(), c + 1);

                    }
                }
                if(ifItem.getElseNode() != null){
                    for(int i = 0; i < layer; i++)
                        System.out.print('\t');
                    System.out.println("ElseStatement : else");
                    Statement s = ifItem.getElseNode().getStatement();
                    //System.out.println(s.getTypeAsString());
                    while(s.getTypeAsString().equals("IfStatement")){
                        IfStatement ifs = (IfStatement) s;
                        for(int i = 0; i < layer; i++)
                            System.out.print('\t');
                        System.out.println(s.getTypeAsString() + ":" + s.getEscapedCodeStr());
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                printAST((AstNode) children.next(), c + 1);

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
                        System.out.println(s.getTypeAsString() + ":" + s.getEscapedCodeStr());
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                printAST((AstNode) children.next(), c + 1);
                            }
                        }
                    }
                }

            }
            else{
                System.out.println(node.getTypeAsString() + ":" + node.getEscapedCodeStr());
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        printAST((AstNode) children.next(), c + 1);

                    }
                }
            }
        }

    }

    public static List<AstNode> parseInput(String input) {
        AntlrCModuleParserDriver parser = new AntlrCModuleParserDriver();
        TestAntlrParserDriverObserver testProcessor = new TestAntlrParserDriverObserver();
        parser.addObserver(testProcessor);

        CharStream inputStream = CharStreams.fromString(input);
        ModuleLexer lex = new ModuleLexer(inputStream);
        TokenSubStream tokens = new TokenSubStream(lex);

        parser.parseAndWalkTokenStream(tokens);
        return testProcessor.codeItems;
    }

    public static void main(String args[]) throws IOException {
        String input = "";
        String str = "";
        BufferedReader bre = null;
        //String path = args[0]; //original code hjj  测试时，修改为直接在代码中输入文件路径
        String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test"; //Temporary test mark20211121
        System.out.println("分析文件所在位置：" + path);
        List<String> filename = new ArrayList<>();  //存储路径中所有的
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件
        System.out.println(filename);
        System.out.println("文件名（路径）：" + filename);
        System.out.println("路径下包含特定类型的文件的个数: " + filename.size());
        for(int i = 0; i < filename.size(); i ++){ //逐个文件，遍历生成ast
            input = "";
            System.out.println("正在遍历第" + (i+1) + "个文件：" + filename.get(i));
            PrintStream ps = new PrintStream(filename.get(i) + ".ast");
            System.out.println("导出的文件的ast名称：" + filename.get(i) + ".ast");
            PrintStream out = System.out;
            System.setOut(ps);
            bre = new BufferedReader(new FileReader(filename.get(i)));
            while ((str = bre.readLine())!= null){
                input = input + str + "\r\n";
            }
            bre.close();
            List<AstNode> codeItems = parseInput(input);
            Iterator it = codeItems.iterator();
            while(it.hasNext()) {
                AstNode node = (AstNode) it.next();
                printAST(node, 0);
            }
            System.setOut(out);
        }
    }

}


