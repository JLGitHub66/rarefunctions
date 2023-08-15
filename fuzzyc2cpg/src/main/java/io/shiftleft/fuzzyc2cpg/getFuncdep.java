//getCallFunctionName for niejianglei 2022.5.21
package io.shiftleft.fuzzyc2cpg;

import io.shiftleft.fuzzyc2cpg.ast.*;
import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.AstNodeBuilder;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.expressions.*;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.FunctionDefBase;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.ParameterBase;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.ParameterList;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.CallExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.SizeofExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.functiondef.FunctionDef;
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

public class getFuncdep {
    public static Map<String, Map<String, Map<String, Integer>>> func_dep = new HashMap();

    public static void main(String args[]) throws IOException {
        String path = "D:\\linux-5.19.10"; //test c++
        //String path = "E:\\上下文展开\\testFile"; //test c++

        System.out.println("getFuncdep-- 输入路径：" + path); //输出文件所在位置
        List<String> filename = new ArrayList<>();  //存储路径中所有的file
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件
        System.out.println("getFuncdep-- 当前路径下源码文件：\n" + filename);
        System.out.println("getFuncdep-- 当前路径下包含特定类型的文件的个数: " + filename.size());

        if(path.endsWith(File.separator)){
            //System.out.println("!!!!!!!!!!!!"+path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");
        }
        else{
            path = path + File.separator;
            //System.out.println("!!!!!!!!!!!!"+path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");
        }
        PrintStream ps = new PrintStream(path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_FunctionDependence.out"); //输出流的文件名修改为.out文件


        for(int i = 0; i < filename.size(); i++){ //逐个文件，遍历生成ast
            try{
                String input = "";
                String str = "";
                BufferedReader bufferR = null;
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
                Date date1=new Date();
                System.out.println("getFuncdep-- TIME: " + df.format(date1));
                System.out.println("getFuncdep-- 正在遍历第" + (i+1) + "个文件：" + filename.get(i));
                //PrintStream ps = new PrintStream(filename.get(i) + ".out"); //输出流的文件名修改为.out文件
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
                        int flag_for_if_another_line_print;
                        AstNode node = (AstNode) it.next();
                        if(node.getTypeAsString().equals("FunctionDef")){
                            FunctionDef node_temp = (FunctionDef) node;
                            String funcname = node_temp.getName();
                            if (!funcname.equals("EXPORT_SYMBOL_GPL")){
                                //System.out.println("DefFunction: " + node_temp.getName());
                                ParameterList paramlist = node_temp.getParameterList();
                                int paramCount = paramlist.getChildCount();
                                List<String> paramList = new ArrayList<String>();
                                for(int j = 0; j < paramCount; j++) {
                                    paramList.add(paramlist.getParameter(j).getName());
                                    //System.out.print(paramlist.getParameter(j).getName() + " ");
                                }
                                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getIdentifier().getEscapedCodeStr()+"; ");
                                List<String> returnList = new ArrayList<String>();
                                Map<String, List<String>> func_paramter = new HashMap<>();
                                Map<String, String> func_return = new HashMap<>();
                                List<String> return_function = new ArrayList<String>();
                                getReturnAndDataFlow(node, node, 0, paramList, returnList, func_paramter, func_return, return_function);
                                getFuncDataConnection(funcname, func_paramter, func_return);
                                returnList.clear();
                                func_paramter.clear();
                                func_return.clear();
                                return_function.clear();
                                /*if (paramList.size()!=0){
                                    System.out.print("paramlist: ");
                                    for(String paramValue : paramList){
                                        System.out.print(paramValue + " ");
                                    }
                                    System.out.println();
                                }
                                if (returnList.size()!=0){
                                    System.out.print("returnlist: ");
                                    for (String returnValue : returnList) {
                                        System.out.print(returnValue + " ");
                                    }
                                    System.out.println();
                                }*/
                                //System.out.println("call getFuncDep\n");
                                //getFuncDep(funcname, paramList, returnList, func_paramter);
                                //System.out.println();
                            }
                            //System.out.println("function name:" + node_temp.getIdentifier().getEscapedCodeStr());
                            //System.out.println("Parameter:");
                            //System.out.println(node_temp.getParameterList().getEscapedCodeStr());

                            /*flag_for_if_another_line_print = printSequence(node, 0,0, 0, paramlist, returnList);
                            if(flag_for_if_another_line_print==1){
                                //System.out.println("\n");
                                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getIdentifier().getEscapedCodeStr()+"; ");

                                System.out.print(","+node_temp.getIdentifier().getEscapedCodeStr()+"\n");//聂师兄需求，带逗号输出函数名字
                                //System.out.print("\n");//聂师兄需求，不输出函数名字
                            }*/
                        }
                    } catch (Exception e){
                        continue;
                    }
                }
                System.setOut(out);

                Date date2=new Date();
                System.out.println("getFuncdep-- TIME: " + df.format(date2));
                System.out.println("getFuncdep-- 导出out：" + path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");

                long l = date2.getTime() - date1.getTime();
                long day=l/(24*60*60*1000);
                long hour=(l/(60*60*1000)-day*24);
                long min=((l/(60*1000))-day*24*60-hour*60);
                long s=(l/1000-day*24*60*60-hour*60*60-min*60);
                if(day>0){
                    System.out.println("getFuncdep-- 导出out耗时: "+day+"day"+hour+"hour"+min+"min"+s+"s\n");
                }else if(hour>0){
                    System.out.println("getFuncdep-- 导出out耗时: "+hour+"hour"+min+"min"+s+"\n");
                }else if(min>0){
                    System.out.println("getFuncdep-- 导出out耗时: "+min+"min"+s+"s\n");
                }else{
                    System.out.println("getFuncdep-- 导出out耗时: "+s+"s\n");
                }

                codeItems.clear();
            } catch (Exception e){
                continue;
            }
        }
        System.setOut(ps);
        // print function connection
        Set<String> keySet = func_dep.keySet();
        for (String functionName : keySet){
            System.out.println(functionName);
            Map<String, Map<String,Integer>> depMap = func_dep.get(functionName);
            Set<String> depSet = depMap.keySet();
            for (String depFunc : depSet){
                System.out.print(depFunc + " ,");
                Map<String,Integer> argFreqMap = depMap.get(depFunc);
                Set<String> argumentSet = depMap.get(depFunc).keySet();
                for (String argumentName : argumentSet){
                    int index = argFreqMap.get(argumentName);
                    System.out.print(argumentName + ";" + index + ";");
                }
                System.out.println();
            }
            System.out.println();
        }
        PrintStream out = System.out;
        System.setOut(out);
        ps.close();//新加的
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
        String result = "";
        if(original_str==null){
            replaced_str="null";
        }else{
            replaced_str=original_str.replace("\\t",""); //2022年9月16日修改，这样去除其中的\n\t\r
            replaced_str=replaced_str.replace("\\n",""); //2022年9月16日修改，这样去除其中的\n\t\r
            replaced_str=replaced_str.replace("\\r",""); //2022年9月16日修改，这样去除其中的\n\t\r
            //replaced_str=replaced_str.replace("\\0","@");

            //在这里把  *  (  )  ,  ->  .  [  ]  作为分割的字符
            String test1[] = replaced_str.split("->");
            if(test1.length > 0){
                result = test1[test1.length-1];
                //System.out.println("1\n"+result);
            }

            String test2[] = result.split("\\.");
            if(test2.length > 0){
                result = test2[test2.length-1];
                //System.out.println("2\n"+result);
            }

            String test3[] =result.split("\\(");
            if(test3.length > 0){
                result = test3[test3.length-1];
                //System.out.println("3\n"+result);
            }

            String test4[] =result.split("\\[");
            if(test4.length > 0){
                result = test4[test4.length-1];
                //System.out.println("4\n"+result);
            }

            String test5[] =result.split("\\*");
            if(test5.length > 0){
                result = test5[test5.length-1];
                //System.out.println("5\n"+result);
            }

            String test6[] =result.split("\\]");
            if(test6.length > 0){
                result = test6[test6.length-1];
                //System.out.println("6\n"+result);
            }

            String test7[] =result.split("\\,");
            if(test7.length > 0){
                result = test7[test7.length-1];
                //System.out.println("7\n"+result);
            }

            String test8[] =result.split("\\)");
            if(test8.length > 0){
                result = test8[test8.length-1];
                //System.out.println("8\n"+result);
            }

            String test9[] =result.split("=");
            if(test9.length > 0){
                result = test9[test9.length-1];
                //System.out.println("9\n"+result);
            }

            String test10[] =result.split("/");
            if(test10.length > 0){
                result = test10[test10.length-1];
                //System.out.println("10\n"+result);
            }

            String test11[] =result.split("<");
            if(test11.length > 0){
                result = test11[test11.length-1];
                //System.out.println("11\n"+result);
            }

            String test12[] =result.split(">");
            if(test12.length > 0){
                result = test12[test12.length-1];
                //System.out.println("12\n"+result);
            }

            String test13[] =result.split("\\+");
            if(test13.length > 0){
                result = test13[test13.length-1];
                //System.out.println("13\n"+result);
            }
        }

        return result;
    }

    // get function argument and return value
    public static void getReturnAndDataFlow(AstNode funcDefNode, AstNode node, int layer, List<String> paramlist, List<String> returnList, Map<String, List<String>> func_paramter, Map<String, String> func_return, List<String> return_function) {
        int layer_temp = layer;
        //System.out.println("start getReturnAndDataFlow\n");
        if (node.getTypeAsString().equals("ReturnStatement")){
            ReturnStatement ret_node = (ReturnStatement) node;
            Expression returnExpression = ret_node.getReturnExpression();
            //System.out.println("returnExpression:" + returnExpression.getEscapedCodeStr());
            //System.out.println("returnType:" + returnExpression.getTypeAsString());
            if (returnExpression.getTypeAsString().equals("Identifier")){
                String returnIdentifier = returnExpression.getEscapedCodeStr();
                returnList.add(returnIdentifier);
            }else if(returnExpression.getTypeAsString().equals("CallExpression")){
                String returnFunc = replace_escape_character(returnExpression.getChild(0).getEscapedCodeStr());
                //System.out.println("returnFunc:" + returnFunc);
                returnList.add(returnFunc);
                List<String> returnArgumentList = new ArrayList();
                CallExpression callExpression = (CallExpression) returnExpression;
                ArgumentList argumentList = callExpression.getArgumentList();
                int argumentCount = argumentList.getChildCount();
                for(int j = 0; j < argumentCount; j++) {
                    AstNode arg = argumentList.getChild(j);
                    String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                    returnArgumentList.add(argumentName);
                }
                if (func_paramter.containsKey(returnFunc)){
                    for (String argument : returnArgumentList){
                        if (!func_paramter.get(returnFunc).contains(argument)){
                            func_paramter.get(returnFunc).add(argument);
                        }
                    }
                }else{
                    func_paramter.put(returnFunc, returnArgumentList);
                }
            }
            return;
        }else if (node.getTypeAsString().equals("AssignmentExpression")){
            AssignmentExpression temp_node = (AssignmentExpression) node;
            Expression left = temp_node.getLeft();
            Expression right = temp_node.getRight();
            if (right.getTypeAsString().equals("CallExpression")){
                String call_return = left.getEscapedCodeStr();
                List<String> returnArgumentList = new ArrayList();
                //System.out.println("left expression:" + left.getEscapedCodeStr());
                //System.out.println("right expression:" + right.getEscapedCodeStr());
                CallExpression callExpression = (CallExpression) right;
                if(callExpression.getChildCount()!=0){
                    //System.out.println("callExpression.getChildCount:" + callExpression.getChildCount());
                    //System.out.println("callExpression child " + i + ":" + callExpression.getChild(i).getEscapedCodeStr());
                    String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
                    func_return.put(call_name,call_return);
                    //System.out.println("call name:" + call_name);
                    ArgumentList argumentList = callExpression.getArgumentList();
                    int argumentCount = argumentList.getChildCount();
                    for(int j = 0; j < argumentCount; j++) {
                        String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                        //System.out.println("argumentName:" + argumentName);
                        //System.out.println("type:" + arg.getTypeAsString());
                        returnArgumentList.add(argumentName);
                    }
                    if (func_paramter.containsKey(call_name)){
                        for (String argument : returnArgumentList){
                            if (!func_paramter.get(call_name).contains(argument)){
                                func_paramter.get(call_name).add(argument);
                            }
                        }
                    }else{
                        func_paramter.put(call_name, returnArgumentList);
                    }
                }
            }
        }else if(node.getTypeAsString().equals("IfStatement")){
            IfStatement temp_node = (IfStatement) node;
            //System.out.println("IfStatement:" + temp_node.getEscapedCodeStr());
            Condition condition = (Condition) temp_node.getCondition();
            Expression ifExpression = condition.getExpression();
            //System.out.println("ifExpression:" + ifExpression.getEscapedCodeStr());
            //System.out.println("ifExpression type:" + ifExpression.getTypeAsString());
            if (ifExpression.getTypeAsString().equals("CallExpression")){
                List<String> returnArgumentList = new ArrayList();
                CallExpression callExpression = (CallExpression) ifExpression;
                if(callExpression.getChildCount()!=0){
                    String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
                    //System.out.println("call name:" + call_name);
                    ArgumentList argumentList = callExpression.getArgumentList();
                    int argumentCount = argumentList.getChildCount();
                    for(int j = 0; j < argumentCount; j++) {
                        AstNode arg = argumentList.getChild(j);
                        String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                        returnArgumentList.add(argumentName);
                    }
                    if (func_paramter.containsKey(call_name)){
                        for (String argument : returnArgumentList){
                            if (!func_paramter.get(call_name).contains(argument)){
                                func_paramter.get(call_name).add(argument);
                            }
                        }
                    }else{
                        func_paramter.put(call_name, returnArgumentList);
                    }
                }
            }
        }else if(node.getTypeAsString().equals("CallExpression")){
            CallExpression callExpression = (CallExpression) node;
            List<String> returnArgumentList = new ArrayList();
            if (callExpression.getChildCount() != 0) {
                String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
                ArgumentList argumentList = callExpression.getArgumentList();
                int argumentCount = argumentList.getChildCount();
                for (int j = 0; j < argumentCount; j++) {
                    AstNode arg = argumentList.getChild(j);
                    String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                    returnArgumentList.add(argumentName);
                }
                if (func_paramter.containsKey(call_name)) {
                    for (String argument : returnArgumentList) {
                        if (!func_paramter.get(call_name).contains(argument)) {
                            func_paramter.get(call_name).add(argument);
                        }
                    }
                } else {
                    func_paramter.put(call_name, returnArgumentList);
                }
            }
        }
        CodeLocation location = node.getLocation();
        if (node.getChildCount() != 0) {
            Iterator children = node.getChildIterator();
            while (children.hasNext()) {
                try{
                    getReturnAndDataFlow(funcDefNode, (AstNode) children.next(), layer_temp + 1, paramlist, returnList, func_paramter, func_return, return_function);
                } catch (Exception e){
                    continue;
                }
            }
        }
        /*if (node.getChildCount() == 0){
            System.out.print("paramlist: ");
            for(int i = 0; i < paramlist.length; i++){
                System.out.print(paramlist[i] + " ");
            }
            System.out.println();
            System.out.print("returnlist: ");
            for (String returnValue : returnList) {
                System.out.print(returnValue + " ");
            }
            System.out.println();
        }*/
    }

    public static void getFuncDep(String defName, List<String> paramlist, List<String> returnList, Map<String, List<String>> func_paramter) {
        //System.out.println("getFuncDep\n");
        /*System.out.print("paramlist: ");
        for(String paramValue : paramlist){
            System.out.print(paramValue + " ");
        }
        System.out.println();
        System.out.print("returnlist: ");
        for (String returnValue : returnList) {
            System.out.print(returnValue + " ");
        }
        System.out.println();*/
        /*Set<String> keySet = func_paramter.keySet();
        for (String functionName : keySet){
            System.out.println("functionName:" + functionName);
            boolean flag = false;
            List<String> argumentList = func_paramter.get(functionName);
            for(int i = 0 ; i < argumentList.size() ; i++){
                String argument = argumentList.get(i);
                System.out.println("argument:" + argument);
            }
        }*/

        //System.out.println(defName);
        Set<String> keySet = func_paramter.keySet();
        for (String functionName : keySet){
            //System.out.println("functionName:" + functionName);
            boolean flag = false;
            List<String> argumentList = func_paramter.get(functionName);
            for(int i = 0 ; i < argumentList.size() ; i++){
                String argument = argumentList.get(i);
                //System.out.println("argument:" + argument);
                for(int j = 0 ; j < paramlist.size() ; j++){
                    String param = paramlist.get(j);
                    if(param.equals(argument)){
                        if(!flag){
                            flag = true;
                            System.out.print("function: " + functionName + " , ");
                        }
                        System.out.print(param + " ");
                    }
                }
                for(int j = 0 ; j < returnList.size() ; j++){
                    String retVar = returnList.get(j);
                    if(retVar.equals(argument)){
                        if(!flag){
                            flag = true;
                            System.out.print("function: " + functionName + " , ");
                        }
                        System.out.print(retVar + " ");
                    }
                }
            }
            if (flag){
                System.out.print("\n");
            }
        }
        /*if (node.getChildCount() == 0){
            System.out.print("paramlist: ");
            for(int i = 0; i < paramlist.length; i++){
                System.out.print(paramlist[i] + " ");
            }
            System.out.println();
            System.out.print("returnlist: ");
            for (String returnValue : returnList) {
                System.out.print(returnValue + " ");
            }
            System.out.println();
        }*/
    }

    public static void getFuncDataConnection(String defName, Map<String, List<String>> func_paramter, Map<String, String> func_return) {
        //System.out.println(defName);
        Map<String, List<String>> copy_map = new HashMap();
        copy_map.putAll(func_paramter);
        //记录返回值与参数之间的关系
        Set<String> returnName = func_return.keySet();
        for (String retFunctionName : returnName){
            String returnVar = func_return.get(retFunctionName);
            Set<String> keySet = func_paramter.keySet();
            for (String paramFunctionName : keySet){
                if(paramFunctionName.equals(retFunctionName)){
                    continue;
                }
                List<String> argumentList = func_paramter.get(paramFunctionName);
                for (int i = 0; i < argumentList.size(); i++) {
                    String argument = argumentList.get(i);
                    if (argument.equals(returnVar)){
                        if (getFuncdep.func_dep.containsKey(retFunctionName)){
                            if (getFuncdep.func_dep.get(retFunctionName).containsKey(paramFunctionName)){
                                Map<String, Integer> funcdepMap = getFuncdep.func_dep.get(retFunctionName).get(paramFunctionName);
                                if (funcdepMap.keySet().contains(argument)){
                                    continue;
                                }else{
                                    getFuncdep.func_dep.get(retFunctionName).get(paramFunctionName).put(argument, i+1);
                                }
                            }else{
                                Map<String, Integer> funcdepMap = new HashMap<>();
                                funcdepMap.put(argument, i+1);
                                getFuncdep.func_dep.get(retFunctionName).put(paramFunctionName,funcdepMap);
                            }
                        }else{
                            Map<String, Integer> funcdepMap = new HashMap<>();
                            funcdepMap.put(argument, i+1);
                            Map<String, Map<String, Integer>> tempmap = new HashMap();
                            tempmap.put(paramFunctionName, funcdepMap);
                            getFuncdep.func_dep.put(retFunctionName,tempmap);
                        }
                        if (getFuncdep.func_dep.containsKey(paramFunctionName)){
                            if (getFuncdep.func_dep.get(paramFunctionName).containsKey(retFunctionName)){
                                Map<String,Integer> funcdepMap = getFuncdep.func_dep.get(paramFunctionName).get(retFunctionName);
                                if (funcdepMap.keySet().contains(argument)){
                                    continue;
                                }else{
                                    getFuncdep.func_dep.get(paramFunctionName).get(retFunctionName).put(argument, 0);
                                }
                            }else{
                                Map<String, Integer> funcdepMap = new HashMap<>();
                                funcdepMap.put(argument, 0);
                                getFuncdep.func_dep.get(paramFunctionName).put(retFunctionName,funcdepMap);
                            }
                        }else{
                            Map<String, Integer> funcdepMap = new HashMap<>();
                            funcdepMap.put(argument, 0);
                            Map<String, Map<String, Integer>> tempmap = new HashMap();
                            tempmap.put(retFunctionName, funcdepMap);
                            getFuncdep.func_dep.put(paramFunctionName, tempmap);
                        }
                    }
                }
            }
        }
        //记录返回值与返回值之间的关系
        /*Set<String> returnFunc = func_return.keySet();
        for (String retFunctionName : returnFunc){
            String returnVar = func_return.get(retFunctionName);
            Set<String> keySet = func_return.keySet();
            for (String depFunctionName : keySet){
                if(retFunctionName.equals(depFunctionName)){
                    continue;
                }
                String depReturn = func_return.get(depFunctionName);
                if(returnVar.equals(depReturn)){
                    if (getFuncdep.func_dep.containsKey(retFunctionName)){
                        if (getFuncdep.func_dep.get(retFunctionName).containsKey(depFunctionName)){
                            Map<String, Integer> funcdepMap = getFuncdep.func_dep.get(retFunctionName).get(depFunctionName);
                            if (funcdepMap.keySet().contains(returnVar)){
                                continue;
                            }else{
                                getFuncdep.func_dep.get(retFunctionName).get(depFunctionName).put(returnVar, 0);
                            }
                        }else{
                            Map<String, Integer> funcdepMap = new HashMap<>();
                            funcdepMap.put(returnVar, 0);
                            getFuncdep.func_dep.get(retFunctionName).put(depFunctionName,funcdepMap);
                        }
                    }else{
                        Map<String, Integer> funcdepMap = new HashMap<>();
                        funcdepMap.put(returnVar, 0);
                        Map<String, Map<String, Integer>> tempmap = new HashMap();
                        tempmap.put(depFunctionName, funcdepMap);
                        getFuncdep.func_dep.put(retFunctionName,tempmap);
                    }
                    if (getFuncdep.func_dep.containsKey(depFunctionName)){
                        if (getFuncdep.func_dep.get(depFunctionName).containsKey(retFunctionName)){
                            Map<String,Integer> funcdepMap = getFuncdep.func_dep.get(depFunctionName).get(retFunctionName);
                            if (funcdepMap.keySet().contains(returnVar)){
                                continue;
                            }else{
                                getFuncdep.func_dep.get(depFunctionName).get(retFunctionName).put(returnVar, 0);
                            }
                        }else{
                            Map<String, Integer> funcdepMap = new HashMap<>();
                            funcdepMap.put(returnVar, 0);
                            getFuncdep.func_dep.get(depFunctionName).put(retFunctionName,funcdepMap);
                        }
                    }else{
                        Map<String, Integer> funcdepMap = new HashMap<>();
                        funcdepMap.put(returnVar, 0);
                        Map<String, Map<String, Integer>> tempmap = new HashMap();
                        tempmap.put(retFunctionName, funcdepMap);
                        getFuncdep.func_dep.put(depFunctionName, tempmap);
                    }
                }
            }
        }*/

        //记录参数与参数之间的关系
        Set<String> keySet = func_paramter.keySet();
        for (String functionName : keySet){
            //System.out.println("functionName:" + functionName);
            List<String> argumentList = func_paramter.get(functionName);
            //System.out.println("argumentList.size:" + argumentList.size());
            for(int i = 0 ; i < argumentList.size() ; i++){
                String argument = argumentList.get(i);
                //System.out.println("argument:" + argument);
                Set<String> tempSet = copy_map.keySet();
                for (String tempName : tempSet) {
                    if (tempName.equals(functionName)){
                        continue;
                    }
                    //System.out.println("tempName:" + tempName);
                    List<String> tempList = copy_map.get(tempName);
                    //System.out.println("tempList.size:" + tempList.size());
                    for (int j = 0; j < tempList.size(); j++) {
                        String tempArg = tempList.get(j);
                        //System.out.println("tempArg:" + tempArg);
                        if (argument.equals(tempArg)){
                            if (getFuncdep.func_dep.containsKey(functionName)){
                                if (getFuncdep.func_dep.get(functionName).containsKey(tempName)){
                                    Map<String, Integer> funcdepMap = getFuncdep.func_dep.get(functionName).get(tempName);
                                    if (funcdepMap.keySet().contains(tempArg)){
                                        continue;
                                    }else{
                                        getFuncdep.func_dep.get(functionName).get(tempName).put(tempArg, j+1);
                                    }
                                }else{
                                    Map<String, Integer> funcdepMap = new HashMap<>();
                                    funcdepMap.put(tempArg, j+1);
                                    getFuncdep.func_dep.get(functionName).put(tempName,funcdepMap);
                                }
                            }else{
                                Map<String, Integer> funcdepMap = new HashMap<>();
                                funcdepMap.put(tempArg, j+1);
                                Map<String, Map<String, Integer>> tempmap = new HashMap();
                                tempmap.put(tempName, funcdepMap);
                                getFuncdep.func_dep.put(functionName,tempmap);
                            }
                            if (getFuncdep.func_dep.containsKey(tempName)){
                                if (getFuncdep.func_dep.get(tempName).containsKey(functionName)){
                                    Map<String,Integer> funcdepMap = getFuncdep.func_dep.get(tempName).get(functionName);
                                    if (funcdepMap.keySet().contains(tempArg)){
                                        continue;
                                    }else{
                                        getFuncdep.func_dep.get(tempName).get(functionName).put(tempArg, i+1);
                                    }
                                }else{
                                    Map<String, Integer> funcdepMap = new HashMap<>();
                                    funcdepMap.put(tempArg, i+1);
                                    getFuncdep.func_dep.get(tempName).put(functionName,funcdepMap);
                                }
                            }else{
                                Map<String, Integer> funcdepMap = new HashMap<>();
                                funcdepMap.put(tempArg, i+1);
                                Map<String, Map<String, Integer>> tempmap = new HashMap();
                                tempmap.put(functionName, funcdepMap);
                                getFuncdep.func_dep.put(tempName, tempmap);
                            }
                        }
                    }
                }
            }
        }
    }
}