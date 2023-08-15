package io.shiftleft.fuzzyc2cpg;

import io.shiftleft.fuzzyc2cpg.ast.*;
import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.AstNodeBuilder;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.expressions.*;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.FunctionDefBase;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.CallExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.SizeofExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.ElseStatement;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.IfStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.*;
import io.shiftleft.fuzzyc2cpg.ast.statements.ExpressionStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.IdentifierDeclStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.*;
import io.shiftleft.fuzzyc2cpg.ast.statements.jump.*;
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

public class getSequenceWithLineNumber {

    public static void main(String args[]) throws IOException {
        String path = "D:\\其他系统\\test"; //original code hjj  测试时，修改为直接在代码中输入文件路径
        //String path = "/Users/hellomark/Desktop/progex-test/test-c"; //test path 20220517
        //String path = "/Volumes/TOSHIBA_MK/test-linux/linux-5.16"; //test path
        //String path = "/Volumes/TOSHIBA_MK/Project-testing/test-linux-kernel/linux-5.16"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test"; //test path
        //String path = "/Users/hellomark/Desktop/test_c_20220411"; //test path
        //String path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test_preprocessed_llvm14.0.1_bolt_lib_Core_part"; //test c++

        System.out.println("getSequence-- 输入路径：" + path); //输出文件所在位置
        List<String> filename = new ArrayList<>();  //存储路径中所有的file
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件
        System.out.println("getSequence-- 当前路径下源码文件：\n" + filename);
        System.out.println("getSequence-- 当前路径下包含特定类型的文件的个数: " + filename.size());


        for(int i = 0; i < filename.size(); i++){ //逐个文件，遍历生成ast

            try{

                String input = "";
                String str = "";
                BufferedReader bufferR = null;
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
                Date date1=new Date();
                System.out.println("getSequence-- TIME: " + df.format(date1));
                System.out.println("getSequence-- 正在遍历第" + (i+1) + "个文件：" + filename.get(i));
                PrintStream ps = new PrintStream(filename.get(i) + ".out"); //输出流的文件名修改为.out文件
                bufferR = new BufferedReader(new FileReader(filename.get(i)));//获取所有的流信息，然后存入bufferR
                while ((str = bufferR.readLine())!= null){
                    input = input + str + System.getProperty("line.separator");
                }//逐行把程序代码存入input
                bufferR.close();//关闭流bufferedreader
                List<AstNode> codeItems = parseInput(input); //开始调用函数parseInput
                Iterator it = codeItems.iterator();
                PrintStream out = System.out;//把system的输出转到printstream上面

                System.setOut(ps);
                while(it.hasNext()) {
                    try{
                        AstNode node = (AstNode) it.next();
                        if(node.getTypeAsString().equals("FunctionDef")){
                            printSequence(node, 0,0);
                            System.out.print("\n");
                        }
                    } catch (Exception e){
                        continue;
                    }
                }
                System.setOut(out);

                ps.close();//新加的
                Date date2=new Date();
                System.out.println("getSequence-- TIME: " + df.format(date2));
                System.out.println("getSequence-- 导出out：" + filename.get(i) + ".out");

                long l = date2.getTime() - date1.getTime();
                long day=l/(24*60*60*1000);
                long hour=(l/(60*60*1000)-day*24);
                long min=((l/(60*1000))-day*24*60-hour*60);
                long s=(l/1000-day*24*60*60-hour*60*60-min*60);
                if(day>0){
                    System.out.println("getSequence-- 导出out耗时: "+day+"day"+hour+"hour"+min+"min"+s+"s\n");
                }else if(hour>0){
                    System.out.println("getSequence-- 导出out耗时: "+hour+"hour"+min+"min"+s+"\n");
                }else if(min>0){
                    System.out.println("getSequence-- 导出out耗时: "+min+"min"+s+"s\n");
                }else{
                    System.out.println("getSequence-- 导出out耗时: "+s+"s\n");
                }

                codeItems.clear();

            } catch (Exception e){
                continue;
            }
        }
    }

    private static List<String> getFile(String path, List<String> filename) {  //在这里暂时设置为对c和c++都支持，但是实际上整个程序目前只是支持c文件
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
                filename = getFile(array[i].getPath(), filename);  //在这里暂时设置为对c和c++都支持，但是实际上整个程序目前只是支持c文件
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
        //CNewLexer lex = new CNewLexer(inputStream);
        //CLexer lex = new CLexer(inputStream);
        TokenSubStream tokens = new TokenSubStream(lex);//词法分析，转为token


        parser.parseAndWalkTokenStream(tokens); //遍历tokens

        //这一句出现的问题，Stack的问题，不够大


        return testProcessor.codeItems; //返回处理得到的codeitems
    }

    //替换转义字符
    public static String replace_escape_character(String original_str){
        String replaced_str;
        if(original_str==null){
            replaced_str="null";
        }else{
            replaced_str=original_str.replace("\t","");
            replaced_str=replaced_str.replace("\n","");
            replaced_str=replaced_str.replace("\r","");
            //replaced_str=replaced_str.replace("\\0","@");
        }
        return replaced_str;
    }

    public static void printSequence(AstNode node, int layer, int line_pre_level) {
        int current_line;
        int layer_temp = layer;
        int flag = 0;

        //处理行号输出
        boolean if_this_nodeLine_empty = false;
        CodeLocation location_for_judge = node.getLocation();
        if (location_for_judge.startLine().isEmpty()){
            if_this_nodeLine_empty = true;
        }





        if(node.getTypeAsString().equals("ClassDefStatement")){
            ClassDefStatement n = (ClassDefStatement) node;
            //System.out.println(n.getEscapedCodeStr());
            CompoundStatement cs = n.content;
            CodeLocation location = node.getLocation();///////////////添加location
            if (location.startLine().isEmpty()) {
                //System.out.println("#########:"+"None:ClassDef:" + n.getIdentifier().getEscapedCodeStr());

                ///////////////////修改固定输出
                if(node.getTypeAsString().equals("ClassDefStatement")){
                    ClassDefStatement node_temp = (ClassDefStatement) node;
                    //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getIdentifier().getEscapedCodeStr()+"; ");
                    //printSequence(cs, layer_temp + 1);
                }
                ///////////////////修改固定输出

                node.setNodeStartLine(-1,node);//添加node的line/////////////
            }
            else {
                int startlineSome = (int) location.startLine().get();
                //System.out.println("#########:"+startlineSome + ":ClassDef:" + n.getIdentifier().getEscapedCodeStr());

                ///////////////////修改固定输出
                if(node.getTypeAsString().equals("ClassDefStatement")){
                    ClassDefStatement node_temp = (ClassDefStatement) node;
                    //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getIdentifier().getEscapedCodeStr()+"; ");
                }
                ///////////////////修改固定输出

                node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                //printSequence(cs, layer_temp + 1,startlineSome);
            }///////////////添加location
        }
        if(!node.getTypeAsString().equals("ClassDefStatement")) {
            if (node.getTypeAsString().equals("IfStatement")) {
                IfStatement ifItem = (IfStatement) node;

                CodeLocation location = node.getLocation();///////////////添加location
                if (location.startLine().isEmpty()) {
                    if(node.getTypeAsString().equals("CatchList")){
                        current_line=0;
                    }
                    else{
                        current_line=-1;
                    }
                    //System.out.println("#########:"+"None:" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));

                    ///////////////////修改固定输出
                    if(node.getTypeAsString().equals("IfStatement")){
                        IfStatement node_temp = (IfStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:
                            /*while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                    sign_if_has_Condition=i;
                                    break;
                                }
                                i++;
                            }*/
                            if(sign_if_has_Condition>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }
                    ///////////////////修改固定输出

                    node.setNodeStartLine(-1,node);//添加node的line/////////////
                }
                else {
                    int startlineSome = (int) location.startLine().get();
                    current_line=startlineSome;
                    //System.out.println("#########:"+startlineSome + ":" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));

                    ///////////////////修改固定输出
                    IfStatement node_temp = (IfStatement) node;
                    if(node_temp.getChildCount()!=0){
                        int i=0;
                        int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:
                        /*while(i<node_temp.getChildCount()){
                            if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                sign_if_has_Condition=i;
                                break;
                            }
                            i++;
                        }*/
                        if(sign_if_has_Condition>=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    ///////////////////修改固定输出

                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location

                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        try{
                            if (location.startLine().isEmpty()) {
                                printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                            }else{
                                printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                            }
                        } catch (Exception e){
                            continue;
                        }
                    }
                }
                if (ifItem.getElseNode() != null){

                    //System.out.println("#########:"+"ElseStatement : else");

                    //System.out.print("\nElseStatement: else; ");
                    Statement s = ifItem.getElseNode().getStatement();
                    while(s.getTypeAsString().equals("IfStatement")){
                        IfStatement ifs = (IfStatement) s;

                        location = s.getLocation();///////////////添加location
                        if (location.startLine().isEmpty()) {
                            if(node.getTypeAsString().equals("CatchList")){
                                current_line=0;
                            }
                            else{
                                current_line=-1;
                            }
                            //System.out.println("#########:"+"None:" + s.getTypeAsString() + ":" + replace_escape_character(s.getEscapedCodeStr()));

                            ///////////////////修改固定输出
                            if(node.getTypeAsString().equals("IfStatement")){
                                IfStatement node_temp = (IfStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:
                                    /*while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                            sign_if_has_Condition=i;
                                            break;
                                        }
                                        i++;
                                    }*/
                                    if(sign_if_has_Condition>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                        }
                                        System.out.print("ElseStatement: else; "+node_temp.getTypeAsString()+": ");
                                    }
                                }
                            }
                            ///////////////////修改固定输出

                            node.setNodeStartLine(-1,node);//添加node的line/////////////
                        }
                        else {
                            int startlineSome = (int) location.startLine().get();
                            current_line=startlineSome;
                            //System.out.println("#########:"+startlineSome + ":" + s.getTypeAsString() + ":" + replace_escape_character(s.getEscapedCodeStr()));

                            ///////////////////修改固定输出
                            if(s.getTypeAsString().equals("IfStatement")){
                                IfStatement node_temp = (IfStatement) s;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:
                                    /*while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                            sign_if_has_Condition=i;
                                            break;
                                        }
                                        i++;
                                    }*/
                                    if(sign_if_has_Condition>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(!if_this_nodeLine_empty){
                                                System.out.print(startlineSome+": ");
                                            }
                                        }
                                        System.out.print("ElseStatement: else; "+node_temp.getTypeAsString()+": ");
                                    }
                                }
                            }
                            ///////////////////修改固定输出

                            node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                        }///////////////添加location
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                try{
                                    if (location.startLine().isEmpty()) {
                                        printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                                    }else{
                                        printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                                    }
                                } catch (Exception e){
                                    continue;
                                }
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


                    /////////////////////////////////////////////////////////////
                    if(s.getTypeAsString().equals("CompoundStatement")){
                        System.out.print("\n");

                        //////强制修改输出elsestatement行号，20220601
                        System.out.print(s.getLocation().startLine().get()+": ");

                        System.out.print("ElseStatement: else; ");
                    }
                    /////////////////////////////////////////////////////////////


                    if(flag == 0){

                        location = node.getLocation();///////////////添加location
                        if (location.startLine().isEmpty()) {
                            if(node.getTypeAsString().equals("CatchList")){
                                current_line=0;
                            }
                            else{
                                current_line=-1;
                            }
                            //System.out.println("#########:"+"None:" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));

                            ///////////////////修改固定输出
                            if(node.getTypeAsString().equals("FunctionDef")){
                                FunctionDefBase node_temp = (FunctionDefBase) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print("Function: "+node_temp.getName());
                            }
                            else if(node.getTypeAsString().equals("CompoundStatement")){
                                CompoundStatement node_temp = (CompoundStatement) node;

                                current_line=0;
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("ExpressionStatement")){
                                ExpressionStatement node_temp = (ExpressionStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("IdentifierDeclStatement")){
                                IdentifierDeclStatement node_temp = (IdentifierDeclStatement) node;
                                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_IdentifierDecl=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("IdentifierDecl")){
                                            sign_if_has_IdentifierDecl=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    int sign_if_has_IdentifierDeclType=-1;
                                    i=0;
                                    if(sign_if_has_IdentifierDecl>=0){
                                        if(node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()>0){
                                            while (i<node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()){
                                                if(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(i).getTypeAsString().equals("IdentifierDeclType")){
                                                    sign_if_has_IdentifierDeclType=i;
                                                    break;
                                                }
                                                i++;
                                            }
                                            if(sign_if_has_IdentifierDeclType>=0){
                                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                                    System.out.print("\n");
                                                    if(if_this_nodeLine_empty){
                                                        System.out.print("None: ");
                                                    }
                                                }
                                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                            }
                                        }
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("CallExpression")){
                                CallExpression node_temp = (CallExpression) node;
                                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Callee=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Callee")){
                                            sign_if_has_Callee=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    int sign_if_has_Identifier=-1;
                                    i=0;
                                    if(sign_if_has_Callee>=0){
                                        if(node_temp.getChild(sign_if_has_Callee).getChildCount()>0){
                                            if(sign_if_has_Callee>=0){
                                                while (i<node_temp.getChild(sign_if_has_Callee).getChildCount()){
                                                    if(node_temp.getChild(sign_if_has_Callee).getChild(i).getTypeAsString().equals("Identifier")){
                                                        sign_if_has_Identifier=i;
                                                        break;
                                                    }
                                                    i++;
                                                }
                                                if(sign_if_has_Identifier>=0){
                                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                                        System.out.print("\n");
                                                        if(if_this_nodeLine_empty){
                                                            System.out.print("None: ");
                                                        }
                                                    }
                                                    System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("ClassDef")){
                                ClassDefStatement node_temp = (ClassDefStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("TryStatement")){
                                TryStatement node_temp = (TryStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("CatchStatement")){
                                CatchStatement node_temp = (CatchStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("BreakStatement")){
                                BreakStatement node_temp = (BreakStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                            }
                            else if(node.getTypeAsString().equals("ContinueStatement")){
                                ContinueStatement node_temp = (ContinueStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                            }
                            else if(node.getTypeAsString().equals("ReturnStatement")){
                                ReturnStatement node_temp = (ReturnStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
                            }
                            else if(node.getTypeAsString().equals("IfStatement")){
                                IfStatement node_temp = (IfStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:
                                    /*while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                            sign_if_has_Condition=i;
                                            break;
                                        }
                                        i++;
                                    }*/
                                    if(sign_if_has_Condition>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(if_this_nodeLine_empty){
                                                System.out.print("None: ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": ");
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("ForStatement")){
                                ForStatement node_temp = (ForStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(if_this_nodeLine_empty){
                                            System.out.print("None: ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("GotoStatement")){
                                GotoStatement node_temp = (GotoStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Identifier=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Identifier")){
                                            sign_if_has_Identifier=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    if(sign_if_has_Identifier>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(if_this_nodeLine_empty){
                                                System.out.print("None: ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("JumpStatement")){
                                JumpStatement node_temp = (JumpStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("ThrowStatement")){
                                ThrowStatement node_temp = (ThrowStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("DoStatement")){
                                DoStatement node_temp = (DoStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(if_this_nodeLine_empty){
                                            System.out.print("None: ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("SwitchStatement")){
                                SwitchStatement node_temp = (SwitchStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(if_this_nodeLine_empty){
                                            System.out.print("None: ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("Label")){
                                Label node_temp = (Label) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print("LabelStatement: "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("WhileStatement")){
                                WhileStatement node_temp = (WhileStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryExpression")){
                                UnaryExpression node_temp = (UnaryExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                                UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }





                            ///////////////////计算符号处理
                            else if(node.getTypeAsString().equals("AssignmentExpression")){
                                AssignmentExpression node_temp = (AssignmentExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("PtrMemberAccess")){
                                PtrMemberAccess node_temp = (PtrMemberAccess) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                                System.out.print(node_temp.getTypeAsString()+"; ");
                            }
                            else if(node.getTypeAsString().equals("IncDec")){
                                IncDec node_temp = (IncDec) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                            }
                            else if(node.getTypeAsString().equals("InclusiveOrExpression")){
                                InclusiveOrExpression node_temp = (InclusiveOrExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("MultiplicativeExpression")){
                                MultiplicativeExpression node_temp = (MultiplicativeExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("BitAndExpression")){
                                BitAndExpression node_temp = (BitAndExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("AdditiveExpression")){
                                AdditiveExpression node_temp = (AdditiveExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                if(node_temp.getEscapedCodeStr().indexOf("+")>0){
                                    System.out.print(node_temp.getTypeAsString()+": "+"+"+"; ");
                                }
                                else if(node_temp.getEscapedCodeStr().indexOf("-")>0){
                                    System.out.print(node_temp.getTypeAsString()+": "+"-"+"; ");
                                }
                            }
                            else if(node.getTypeAsString().equals("BinaryExpression")){
                                BinaryExpression node_temp = (BinaryExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("BinaryOperationExpression")){
                                BinaryOperationExpression node_temp = (BinaryOperationExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("AndExpression")){
                                AndExpression node_temp = (AndExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("CastExpression")){
                                CastExpression node_temp = (CastExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("CastTarget")){
                                CastTarget node_temp = (CastTarget) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                            }
                            else if(node.getTypeAsString().equals("ConditionalExpression")){
                                ConditionalExpression node_temp = (ConditionalExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("Condition")){
                                Condition node_temp = (Condition) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(if_this_nodeLine_empty){
                                            System.out.print("None: ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("DoubleExpression")){
                                DoubleExpression node_temp = (DoubleExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("EqualityExpression")){
                                EqualityExpression node_temp = (EqualityExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("ExclusiveOrExpression")){
                                ExclusiveOrExpression node_temp = (ExclusiveOrExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("OrExpression")){
                                OrExpression node_temp = (OrExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("RelationalExpression")){
                                RelationalExpression node_temp = (RelationalExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("ShiftExpression")){
                                ShiftExpression node_temp = (ShiftExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                            }
                            else if(node.getTypeAsString().equals("SizeofExpression")){
                                SizeofExpression node_temp = (SizeofExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+"sizeof"+"; ");
                            }
                            else if(node.getTypeAsString().equals("UnaryOperator")){
                                UnaryOperator node_temp = (UnaryOperator) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                            }
                            ///////////////////计算符号处理

                            ///////////////////修改固定输出

                            node.setNodeStartLine(-1,node);//添加node的line/////////////
                        }
                        else {
                            int startlineSome = (int) location.startLine().get();
                            current_line=startlineSome;
                            //System.out.println("#########:"+startlineSome + ":" + s.getTypeAsString() + ":" + replace_escape_character(s.getEscapedCodeStr()));



                            ///////////////////修改固定输出
                            if(s.getTypeAsString().equals("IdentifierDeclStatement")){
                                IdentifierDeclStatement node_temp = (IdentifierDeclStatement) s;
                                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_IdentifierDecl=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("IdentifierDecl")){
                                            sign_if_has_IdentifierDecl=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    int sign_if_has_IdentifierDeclType=-1;
                                    i=0;
                                    if(sign_if_has_IdentifierDecl>=0){
                                        if(node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()>0){
                                            while (i<node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()){
                                                if(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(i).getTypeAsString().equals("IdentifierDeclType")){
                                                    sign_if_has_IdentifierDeclType=i;
                                                    break;
                                                }
                                                i++;
                                            }
                                            if(sign_if_has_IdentifierDeclType>=0){
                                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                                    System.out.print("\n");
                                                    if(!if_this_nodeLine_empty){
                                                        System.out.print(startlineSome+": ");
                                                    }
                                                }
                                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                            }
                                        }
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("ClassDef")){
                                ClassDefStatement node_temp = (ClassDefStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("CompoundStatement")){
                                CompoundStatement node_temp = (CompoundStatement) node;

                                current_line=0;
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("ExpressionStatement")){
                                ExpressionStatement node_temp = (ExpressionStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(s.getTypeAsString().equals("TryStatement")){
                                TryStatement node_temp = (TryStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("CatchStatement")){
                                CatchStatement node_temp = (CatchStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("BreakStatement")){
                                BreakStatement node_temp = (BreakStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                            }
                            else if(s.getTypeAsString().equals("ContinueStatement")){
                                ContinueStatement node_temp = (ContinueStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                            }
                            else if(s.getTypeAsString().equals("ReturnStatement")){
                                ReturnStatement node_temp = (ReturnStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
                            }
                            else if(s.getTypeAsString().equals("IfStatement")){
                                IfStatement node_temp = (IfStatement) s;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Condition=1;//临时调整
                                    /*while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                            sign_if_has_Condition=i;
                                            break;
                                        }
                                        i++;
                                    }*/
                                    if(sign_if_has_Condition>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(!if_this_nodeLine_empty){
                                                System.out.print(startlineSome+": ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": ");
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("ForStatement")){
                                ForStatement node_temp = (ForStatement) s;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Condition=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                            sign_if_has_Condition=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    if(sign_if_has_Condition>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(!if_this_nodeLine_empty){
                                                System.out.print(startlineSome+": ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Condition).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Condition).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("GotoStatement")){
                                GotoStatement node_temp = (GotoStatement) s;
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Identifier=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Identifier")){
                                            sign_if_has_Identifier=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    if(sign_if_has_Identifier>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(!if_this_nodeLine_empty){
                                                System.out.print(startlineSome+": ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("JumpStatement")){
                                JumpStatement node_temp = (JumpStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("ThrowStatement")){
                                ThrowStatement node_temp = (ThrowStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("DoStatement")){
                                DoStatement node_temp = (DoStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(!if_this_nodeLine_empty){
                                            System.out.print(startlineSome+": ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("SwitchStatement")){
                                SwitchStatement node_temp = (SwitchStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        System.out.print("\n");
                                        if(!if_this_nodeLine_empty){
                                            System.out.print(startlineSome+": ");
                                        }
                                    }
                                    System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(s.getTypeAsString().equals("Label")){
                                Label node_temp = (Label) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print("LabelStatement: "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("WhileStatement")){
                                WhileStatement node_temp = (WhileStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryExpression")){
                                UnaryExpression node_temp = (UnaryExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                                UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }




                            ///////////////////计算符号处理
                            ///////因为会报错，s和后面的node不是一个节点类型，所以直接删除
                            ///////////////////计算符号处理

                            ///////////////////修改固定输出

                            node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                        }///////////////添加location
                        if (s.getChildCount() != 0) {
                            Iterator children = s.getChildIterator();
                            while (children.hasNext()) {
                                try{
                                    if (location.startLine().isEmpty()) {
                                        printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                                    }else{
                                        printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                                    }
                                } catch (Exception e){
                                    continue;
                                }
                            }
                        }
                    }
                }

            }
            else{
                CodeLocation location = node.getLocation();///////////////添加location
                if (location.startLine().isEmpty()) {
                    if(node.getTypeAsString().equals("CatchList")){
                        current_line=0;
                    }
                    else{
                        current_line=-1;
                    }
                    //System.out.println("#########:"+"None:" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));
                    node.setNodeStartLine(-1,node);//添加node的line/////////////

                    ///////////////////修改固定输出
                    if(node.getTypeAsString().equals("FunctionDef")){
                        FunctionDefBase node_temp = (FunctionDefBase) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print("Function: "+node_temp.getName());
                    }
                    else if(node.getTypeAsString().equals("CompoundStatement")){
                        CompoundStatement node_temp = (CompoundStatement) node;

                        current_line=0;
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("ExpressionStatement")){
                        ExpressionStatement node_temp = (ExpressionStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("IdentifierDeclStatement")){
                        IdentifierDeclStatement node_temp = (IdentifierDeclStatement) node;
                        //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_IdentifierDecl=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("IdentifierDecl")){
                                    sign_if_has_IdentifierDecl=i;
                                    break;
                                }
                                i++;
                            }
                            int sign_if_has_IdentifierDeclType=-1;
                            i=0;
                            if(sign_if_has_IdentifierDecl>=0){
                                if(node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()>0){
                                    while (i<node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()){
                                        if(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(i).getTypeAsString().equals("IdentifierDeclType")){
                                            sign_if_has_IdentifierDeclType=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    if(sign_if_has_IdentifierDeclType>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(if_this_nodeLine_empty){
                                                System.out.print("None: ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("CallExpression")){
                        CallExpression node_temp = (CallExpression) node;
                        //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Callee=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Callee")){
                                    sign_if_has_Callee=i;
                                    break;
                                }
                                i++;
                            }
                            int sign_if_has_Identifier=-1;
                            i=0;
                            if(sign_if_has_Callee>=0){
                                if(node_temp.getChild(sign_if_has_Callee).getChildCount()>0){
                                    if(sign_if_has_Callee>=0){
                                        while (i<node_temp.getChild(sign_if_has_Callee).getChildCount()){
                                            if(node_temp.getChild(sign_if_has_Callee).getChild(i).getTypeAsString().equals("Identifier")){
                                                sign_if_has_Identifier=i;
                                                break;
                                            }
                                            i++;
                                        }
                                        if(sign_if_has_Identifier>=0){
                                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                                System.out.print("\n");
                                                if(if_this_nodeLine_empty){
                                                    System.out.print("None: ");
                                                }
                                            }
                                            System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ClassDef")){
                        ClassDefStatement node_temp = (ClassDefStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr()));
                    }
                    else if(node.getTypeAsString().equals("IfStatement")){
                        IfStatement node_temp = (IfStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Condition=1;//临时
                            /*while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                    sign_if_has_Condition=i;
                                    break;
                                }
                                i++;
                            }*/
                            if(sign_if_has_Condition>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(if_this_nodeLine_empty){
                                        System.out.print("None: ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }





                    ///////////////////计算符号处理
                    else if(node.getTypeAsString().equals("AssignmentExpression")){
                        AssignmentExpression node_temp = (AssignmentExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("PtrMemberAccess")){
                        PtrMemberAccess node_temp = (PtrMemberAccess) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                        System.out.print(node_temp.getTypeAsString()+"; ");
                    }
                    else if(node.getTypeAsString().equals("IncDec")){
                        IncDec node_temp = (IncDec) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    else if(node.getTypeAsString().equals("InclusiveOrExpression")){
                        InclusiveOrExpression node_temp = (InclusiveOrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("MultiplicativeExpression")){
                        MultiplicativeExpression node_temp = (MultiplicativeExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("BitAndExpression")){
                        BitAndExpression node_temp = (BitAndExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("AdditiveExpression")){
                        AdditiveExpression node_temp = (AdditiveExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        if(node_temp.getEscapedCodeStr().indexOf("+")>0){
                            System.out.print(node_temp.getTypeAsString()+": "+"+"+"; ");
                        }
                        else if(node_temp.getEscapedCodeStr().indexOf("-")>0){
                            System.out.print(node_temp.getTypeAsString()+": "+"-"+"; ");
                        }
                    }
                    else if(node.getTypeAsString().equals("BinaryExpression")){
                        BinaryExpression node_temp = (BinaryExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("AndExpression")){
                        AndExpression node_temp = (AndExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("CastExpression")){
                        CastExpression node_temp = (CastExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("CastTarget")){
                        CastTarget node_temp = (CastTarget) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ConditionalExpression")){
                        ConditionalExpression node_temp = (ConditionalExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("Condition")){
                        Condition node_temp = (Condition) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(if_this_nodeLine_empty){
                                    System.out.print("None: ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("DoubleExpression")){
                        DoubleExpression node_temp = (DoubleExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("EqualityExpression")){
                        EqualityExpression node_temp = (EqualityExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ExclusiveOrExpression")){
                        ExclusiveOrExpression node_temp = (ExclusiveOrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("OrExpression")){
                        OrExpression node_temp = (OrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("RelationalExpression")){
                        RelationalExpression node_temp = (RelationalExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ShiftExpression")){
                        ShiftExpression node_temp = (ShiftExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("SizeofExpression")){
                        SizeofExpression node_temp = (SizeofExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+"sizeof"+"; ");
                    }
                    else if(node.getTypeAsString().equals("UnaryOperator")){
                        UnaryOperator node_temp = (UnaryOperator) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(if_this_nodeLine_empty){
                                System.out.print("None: ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    ///////////////////计算符号处理

                    ///////////////////修改固定输出

                }




                else {
                    int startlineSome = (int) location.startLine().get();
                    current_line=startlineSome;
                    //System.out.println("#########:"+startlineSome + ":" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));


                    ///////////////////修改固定输出
                    if(node.getTypeAsString().equals("FunctionDef")){
                        FunctionDefBase node_temp = (FunctionDefBase) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print("Function: "+node_temp.getName());
                    }
                    else if(node.getTypeAsString().equals("CompoundStatement")){
                        CompoundStatement node_temp = (CompoundStatement) node;
                        /*if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                        }*/
                        current_line=0;
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("ExpressionStatement")){
                        ExpressionStatement node_temp = (ExpressionStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("IdentifierDeclStatement")){
                        IdentifierDeclStatement node_temp = (IdentifierDeclStatement) node;
                        //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_IdentifierDecl=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("IdentifierDecl")){
                                    sign_if_has_IdentifierDecl=i;
                                    break;
                                }
                                i++;
                            }
                            int sign_if_has_IdentifierDeclType=-1;
                            i=0;
                            if(sign_if_has_IdentifierDecl>=0){
                                if(node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()>0){
                                    while (i<node_temp.getChild(sign_if_has_IdentifierDecl).getChildCount()){
                                        if(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(i).getTypeAsString().equals("IdentifierDeclType")){
                                            sign_if_has_IdentifierDeclType=i;
                                            break;
                                        }
                                        i++;
                                    }
                                    if(sign_if_has_IdentifierDeclType>=0){
                                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                            System.out.print("\n");
                                            if(!if_this_nodeLine_empty){
                                                System.out.print(startlineSome+": ");
                                            }
                                        }
                                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("CallExpression")){
                        CallExpression node_temp = (CallExpression) node;
                        //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Callee=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Callee")){
                                    sign_if_has_Callee=i;
                                    break;
                                }
                                i++;
                            }
                            int sign_if_has_Identifier=-1;
                            i=0;
                            if(sign_if_has_Callee>=0){
                                if(node_temp.getChild(sign_if_has_Callee).getChildCount()>0){
                                    if(sign_if_has_Callee>=0){
                                        while (i<node_temp.getChild(sign_if_has_Callee).getChildCount()){
                                            if(node_temp.getChild(sign_if_has_Callee).getChild(i).getTypeAsString().equals("Identifier")){
                                                sign_if_has_Identifier=i;
                                                break;
                                            }
                                            i++;
                                        }
                                        if(sign_if_has_Identifier>=0){
                                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                                System.out.print("\n");
                                                if(!if_this_nodeLine_empty){
                                                    System.out.print(startlineSome+": ");
                                                }
                                            }
                                            System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ClassDef")){
                        ClassDefStatement node_temp = (ClassDefStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("TryStatement")){
                        TryStatement node_temp = (TryStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("CatchStatement")){
                        CatchStatement node_temp = (CatchStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("BreakStatement")){
                        BreakStatement node_temp = (BreakStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                    }
                    else if(node.getTypeAsString().equals("ContinueStatement")){
                        ContinueStatement node_temp = (ContinueStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                    }
                    else if(node.getTypeAsString().equals("ReturnStatement")){
                        ReturnStatement node_temp = (ReturnStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
                    }
                    else if(node.getTypeAsString().equals("IfStatement")){
                        IfStatement node_temp = (IfStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Condition=1;//临时
                            /*while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                    sign_if_has_Condition=i;
                                    break;
                                }
                                i++;
                            }*/
                            if(sign_if_has_Condition>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ForStatement")){
                        ForStatement node_temp = (ForStatement) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("GotoStatement")){
                        GotoStatement node_temp = (GotoStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Identifier=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Identifier")){
                                    sign_if_has_Identifier=i;
                                    break;
                                }
                                i++;
                            }
                            if(sign_if_has_Identifier>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                    if(!if_this_nodeLine_empty){
                                        System.out.print(startlineSome+": ");
                                    }
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("JumpStatement")){
                        JumpStatement node_temp = (JumpStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("ThrowStatement")){
                        ThrowStatement node_temp = (ThrowStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
                    }
                    /*else if(node.getTypeAsString().equals("DoStatement")){
                        DoStatement node_temp = (DoStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Condition=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Condition")){
                                    sign_if_has_Condition=i;
                                    break;
                                }
                                i++;
                            }
                            if(sign_if_has_Condition>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                }
                                System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Condition).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Condition).getEscapedCodeStr())+"; ");
                            }
                        }
                    }*/
                    else if(node.getTypeAsString().equals("DoStatement")){
                        DoStatement node_temp = (DoStatement) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("SwitchStatement")){
                        SwitchStatement node_temp = (SwitchStatement) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("Label")){
                        Label node_temp = (Label) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print("LabelStatement: "+replace_escape_character(replace_escape_character(node_temp.getEscapedCodeStr()))+"; ");
                    }
                    else if(node.getTypeAsString().equals("WhileStatement")){
                        WhileStatement node_temp = (WhileStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("UnaryExpression")){
                        UnaryExpression node_temp = (UnaryExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                        UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }





                    ///////////////////计算符号处理
                    else if(node.getTypeAsString().equals("AssignmentExpression")){
                        AssignmentExpression node_temp = (AssignmentExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ConditionalExpression")){
                        ConditionalExpression node_temp = (ConditionalExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("Condition")){
                        Condition node_temp = (Condition) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("PtrMemberAccess")){
                        PtrMemberAccess node_temp = (PtrMemberAccess) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                        System.out.print(node_temp.getTypeAsString()+"; ");
                    }
                    else if(node.getTypeAsString().equals("IncDec")){
                        IncDec node_temp = (IncDec) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    else if(node.getTypeAsString().equals("InclusiveOrExpression")){
                        InclusiveOrExpression node_temp = (InclusiveOrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("MultiplicativeExpression")){
                        MultiplicativeExpression node_temp = (MultiplicativeExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("BitAndExpression")){
                        BitAndExpression node_temp = (BitAndExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("AdditiveExpression")){
                        AdditiveExpression node_temp = (AdditiveExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");

                    }
                    else if(node.getTypeAsString().equals("BinaryExpression")){
                        BinaryExpression node_temp = (BinaryExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("BinaryOperationExpression")){
                        BinaryOperationExpression node_temp = (BinaryOperationExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("AndExpression")){
                        AndExpression node_temp = (AndExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("CastExpression")){
                        CastExpression node_temp = (CastExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("CastTarget")){
                        CastTarget node_temp = (CastTarget) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ConditionalExpression")){
                        ConditionalExpression node_temp = (ConditionalExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("Condition")){
                        Condition node_temp = (Condition) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                System.out.print("\n");
                                if(!if_this_nodeLine_empty){
                                    System.out.print(startlineSome+": ");
                                }
                            }
                            System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("DoubleExpression")){
                        DoubleExpression node_temp = (DoubleExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("EqualityExpression")){
                        EqualityExpression node_temp = (EqualityExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ExclusiveOrExpression")){
                        ExclusiveOrExpression node_temp = (ExclusiveOrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("OrExpression")){
                        OrExpression node_temp = (OrExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("RelationalExpression")){
                        RelationalExpression node_temp = (RelationalExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("ShiftExpression")){
                        ShiftExpression node_temp = (ShiftExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getOperator()+"; ");
                    }
                    else if(node.getTypeAsString().equals("SizeofExpression")){
                        SizeofExpression node_temp = (SizeofExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+"sizeof"+"; ");
                    }
                    else if(node.getTypeAsString().equals("UnaryOperator")){
                        UnaryOperator node_temp = (UnaryOperator) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            System.out.print("\n");
                            if(!if_this_nodeLine_empty){
                                System.out.print(startlineSome+": ");
                            }
                        }
                        System.out.print(node_temp.getTypeAsString()+": "+node_temp.getEscapedCodeStr()+"; ");
                    }
                    ///////////////////计算符号处理

                    ///////////////////修改固定输出

                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        try{
                            if (location.startLine().isEmpty()) {
                                printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                            }else{
                                printSequence((AstNode) children.next(), layer_temp + 1,current_line);
                            }
                        } catch (Exception e){
                            continue;
                        }
                    }
                }
            }
        }
    }
}

class AntlrParserDriverObserverNewTestNewForSequenceWithLineNumber implements AntlrParserDriverObserver {

    public List<AstNode> codeItems;

    public AntlrParserDriverObserverNewTestNewForSequenceWithLineNumber() {
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