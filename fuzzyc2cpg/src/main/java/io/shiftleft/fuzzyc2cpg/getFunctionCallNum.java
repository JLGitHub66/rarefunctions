//getFunctionImplement for niejianglei 2022.5.21
package io.shiftleft.fuzzyc2cpg;

import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.CodeLocation;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.expressions.*;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.FunctionDefBase;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.ParameterList;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.CallExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.functiondef.FunctionDef;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.IfStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.CompoundStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.JumpStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.Label;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.Statement;
import io.shiftleft.fuzzyc2cpg.ast.statements.ExpressionStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.IdentifierDeclStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.*;
import io.shiftleft.fuzzyc2cpg.ast.statements.jump.*;
import io.shiftleft.fuzzyc2cpg.parser.TokenSubStream;
import io.shiftleft.fuzzyc2cpg.parser.modules.AntlrCModuleParserDriver;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class getFunctionCallNum {
    public static Map<String, Map<String, List<String>>> func_dep;
    public static Map<String, Integer> func_call = new HashMap();

    public static void main(String args[]) throws IOException {
        String path = "D:\\其他系统\\freebsd-13.1"; //test c++

        System.out.println("getFunctionImplement-- 输入路径：" + path); //输出文件所在位置
        List<String> filename = new ArrayList<>();  //存储路径中所有的file
        filename = getFile(path, filename);  //在这里定义了只获取*.c文件
        System.out.println("getFunctionImplement-- 当前路径下源码文件：\n" + filename);
        System.out.println("getFunctionImplement-- 当前路径下包含特定类型的文件的个数: " + filename.size());

        if(path.endsWith(File.separator)){
            //System.out.println("!!!!!!!!!!!!"+path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");
        }
        else{
            path = path + File.separator;
            //System.out.println("!!!!!!!!!!!!"+path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");
        }
        PrintStream ps = new PrintStream(path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_FunctionCallNum.txt"); //输出流的文件名修改为.out文件


        for(int i = 0; i < filename.size(); i++){ //逐个文件，遍历生成ast
            try{
                String input = "";
                String str = "";
                BufferedReader bufferR = null;
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
                Date date1=new Date();
                System.out.println("getFunctionImplement-- TIME: " + df.format(date1));
                System.out.println("getFunctionImplement-- 正在遍历第" + (i+1) + "个文件：" + filename.get(i));
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
                                getReturnAndDataFlow(node, node, 0, paramList, returnList, func_paramter, func_return);
                                //getFuncDataConnection(funcname, func_paramter);
                                /*if (paramList.size()!=0){
                                    System.out.print("paramlist: ");
                                    for(String paramValue : paramList){
                                        if (paramValue != "<anonymous>"){
                                            System.out.print(paramValue + " ");
                                        }
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
                                //System.out.println("call getFuncImp\n");
                                //getFuncImp(funcname, paramList, returnList, func_paramter, func_return);
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
                System.out.println("getFunctionImplement-- TIME: " + df.format(date2));
                System.out.println("getFunctionImplement-- 导出out：" + path.substring(0,path.lastIndexOf(File.separator)) + File.separator + "project_CallFunctionName.out");

                long l = date2.getTime() - date1.getTime();
                long day=l/(24*60*60*1000);
                long hour=(l/(60*60*1000)-day*24);
                long min=((l/(60*1000))-day*24*60-hour*60);
                long s=(l/1000-day*24*60*60-hour*60*60-min*60);
                if(day>0){
                    System.out.println("getFunctionImplement-- 导出out耗时: "+day+"day"+hour+"hour"+min+"min"+s+"s\n");
                }else if(hour>0){
                    System.out.println("getFunctionImplement-- 导出out耗时: "+hour+"hour"+min+"min"+s+"\n");
                }else if(min>0){
                    System.out.println("getFunctionImplement-- 导出out耗时: "+min+"min"+s+"s\n");
                }else{
                    System.out.println("getFunctionImplement-- 导出out耗时: "+s+"s\n");
                }

                codeItems.clear();
            } catch (Exception e){
                continue;
            }
        }
        System.setOut(ps);
        Set<String> keySet = getFunctionCallNum.func_call.keySet();
        for (String functionName : keySet){
            //System.out.println(functionName);
            int num = getFunctionCallNum.func_call.get(functionName);
            System.out.println(functionName + num);
        }
        // print function connection
        /*Set<String> keySet = func_dep.keySet();
        for (String functionName : keySet){
            System.out.println(functionName);
            Map<String, List<String>> depMap = func_dep.get(functionName);
            Set<String> depSet = depMap.keySet();
            for (String depFunc : depSet){
                System.out.print(depFunc + " , ");
                List<String> argumentList = depMap.get(depFunc);
                for (int i = 0 ; i < argumentList.size() ; i++){
                    System.out.print(argumentList.get(i) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }*/
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
    public static void getReturnAndDataFlow(AstNode funcDefNode, AstNode node, int layer, List<String> paramlist, List<String> returnList, Map<String, List<String>> func_paramter, Map<String, String> func_return) {
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
                CallExpression callExpression = (CallExpression) returnExpression;
                String returnFunc = replace_escape_character(returnExpression.getChild(0).getEscapedCodeStr());
                //System.out.print("function:" + returnFunc);
                if (func_call.keySet().contains(returnFunc)){
                    int num = getFunctionCallNum.func_call.get(returnFunc);
                    getFunctionCallNum.func_call.put(returnFunc,num+1);
                }else {
                    getFunctionCallNum.func_call.put(returnFunc,1);
                }
                //System.out.print("function:" + returnFunc + " , ");
                ArgumentList argumentList = callExpression.getArgumentList();
                //System.out.print(0 + " ");
                int argumentCount = argumentList.getChildCount();
                for(int i = 0; i < argumentCount; i++) {
                    String argumentName = argumentList.getChild(i).getEscapedCodeStr();
                    for(int j = 0; j < paramlist.size(); j++){
                        String paramName = paramlist.get(j);
                        if(argumentName.equals(paramName)){
                            int index = j + 1;
                            System.out.print(index + " ");
                        }
                    }
                    //System.out.println("argumentName:" + argumentName);
                    //System.out.println("type:" + arg.getTypeAsString());
                    //returnArgumentList.add(argumentName);
                }
                System.out.println();
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
                String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
                //System.out.print("function:" + call_name);
                if (func_call.keySet().contains(call_name)){
                    int num = getFunctionCallNum.func_call.get(call_name);
                    getFunctionCallNum.func_call.put(call_name,num+1);
                }else {
                    getFunctionCallNum.func_call.put(call_name,1);
                }
            }
        }else if(node.getTypeAsString().equals("IfStatement")) {
            IfStatement temp_node = (IfStatement) node;
            Condition condition = (Condition) temp_node.getCondition();
            Expression ifExpression = condition.getExpression();
            if (ifExpression.getTypeAsString().equals("CallExpression")) {
                List<String> returnArgumentList = new ArrayList();
                CallExpression callExpression = (CallExpression) ifExpression;
                if (callExpression.getChildCount() != 0) {
                    String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
                    //System.out.print("function:" + call_name);
                    if (func_call.keySet().contains(call_name)){
                        int num = getFunctionCallNum.func_call.get(call_name);
                        getFunctionCallNum.func_call.put(call_name,num+1);
                    }else {
                        getFunctionCallNum.func_call.put(call_name,1);
                    }
                }
            }
        }else if(node.getTypeAsString().equals("CallExpression")){
            CallExpression callExpression = (CallExpression) node;
            String call_name = replace_escape_character(callExpression.getChild(0).getEscapedCodeStr());
            //System.out.print("function1:" + call_name);
            if (func_call.keySet().contains(call_name)){
                int num = getFunctionCallNum.func_call.get(call_name);
                getFunctionCallNum.func_call.put(call_name,num+1);
            }else {
                getFunctionCallNum.func_call.put(call_name,1);
            }
        }
        //System.out.print(getFunctionCallNum.func_call);
        CodeLocation location = node.getLocation();
        if (node.getChildCount() != 0) {
            Iterator children = node.getChildIterator();
            while (children.hasNext()) {
                try{
                    getReturnAndDataFlow(funcDefNode, (AstNode) children.next(), layer_temp + 1, paramlist, returnList, func_paramter, func_return);
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
    public static void getFuncImp(String defName, List<String> paramlist, List<String> returnList, Map<String, List<String>> func_paramter, Map<String, String> func_return) {
        //System.out.println("getFuncImp\n");
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
            String ret = "";
            if (func_return.containsKey(functionName)){
                ret = func_return.get(functionName);
            }
            // 遍历定义函数的参数与返回值列表，与函数返回值作比较
            for(int j = 0 ; j < returnList.size() ; j++){
                String retVar = returnList.get(j);
                if(retVar.equals(ret) || ret.contains(retVar + "->")){
                    if(!flag){
                        flag = true;
                        System.out.print("function: " + functionName + " , ");
                    }
                    System.out.print("ret ");
                    break;
                }
            }
            for(int j = 0 ; j < paramlist.size() ; j++){
                String param = paramlist.get(j);
                if(param.equals(ret) || ret.contains(param + "->")){
                    if(!flag){
                        flag = true;
                        System.out.print("function: " + functionName + " , ");
                    }
                    int index = j + 1;
                    System.out.print(index + " ");
                    break;
                }
            }
            // 遍历调用函数的参数列表，与函数参数及返回值列表作比较
            List<Integer> indexList = new ArrayList();
            for(int i = 0 ; i < argumentList.size() ; i++){
                String argument = argumentList.get(i);
                //System.out.println("argument:" + argument);
                for(int j = 0 ; j < returnList.size() ; j++){
                    String retVar = returnList.get(j);
                    if(retVar.equals(argument) || argument.contains(retVar + "->")){
                        if(!flag){
                            flag = true;
                            System.out.print("function: " + functionName + " , ");
                        }
                        System.out.print("ret ");
                        break;
                    }
                }
                for(int j = 0 ; j < paramlist.size() ; j++){
                    String param = paramlist.get(j);
                    if(param.equals(argument) || argument.contains(param + "->")){
                        if(!flag){
                            flag = true;
                            System.out.print("function: " + functionName + " , ");
                        }
                        int index = j + 1;
                        if (!indexList.contains(index)){
                            indexList.add(index);
                            System.out.print(index + " ");
                        }
                        break;
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

    public static int printSequence(AstNode node, int layer, int line_pre_level, int flag_for_if_another_line, String[] paramlist, List<String> returnList) {
        int current_line;
        int layer_temp = layer;
        int flag = 0;
        if (node.getTypeAsString().equals("AssignmentExpression")){
            AssignmentExpression temp_node = (AssignmentExpression) node;
            Expression left = temp_node.getLeft();
            Expression right = temp_node.getRight();
            if (right.getTypeAsString().equals("CallExpression")){
                String call_return = left.getEscapedCodeStr();
                String call_exp = right.getEscapedCodeStr();

                //System.out.println("left expression:" + left.getEscapedCodeStr());
                //System.out.println("right expression:" + right.getEscapedCodeStr());
                CallExpression callExpression = (CallExpression) right;
                //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                if(callExpression.getChildCount()!=0){
                    int i = 0;
                    while(i < callExpression.getChildCount()){
                        String call_name = replace_escape_character(callExpression.getChild(i).getEscapedCodeStr());
                        System.out.println("call func: " + call_name);
                        if(callExpression.getChild(i).getTypeAsString().equals("Callee")){
                            boolean match_flag = false;
                            //System.out.print("test Argument:\n");
                            ArgumentList argumentList = callExpression.getArgumentList();
                            int argumentCount = argumentList.getChildCount();
                            int ret_arg_count = argumentCount + 1;
                            String[] return_and_argument = new String[ret_arg_count];;
                            return_and_argument[0] = call_return;
                            for(int j = 1; j <= argumentCount; j++) {
                                String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                                return_and_argument[j] = argumentName;
                            }
                            for(int j = 0; j < ret_arg_count; j++) {
                                System.out.print("ret and arg name:" + return_and_argument[j]);
                            }
                            System.out.println();
                            /*for(int j = 0; j < ret_arg_count; j++) {
                                if (match_flag){
                                    break;
                                }
                                String name = argumentList.getChild(j).getEscapedCodeStr();
                                for(int k = 0; k < paramCount; k++) {
                                    if(paramlist[k].equals(name)){
                                        //System.out.print(replace_escape_character(callExpression.getChild(i).getEscapedCodeStr())+" ");  //这是2022年7月25日按照学长要求添加的输出调用函数名称的修改
                                        match_flag = true;
                                        break;
                                    }
                                }
                                //System.out.println(argumentList.getChild(k).getEscapedCodeStr()+" ");
                            }*/
                            //System.out.print(replace_escape_character(node_temp.getChild(i).getEscapedCodeStr())+" ");
                            //System.out.print("test Argument Count:"+node_temp.getArgumentList().getChildCount()+" ");
                            flag_for_if_another_line = 1;  //2022年7月25日，为了正确的换行设置的flag
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        /*if(node.getTypeAsString().equals("FunctionDef")){
            FunctionDef node_temp = (FunctionDef) node;
            System.out.println(node_temp.getIdentifier().getEscapedCodeStr());
            //System.out.println("Parameter:");
            //System.out.println(node_temp.getParameterList().getEscapedCodeStr());
            ParameterList paramlist = node_temp.getParameterList();
            paramCount = paramlist.getChildCount();
            paramArray = new String[paramCount];
            for(int j = 0; j < paramCount; j++) {
                ParameterBase paramBase = paramlist.getParameter(j);
                paramArray[j] = paramlist.getParameter(j).getName();
                System.out.println(paramArray[j]);
            }
        }*/
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

                    /*
                    ///////////////////修改固定输出
                    if(node.getTypeAsString().equals("IfStatement")){
                        IfStatement node_temp = (IfStatement) node;
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Condition=1;//临时调整，为了输出ifstatement:

                            if(sign_if_has_Condition>=0){
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    System.out.print("\n");
                                }
                                System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }
                    ///////////////////修改固定输出
                    */

                    node.setNodeStartLine(-1,node);//添加node的line/////////////
                }else {
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
                                //System.out.print("\n");
                            }
                            //System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    ///////////////////修改固定输出

                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location
                
                // 输出当前函数节点调用的所有函数
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        try{
                            if (location.startLine().isEmpty()) {
                                flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                            }else{
                                flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print("ElseStatement: else; "+node_temp.getTypeAsString()+": ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print("ElseStatement: else; "+node_temp.getTypeAsString()+": ");
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
                                        flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                                    }else{
                                        flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
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
                        //System.out.print("\nElseStatement: else; ");
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
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getName()+", ");   //这是2022年4、5月的时候，修改为输出functionname的代码，现在注释掉了
                            }
                            else if(node.getTypeAsString().equals("CompoundStatement")){
                                CompoundStatement node_temp = (CompoundStatement) node;

                                current_line=0;
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("ExpressionStatement")){
                                ExpressionStatement node_temp = (ExpressionStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
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
                                                    //System.out.print("\n");
                                                }
                                                //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                            }
                                        }
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("CallExpression")){
                                CallExpression node_temp = (CallExpression) node;
                                //System.out.print("test!!! "+node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                                if(node_temp.getChildCount()!=0){
                                    int i=0;
                                    int sign_if_has_Callee=-1;
                                    while(i<node_temp.getChildCount()){
                                        if(node_temp.getChild(i).getTypeAsString().equals("Callee")){
                                            sign_if_has_Callee=i;
                                            System.out.print(replace_escape_character(node_temp.getChild(i).getEscapedCodeStr())+" ");  //这是2022年7月25日按照学长要求添加的输出调用函数名称的修改
                                            flag_for_if_another_line = 1;  //2022年7月25日，为了正确的换行设置的flag
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
                                                        //System.out.print("\n");
                                                    }
                                                    //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("ClassDef")){
                                ClassDefStatement node_temp = (ClassDefStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("TryStatement")){
                                TryStatement node_temp = (TryStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("CatchStatement")){
                                CatchStatement node_temp = (CatchStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("BreakStatement")){
                                BreakStatement node_temp = (BreakStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                            }
                            else if(node.getTypeAsString().equals("ContinueStatement")){
                                ContinueStatement node_temp = (ContinueStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                            }
                            else if(node.getTypeAsString().equals("ReturnStatement")){
                                ReturnStatement node_temp = (ReturnStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": ");
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("ForStatement")){
                                ForStatement node_temp = (ForStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        //System.out.print("\n");
                                    }
                                    //System.out.print(node_temp.getTypeAsString()+": ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                            else if(node.getTypeAsString().equals("JumpStatement")){
                                JumpStatement node_temp = (JumpStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("ThrowStatement")){
                                ThrowStatement node_temp = (ThrowStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("DoStatement")){
                                DoStatement node_temp = (DoStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        //System.out.print("\n");
                                    }
                                    //System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("SwitchStatement")){
                                SwitchStatement node_temp = (SwitchStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        //System.out.print("\n");
                                    }
                                    //System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("Label")){
                                Label node_temp = (Label) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print("LabelStatement: "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("WhileStatement")){
                                WhileStatement node_temp = (WhileStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryExpression")){
                                UnaryExpression node_temp = (UnaryExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                                UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }





                            ///////////////////计算符号处理
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
                                                    //System.out.print("\n");
                                                }
                                                //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                            }
                                        }
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("ClassDef")){
                                ClassDefStatement node_temp = (ClassDefStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("CompoundStatement")){
                                CompoundStatement node_temp = (CompoundStatement) node;

                                current_line=0;
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("ExpressionStatement")){
                                ExpressionStatement node_temp = (ExpressionStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(s.getTypeAsString().equals("TryStatement")){
                                TryStatement node_temp = (TryStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("CatchStatement")){
                                CatchStatement node_temp = (CatchStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("BreakStatement")){
                                BreakStatement node_temp = (BreakStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                            }
                            else if(s.getTypeAsString().equals("ContinueStatement")){
                                ContinueStatement node_temp = (ContinueStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                            }
                            else if(s.getTypeAsString().equals("ReturnStatement")){
                                ReturnStatement node_temp = (ReturnStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Condition).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Condition).getEscapedCodeStr())+"; ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                            else if(s.getTypeAsString().equals("JumpStatement")){
                                JumpStatement node_temp = (JumpStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(s.getTypeAsString().equals("ThrowStatement")){
                                ThrowStatement node_temp = (ThrowStatement) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("DoStatement")){
                                DoStatement node_temp = (DoStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        //System.out.print("\n");
                                    }
                                    //System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(node.getTypeAsString().equals("SwitchStatement")){
                                SwitchStatement node_temp = (SwitchStatement) node;
                                if(node_temp.getChildCount()!=0){
                                    if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                        //System.out.print("\n");
                                    }
                                    //System.out.print(node_temp.getTypeAsString()+": ");
                                }
                            }
                            else if(s.getTypeAsString().equals("Label")){
                                Label node_temp = (Label) s;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print("LabelStatement: "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                            }
                            else if(node.getTypeAsString().equals("WhileStatement")){
                                WhileStatement node_temp = (WhileStatement) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryExpression")){
                                UnaryExpression node_temp = (UnaryExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                            else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                                UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                                if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
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
                                        flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                                    }else{
                                        flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                                    }
                                } catch (Exception e){
                                    continue;
                                }
                            }
                        }
                    }
                }
            }else{
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
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getName()+", ");   //这是2022年4、5月的时候，修改为输出functionname的代码，现在注释掉了
                    }
                    else if(node.getTypeAsString().equals("CompoundStatement")){
                        CompoundStatement node_temp = (CompoundStatement) node;

                        current_line=0;
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("ExpressionStatement")){
                        ExpressionStatement node_temp = (ExpressionStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
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
                                    System.out.print(replace_escape_character(node_temp.getChild(i).getEscapedCodeStr())+" ");  //这是2022年7月25日按照学长要求添加的输出调用函数名称的修改
                                    flag_for_if_another_line = 1;  //2022年7月25日，为了正确的换行设置的flag
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
                                                //System.out.print("\n");
                                            }
                                            //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ClassDef")){
                        ClassDefStatement node_temp = (ClassDefStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr()));
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
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }





                    ///////////////////计算符号处理

                    ///////////////////计算符号处理

                    ///////////////////修改固定输出

                }else {
                    int startlineSome = (int) location.startLine().get();
                    current_line=startlineSome;
                    //System.out.println("#########:"+startlineSome + ":" + node.getTypeAsString() + ":" + replace_escape_character(node.getEscapedCodeStr()));


                    ///////////////////修改固定输出
                    if(node.getTypeAsString().equals("FunctionDef")){
                        FunctionDefBase node_temp = (FunctionDefBase) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getName()+", ");   //这是2022年4、5月的时候，修改为输出functionname的代码，现在注释掉了
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
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": ");
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
                                            //System.out.print("\n");
                                        }
                                        //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_IdentifierDecl).getChild(sign_if_has_IdentifierDeclType).getEscapedCodeStr())+"; ");
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("CallExpression")){
                        /*FunctionDef func_node = (FunctionDef) node;
                        System.out.println(func_node.getParameterList().getEscapedCodeStr());*/
                        CallExpression node_temp = (CallExpression) node;
                        //System.out.println(node_temp.getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getTypeAsString()+": "+node_temp.getChild(0).getChild(0).getEscapedCodeStr()+"; ");
                        if(node_temp.getChildCount()!=0){
                            int i=0;
                            int sign_if_has_Callee=-1;
                            while(i<node_temp.getChildCount()){
                                if(node_temp.getChild(i).getTypeAsString().equals("Callee")){
                                    boolean match_flag = false;
                                    sign_if_has_Callee=i;
                                    //System.out.print("test Argument:\n");
                                    ArgumentList argumentList = node_temp.getArgumentList();
                                    int argumentCount = argumentList.getChildCount();
                                    for(int j = 0; j < argumentCount; j++) {
                                        if (match_flag){
                                            break;
                                        }
                                        String argumentName = argumentList.getChild(j).getEscapedCodeStr();
                                        for(int k = 0; k < paramlist.length; k++) {
                                            /*ParameterBase paramBase = paramlist.getParameter(j);
                                            paramArray[j] = paramlist.getParameter(j).getName();
                                            System.out.println(paramArray[j]);*/
                                            if(paramlist[k].equals(argumentName)){
                                                System.out.print(replace_escape_character(node_temp.getChild(i).getEscapedCodeStr())+" ");  //这是2022年7月25日按照学长要求添加的输出调用函数名称的修改
                                                match_flag = true;
                                                break;
                                            }
                                        }
                                        //System.out.println(argumentList.getChild(k).getEscapedCodeStr()+" ");
                                    }
                                    //System.out.print(replace_escape_character(node_temp.getChild(i).getEscapedCodeStr())+" ");
                                    //System.out.print("test Argument Count:"+node_temp.getArgumentList().getChildCount()+" ");
                                    flag_for_if_another_line = 1;  //2022年7月25日，为了正确的换行设置的flag
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
                                                //System.out.print("\n");
                                            }
                                            //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Callee).getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ClassDef")){
                        ClassDefStatement node_temp = (ClassDefStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getIdentifier().getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("TryStatement")){
                        TryStatement node_temp = (TryStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("CatchStatement")){
                        CatchStatement node_temp = (CatchStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("BreakStatement")){
                        BreakStatement node_temp = (BreakStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node.getTypeAsString()+": "+"break"+"; ");
                    }
                    else if(node.getTypeAsString().equals("ContinueStatement")){
                        ContinueStatement node_temp = (ContinueStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node.getTypeAsString()+": "+"continue"+"; ");
                    }
                    else if(node.getTypeAsString().equals("ReturnStatement")){
                        ReturnStatement node_temp = (ReturnStatement) node;
                        //if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        //}
                        String returnStatement = node_temp.getEscapedCodeStr();
                        System.out.print("return statement:" + returnStatement +"\n");
                        //System.out.print(node.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
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
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": ");
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("ForStatement")){
                        ForStatement node_temp = (ForStatement) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                //System.out.print("\n");
                            }
                            //System.out.print(node_temp.getTypeAsString()+": ");
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
                                    //System.out.print("\n");
                                }
                                //System.out.print(node_temp.getTypeAsString()+": "+node_temp.getChild(sign_if_has_Identifier).getTypeAsString()+": "+replace_escape_character(node_temp.getChild(sign_if_has_Identifier).getEscapedCodeStr())+"; ");
                            }
                        }
                    }
                    else if(node.getTypeAsString().equals("JumpStatement")){
                        JumpStatement node_temp = (JumpStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+"; ");
                    }
                    else if(node.getTypeAsString().equals("ThrowStatement")){
                        ThrowStatement node_temp = (ThrowStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": "+replace_escape_character(node_temp.getEscapedCodeStr())+" ");
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
                                //System.out.print("\n");
                            }
                            //System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("SwitchStatement")){
                        SwitchStatement node_temp = (SwitchStatement) node;
                        if(node_temp.getChildCount()!=0){
                            if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                                //System.out.print("\n");
                            }
                            //System.out.print(node_temp.getTypeAsString()+": ");
                        }
                    }
                    else if(node.getTypeAsString().equals("Label")){
                        Label node_temp = (Label) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print("LabelStatement: "+replace_escape_character(replace_escape_character(node_temp.getEscapedCodeStr()))+"; ");
                    }
                    else if(node.getTypeAsString().equals("WhileStatement")){
                        WhileStatement node_temp = (WhileStatement) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("UnaryExpression")){
                        UnaryExpression node_temp = (UnaryExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }
                    else if(node.getTypeAsString().equals("UnaryOperationExpression")){
                        UnaryOperationExpression node_temp = (UnaryOperationExpression) node;
                        if((line_pre_level!=current_line)&&(current_line>=0)&&(line_pre_level>=0)){
                            //System.out.print("\n");
                        }
                        //System.out.print(node_temp.getTypeAsString()+": ");
                    }





                    ///////////////////计算符号处理

                    ///////////////////计算符号处理

                    ///////////////////修改固定输出

                    node.setNodeStartLine(startlineSome,node);//添加node的line/////////////
                }///////////////添加location
                if (node.getChildCount() != 0) {
                    Iterator children = node.getChildIterator();
                    while (children.hasNext()) {
                        try{
                            if (location.startLine().isEmpty()) {
                                flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                            }else{
                                flag_for_if_another_line=printSequence((AstNode) children.next(), layer_temp + 1,current_line, flag_for_if_another_line,paramlist,returnList);
                            }
                        } catch (Exception e){
                            continue;
                        }
                    }
                }
            }
        }
        return flag_for_if_another_line;
    }

}