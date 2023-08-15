package io.shiftleft.fuzzyc2cpg;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.declarations.ClassDefStatement;
import io.shiftleft.fuzzyc2cpg.ast.declarations.IdentifierDecl;
import io.shiftleft.fuzzyc2cpg.ast.expressions.*;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.ParameterBase;
import io.shiftleft.fuzzyc2cpg.ast.functionDef.ParameterList;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.CallExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.expressions.SizeofExpression;
import io.shiftleft.fuzzyc2cpg.ast.langc.functiondef.FunctionDef;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.ElseStatement;
import io.shiftleft.fuzzyc2cpg.ast.langc.statements.blockstarters.IfStatement;
import io.shiftleft.fuzzyc2cpg.ast.logical.statements.CompoundStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.ExpressionStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.IdentifierDeclStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.DoStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.ForStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.SwitchStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.blockstarters.WhileStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.jump.GotoStatement;
import io.shiftleft.fuzzyc2cpg.ast.statements.jump.ReturnStatement;
import io.shiftleft.fuzzyc2cpg.parser.TokenSubStream;
import io.shiftleft.fuzzyc2cpg.parser.modules.AntlrCModuleParserDriver;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ASTGenerator {
    public final Set<String> binaryOperationExpressionSet = new HashSet<String>() {{
        add("AdditiveExpression");
        add("AndExpression");
        add("AssignmentExpression");
        add("BitAndExpression");
        add("EqualityExpression");
        add("ExclusiveOrExpression");
        add("InclusiveOrExpression");
        add("MultiplicativeExpression");
        add("OrExpression");
        add("RelationalExpression");
        add("ShiftExpression");
    }};

    public static void main(String[] args) throws Exception{
        ASTGenerator astGen = new ASTGenerator();
        long startTime = System.currentTimeMillis();

        String srcBasePath = "", astBasePath="";
        /*if (args.length != 2) {
            System.out.println("2 parameters are needed. WRONG!");
            System.out.println("\t java -jar [src_file_path] [ast_store_path]");
            System.exit(0);
        } else {
            srcBasePath = args[0];
            astBasePath = args[1];
        }*/

        srcBasePath = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test";
        //srcBasePath = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test_c++_preprocessed_llvm14.0.1_bolt_lib_Core_part";
        astBasePath = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test";
        //astBasePath = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test_c++_preprocessed_llvm14.0.1_bolt_lib_Core_part";


        Path srcParentP = Paths.get(srcBasePath).getParent();
        Path astBaseP = Paths.get(astBasePath);
        Path preprocessP = Paths.get(srcBasePath).resolve("temp"); // 在源目录下构建一个temp临时目录用于存放预处理文件

        List<String> filelist = new ArrayList<>();          //存储路径中所有的file
        filelist = astGen.getFile(srcBasePath, filelist);  //在这里定义了只获取*.c文件
        int fileCount = filelist.size();
        System.out.println("待处理目录：" + srcBasePath);     //输出文件所在位置
        System.out.println("检索到包含特定类型的文件的个数: " + fileCount);

        for (int i = 0; i < fileCount; i++) {
            String srcFilePath = filelist.get(i);
            Path fileP = Paths.get(srcFilePath);
            Path relativeP = srcParentP.relativize(fileP.getParent());

            // 预处理
            Path preprocessFileP = preprocessP.resolve(relativeP);
            if(Files.notExists(preprocessFileP)){
                Files.createDirectories(preprocessFileP);
            }
            preprocessFileP = preprocessFileP.resolve(fileP.getFileName());
            PrintStream out = new PrintStream(System.out, true);    // 此处的setOut很有意思
            astGen.preprocess(srcFilePath, preprocessFileP.toString());
            System.setOut(out);
            System.out.println("预处理结束");

            // 生成AST
            Path targetFileP = astBaseP.resolve(relativeP);
            if (Files.notExists(targetFileP)) {
                Files.createDirectories(targetFileP);
            }
            Path targetFilepath = targetFileP.resolve(fileP.getFileName().toString().replace(".c", ".json"));
            if (Files.exists(targetFilepath)) {        //若AST文件已存在，则删除之
                Files.delete(targetFilepath);
            }
            String astFilePath = targetFilepath.toString();
            if(Files.notExists(preprocessFileP)){
                System.out.println(String.format("[%d / %d] 预处理异常. file:%s ", i + 1, fileCount, srcFilePath));
                continue;
            }

            astGen.getAST(srcFilePath, astFilePath);   // 将源文件转换为AST格式并保存
            long currentTime = System.currentTimeMillis(); // 统计时间
            System.out.println(String.format("[%d / %d] AST已生成.Elapsed-Time:%d s file:%s ", i + 1, fileCount, (currentTime - startTime) / 1000, srcFilePath));
        }

        // 删除临时目录temp
        if(Files.exists(preprocessP)){
            astGen.deleteFiles(preprocessP.toFile());
        }
    }

    public List<String> getFile(String path, List<String> filelist) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                if (array[i].getPath().endsWith(".c")) {
                    filelist.add(array[i].getPath());
                }
            } else if (array[i].isDirectory()) {
                filelist = getFile(array[i].getPath(), filelist);
            }
        }
        return filelist;
    }

    public List<AstNode> parseInput(String input) {     //主要的调用函数
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
        return testProcessor.codeItems;     //返回处理得到的codeitems
    }

    /**
     * 将源文件（。c） 预处理
     * @param srcFilePath 源文件路径
     * @param storePath   预处理后存放路径
     */
    private void preprocess(String srcFilePath, String storePath) throws Exception {
        preprocessLexer lex = new preprocessLexer(new ANTLRFileStream(srcFilePath, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        PrintStream ps = new PrintStream(storePath);
        System.setOut(ps);
        preprocessParser g = new preprocessParser(tokens);
        g.code();
        ps.close();
    }

    private boolean deleteFiles(File file){
        if(file == null || !file.exists()){
            System.out.println("删除失败，请检查路径是否正确。");
            return false;
        }
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isDirectory()){
                deleteFiles(f);
            } else{
                f.delete();
            }
        }
        file.delete();
        return true;
    }

    /**
     * 将源文件 (.c) 转换为AST树（.json）
     * @param srcFilePath   源文件路径
     * @param astStorePath  AST文件存放路径
     * @throws IOException
     */
    public void getAST(String srcFilePath, String astStorePath) throws IOException {
        String input = "";
        String str = "";
        long start = System.currentTimeMillis();
        BufferedReader bufferR = new BufferedReader(new FileReader(srcFilePath));//获取所有的流信息，然后存入bufferR
        while ((str = bufferR.readLine()) != null) {
            input = input + str + "\r\n";
            long current = System.currentTimeMillis();
            if((current-start)/1000 > 60){   //TODO: 丢弃读取耗时较长的文件（一般为数据文件， 时间阈值设定为60s）
                input = "";
                break;
            }
        }   //逐行把程序代码存入input
        bufferR.close();  //关闭流bufferedreader
        List<AstNode> codeItems = parseInput(input); //开始调用函数parseInput

        Map<String, Object> astContent = new HashMap<>();
        Path fileP = Paths.get(srcFilePath);
        astContent.put("filename", fileP.getFileName().toString());
        List<Object> contentList = new LinkedList<>();
        astContent.put("content", contentList);

        Iterator it = codeItems.iterator();
        while (it.hasNext()) {
            try{        // TODO : 暂时忽略转换过程中有异常的Node
                Map<String, Object> module = new HashMap<>();
                contentList.add(module);
                AstNode node = (AstNode) it.next();

                String nodeType = node.getTypeAsString();
                if(nodeType.equals("FunctionDef")){
                    FunctionDef funcDefNode = (FunctionDef) node;
                    Map<String, Object> funcDefMap = new HashMap();
                    module.put("functionDef", funcDefMap);

                    funcDefMap.put("functionName", funcDefNode.getIdentifier().getEscapedCodeStr());
                    funcDefMap.put("returnType", funcDefNode.getReturnType().getEscapedCodeStr());
                    List<Object> parameterList = new LinkedList<>();
                    funcDefMap.put("parameterList", parameterList);
                    ParameterList paramlist = funcDefNode.getParameterList();
                    int paramCount = paramlist.getChildCount();
                    for(int i = 0; i < paramCount; i++) {
                        ParameterBase paramBase = paramlist.getParameter(i);
                        Map<String, String> paramItem = new HashMap<>();
                        paramItem.put("parameterType", paramBase.getType().getEscapedCodeStr());
                        paramItem.put("parameter", paramBase.getName());
                        parameterList.add(paramItem);
                    }

                    List<AstNode> stmtList = funcDefNode.getContent().getStatements();
                    List<Object> statements = new LinkedList<>(); //
                    funcDefMap.put("functionBody", statements);

                    for(int i = 0; i < stmtList.size(); i++) {
                        Map<String, Object> stmtItem = new HashMap<>();
                        getStatementAST(stmtList.get(i), stmtItem);
                        statements.add(stmtItem);
                    }
                } else if(nodeType.equals("IdentifierDeclStatement")){    // 全局变量
                    getStatementAST(node, module);
                } else if(nodeType.equals("ClassDefStatement")){          //  结构体定义
                    getStatementAST(node, module);                         // TODO: 尚无法获得enum中定义的内容
                }
            } catch (Exception e){
                continue;
            }
        }

        // Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();  //优雅输出json
        String fileStream = gson.toJson(astContent);
        PrintWriter pw = new PrintWriter(astStorePath);
        pw.println(fileStream);
        pw.close();
    }

    /**
     * @ 功能  将语句（Statement）转换成AST树. 对getAST中遍历到的每条语句执行
     * @param node      Statement Node
     * @param stmtMap   AST map of Statement
     */
    private void getStatementAST(AstNode node, Map<String, Object> stmtMap) {
        String nodeType = node.getTypeAsString();
        if(nodeType.equals("IdentifierDeclStatement")) {        // 变量声明语句
            IdentifierDeclStatement idDeclStmt = (IdentifierDeclStatement) node;
            List<AstNode> idDeclNodeList = idDeclStmt.getIdentifierDeclList();
            List<Object> idDeclList = new LinkedList<>();
            stmtMap.put("identifierDeclStatement", idDeclList);
            for(int i = 0; i < idDeclNodeList.size(); i++) {
                IdentifierDecl idDeclNode = (IdentifierDecl) (idDeclNodeList.get(i));
                Map<String, String> idDecl = new HashMap<>();
                idDecl.put("identifierType", idDeclNode.getType().completeType);
                idDecl.put("identifier", idDeclNode.getName().getEscapedCodeStr());
                if(idDeclNode.getAssignment() != null){
                    idDecl.put("initialValue", idDeclNode.getAssignment().getRight().getEscapedCodeStr());
                }
                idDeclList.add(idDecl);
            }

        } else if(nodeType.equals("ClassDefStatement")) {
            ClassDefStatement classDefStmt = (ClassDefStatement) node;
            Map<String, Object> classDefMap = new HashMap<>();
            stmtMap.put("classDefStatement", classDefMap);

            classDefMap.put("className", classDefStmt.identifier.getEscapedCodeStr());

            CompoundStatement defBlock = classDefStmt.content;
            Map<String, Object> defMap = new HashMap<>();
            classDefMap.put("definition", defMap);
            getStatementAST(defBlock, defMap);
        } else if (nodeType.equals("ExpressionStatement")) {        // 表达式语句
            ExpressionStatement expStmt = (ExpressionStatement) node;
            Expression exp = expStmt.getExpression();
            Map<String, Object> expMap = new HashMap<>();
            stmtMap.put("expressionStatement", expMap);
            getExpressionAST(exp, expMap);

        } else if (nodeType.equals("IfStatement")){                 //  If语句
            IfStatement ifStmt = (IfStatement) node;
            Map<String, Object> ifMap = new HashMap<>();
            stmtMap.put("ifStatement", ifMap);

            Expression cond = ifStmt.getCondition();
            Map<String, Object> ifCondMap = new HashMap<>();
            getExpressionAST(cond, ifCondMap);
            ifMap.put("condition", ifCondMap);

            // if-block
            AstNode ifBlock = ifStmt.getStatement();
            if(ifBlock != null){
                Map<String, Object> ifBlockMap = new HashMap<>();
                getStatementAST(ifBlock, ifBlockMap);
                ifMap.put("ifBlock", ifBlockMap);
            }

            // if else-block exist
            ElseStatement elseStmt = ifStmt.getElseNode();
            if(elseStmt != null){
                AstNode elseBlock = elseStmt.getStatement();
                Map<String, Object> elseBlockMap = new HashMap<>();
                getStatementAST(elseBlock, elseBlockMap);
                ifMap.put("elseBlock", elseBlockMap);
            }

        } else if (nodeType.equals("SwitchStatement")){                 // switch语句
            SwitchStatement switchStmt = (SwitchStatement) node;
            Map<String, Object> switchStmtMap = new HashMap<>();
            stmtMap.put("switchStatement", switchStmtMap);

            // condition
            Expression cond = switchStmt.getCondition();
            Map<String, Object> condMap = new HashMap<>();
            getExpressionAST(cond, condMap);
            switchStmtMap.put("condition", condMap);

            // switch-block
            AstNode switchBlock = switchStmt.getStatement();
            if(switchBlock != null){
                Map<String, Object> switchBlockMap = new HashMap<>();
                getStatementAST(switchBlock, switchBlockMap);
                switchStmtMap.put("switchBlock", switchBlockMap);
            }

        } else if(nodeType.equals("Label")){                        // label
            stmtMap.put("label", node.getEscapedCodeStr());

        } else if(nodeType.equals("GotoStatement")){                // goto语句
            GotoStatement gotoStmt = (GotoStatement) node;
            Map<String, Object> gotoStmtMap = new HashMap<>();
            stmtMap.put("gotoStatement", gotoStmtMap);

            Iterator<AstNode> gotoChildIt = gotoStmt.getChildIterator();
            while (gotoChildIt.hasNext()){
                AstNode child = gotoChildIt.next();
                if(child.getTypeAsString().equals("Identifier")){
                    gotoStmtMap.put("goto", child.getEscapedCodeStr());
                }
            }

        } else if(nodeType.equals("ForStatement")){                 // for语句
            ForStatement forStmt = (ForStatement) node;
            Map<String, Object> forMap = new HashMap<>();
            stmtMap.put("forStatement", forMap);

            // for-init
            Expression forInit = forStmt.getForInitExpression();

            Map<String, Object> forInitMap = new HashMap<>();
            if(forInit.getChildCount() > 0){
                AstNode forInitNode = forInit.getChild(0);
                String forInitType = forInitNode.getTypeAsString();
                if(forInitType.equals("IdentifierDeclStatement")) {   // for (int i=0;...)
                    getStatementAST(forInitNode, forInitMap);
                } else{                                               // for (i=0; ...)
                    getExpressionAST((Expression) forInitNode, forInitMap);
                }
            }
            forMap.put("forInit", forInitMap);

            // condition
            Expression cond = forStmt.getCondition();
            Map<String, Object> forCondMap = new HashMap<>();
            getExpressionAST(cond, forCondMap);
            forMap.put("condition", forCondMap);

            // loop
            Expression forLoop = forStmt.getForLoopExpression();
            Map<String, Object> forLoopMap = new HashMap<>();
            getExpressionAST(forLoop, forLoopMap);
            forMap.put("forLoop", forLoopMap);

            // for block
            AstNode forBlock = forStmt.getStatement();
            if(forBlock != null){
                Map<String, Object> forBlockMap = new HashMap<>();
                getStatementAST(forBlock, forBlockMap);
                forMap.put("forBlock", forBlockMap);
            }

        } else if(nodeType.equals("WhileStatement")){               // while语句
            WhileStatement whileStmt = (WhileStatement) node;
            Map<String, Object> whileMap = new HashMap<>();
            stmtMap.put("whileStatement", whileMap);

            Expression cond = whileStmt.getCondition();
            Map<String, Object> whileCondMap = new HashMap<>();
            getExpressionAST(cond, whileCondMap);
            whileMap.put("condition", whileCondMap);

            // while block
            AstNode whileBlock = whileStmt.getStatement();
            if(whileBlock != null){
                Map<String, Object> whileBLockMap = new HashMap<>();
                getStatementAST(whileBlock, whileBLockMap);
                whileMap.put("whileBlock", whileBLockMap);
            }

        } else if(nodeType.equals("DoStatement")){                  // do-while语句
            DoStatement doStmt = (DoStatement) node;
            Map<String, Object> doWhileMap = new HashMap<>();
            stmtMap.put("doWhileStatement", doWhileMap);

            Expression cond = doStmt.getCondition();
            Map<String, Object> doWhileCondMap = new HashMap<>();
            getExpressionAST(cond, doWhileCondMap);
            doWhileMap.put("condition", doWhileCondMap);

            // do-while block
            AstNode doWhileBlock = doStmt.getStatement();
            if(doWhileBlock != null){
                Map<String, Object> doWhileBlockMap = new HashMap<>();
                getStatementAST(doWhileBlock, doWhileBlockMap);
                doWhileMap.put("doWhileBlock", doWhileBlockMap);
            }

        } else if(nodeType.equals("ContinueStatement")){            // continue语句
            stmtMap.put("continueStatement", "continue");
        } else if(nodeType.equals("BreakStatement")){               // break语句
            stmtMap.put("breakStatement", "break");
        } else if(nodeType.equals("ReturnStatement")){              // return语句
            ReturnStatement retStmt = (ReturnStatement) node;
            Map<String, Object> retMap = new HashMap<>();
            getExpressionAST(retStmt.getReturnExpression(), retMap);
            stmtMap.put("returnStatement", retMap);

        } else if(nodeType.equals("CompoundStatement")){            // 复合语句
            CompoundStatement compStmt = (CompoundStatement) node;
            List<AstNode> compStmtNodeList =  compStmt.getStatements();
            List<Object> compStmtList = new LinkedList<>();
            stmtMap.put("compoundStatement", compStmtList);

            for(int i = 0; i < compStmtNodeList.size(); i++) {
                Map<String, Object> stmtInCompMap = new HashMap<>();
                getStatementAST(compStmtNodeList.get(i), stmtInCompMap);
                compStmtList.add(stmtInCompMap);
            }
        }
    }

    /**
     * @ 功能  将表达式（Expression）转换为AST树。 对getStatementAST（）中遍历到的每个表达式执行
     * @param expression    Expression Node
     * @param expMap        AST map of Expression
     */
    private void getExpressionAST(Expression expression, Map<String, Object> expMap) {
        if(expression  == null){    // 空语句
            return ;
        }
        String expType = expression.getTypeAsString();
        if(binaryOperationExpressionSet.contains(expType)){      // 二元操作 leftOperand op rightOperand
            BinaryExpression binaryExp = (BinaryExpression)expression;
            Map<String, Object> binaryExpMap = new HashMap<>();
            expMap.put(expType, binaryExpMap);

            Map<String, Object> leftExpMap = new HashMap<>();
            getExpressionAST(binaryExp.getLeft(), leftExpMap);
            binaryExpMap.put("leftOperand", leftExpMap);

            Map<String, Object> rightExpMap = new HashMap<>();
            getExpressionAST(binaryExp.getRight(), rightExpMap);
            binaryExpMap.put("rightOperand", rightExpMap);

            binaryExpMap.put("operator", binaryExp.getOperator());

        } else if(expType.equals("PostIncDecOperationExpression")){  // 后自增（operand ++）、后自减（operand -- ）
            PostIncDecOperationExpression postIncDecExp = (PostIncDecOperationExpression) expression;
            Map<String, Object> postIncDecExpMap = new HashMap<>();
            expMap.put("postIncDecOperationExpression", postIncDecExpMap);

            Iterator<AstNode> childIt = postIncDecExp.getChildIterator();
            while (childIt.hasNext()){
                AstNode child = childIt.next();
                String type = child.getTypeAsString();
                if(type.equals("IncDec")){  // 操作符
                    postIncDecExpMap.put("operator", child.getEscapedCodeStr());
                } else {                    // 操作数
                    Map<String, Object> postIncDecOperandExpMap = new HashMap<>();
                    postIncDecExpMap.put("operand", postIncDecOperandExpMap);
                    getExpressionAST((Expression) child, postIncDecOperandExpMap);
                }
            }
//            String op = postIncDecExp.getOperator();  // getOperator() null
//            String variable = postIncDecExp.getVariableExpression().getEscapedCodeStr();
        } else if(expType.equals("UnaryExpression")){               // 前自增（++ operand）、前自减(-- operand)
            UnaryExpression unaryExp = (UnaryExpression) expression;
            Map<String, Object> unaryExpMap = new HashMap<>();
            expMap.put("unaryExpression", unaryExpMap);

            Iterator<AstNode> unaryChildIt = unaryExp.getChildIterator();
            while (unaryChildIt.hasNext()){
                AstNode child = unaryChildIt.next();
                String type = child.getTypeAsString();
                if(type.equals("IncDec")){   // 操作符
                    unaryExpMap.put("operator", child.getEscapedCodeStr());
                } else {      // 操作数
                    Map<String, Object> unaryOperandExpMap = new HashMap<>();
                    unaryExpMap.put("operand", unaryOperandExpMap);
                    getExpressionAST((Expression) child, unaryOperandExpMap);
                }
            }

        } else if(expType.equals("UnaryOperationExpression")){         // 取负值(- num)、取反（！cond）、 指针（* p）、引用（& num）
            UnaryOperationExpression unaryOpExp = (UnaryOperationExpression) expression;
            Map<String, Object> unaryOpExpMap = new HashMap<>();
            expMap.put("unaryOperationExpression", unaryOpExpMap);

            // operator
            Iterator<AstNode> unaryOpChildIt = unaryOpExp.getChildIterator();
            while (unaryOpChildIt.hasNext()){
                AstNode child = unaryOpChildIt.next();
                String type = child.getTypeAsString();
                if(type.equals("UnaryOperator")){
                    unaryOpExpMap.put("operator", child.getEscapedCodeStr());
                    break;
                }
            }

            // operand
            Expression unaryOperandExp = unaryOpExp.getExpression();
            Map<String, Object> unaryOperandExpMap = new HashMap<>();
            getExpressionAST(unaryOperandExp, unaryOperandExpMap);
            unaryOpExpMap.put("operand", unaryOperandExpMap);

        } else if(expType.equals("CastExpression")){                // 强制类型转换表达式
            CastExpression castExp = (CastExpression) expression;
            Map<String, Object> castExpMap = new HashMap<>();
            expMap.put("castExpression", castExpMap);

            // cast target type
            castExpMap.put("target", castExp.getCastTarget().getEscapedCodeStr());

            // cast expression
            Expression originalExp = castExp.getCastExpression();
            Map<String, Object> originalExpMap = new HashMap<>();
            getExpressionAST(originalExp, originalExpMap);
            castExpMap.put("originalExpression", originalExpMap);

        } else if(expType.equals("ConditionalExpression")){         // 三目运算  condition ? true : false;
            ConditionalExpression condExp = (ConditionalExpression) expression;
            Map<String, Object> condExpMap = new HashMap<>();
            expMap.put("conditionalExpression", condExpMap);

            Map<String, Object> condMap = new HashMap<>();
            getExpressionAST((Expression) condExp.getChild(0), condMap);
            condExpMap.put("condition",condMap);

            Map<String, Object> trueMap = new HashMap<>();
            getExpressionAST((Expression) condExp.getChild(1), trueMap);
            condExpMap.put("trueExpression", trueMap);

            Map<String, Object> falseMap = new HashMap<>();
            getExpressionAST((Expression) condExp.getChild(2), falseMap);
            condExpMap.put("falseExpression", falseMap);

            //TODO : getCondition() getTrueExpression() getFalseExpression() 返回值为null
//            Map<String, Object> condMap = new HashMap<>();
//            Expression condition = condExp.getCondition();
//            getExpressionAST(condExp.getCondition(), condMap);
//            condExpMap.put("condition",condMap);
//
//            Map<String, Object> trueMap = new HashMap<>();
//            Expression trueExp = condExp.getTrueExpression();
//            getExpressionAST(condExp.getTrueExpression(), trueMap);
//            condExpMap.put("trueExpression", trueMap);
//
//            Map<String, Object> falseMap = new HashMap<>();
//            Expression falseExp = condExp.getFalseExpression();
//            getExpressionAST(condExp.getFalseExpression(), falseMap);
//            condExpMap.put("falseExpression", falseMap);

        } else if(expType.equals("Condition")) {
            Expression cond = ((Condition) expression).getExpression();
            getExpressionAST(cond, expMap);

        } else if(expType.equals("CallExpression")){        // 函数调用
            CallExpression callExp = (CallExpression) expression;
            Map<String, Object> callMap = new HashMap<>();
            expMap.put("callExpression", callMap);

            callMap.put("callee", callExp.getTargetFunc().getEscapedCodeStr());
            List<Object> argList = new LinkedList<>();
            callMap.put("argumentList", argList);
            ArgumentList argNodeList = callExp.getArgumentList();
            Iterator<AstNode> argIt = argNodeList.getChildIterator();
            while(argIt.hasNext()){
                Expression argExp = (Expression) argIt.next().getChild(0);
                Map<String, Object> argMap = new HashMap<>();
                getExpressionAST(argExp, argMap);
                argList.add(argMap);
            }

        } else if(expType.equals("SizeofExpression")) {                           // sizeof操作
            SizeofExpression sizeofExp = (SizeofExpression) expression;
            Map<String, Object> sizeofExpMap = new HashMap<>();
            expMap.put("sizeofExpression", sizeofExpMap);

            Iterator<AstNode> sizeofChildIt = sizeofExp.getChildIterator();
            while (sizeofChildIt.hasNext()){
                AstNode child = sizeofChildIt.next();
                String type = child.getTypeAsString();
                if(type.equals("Sizeof")){
                    sizeofExpMap.put("operator","sizeof");
                } else {
                    Map<String, Object> sizeOfOperandMap = new HashMap<>();
                    sizeofExpMap.put("operand", sizeOfOperandMap);
                    getExpressionAST((Expression) child, sizeOfOperandMap);
                }
            }

        } else if(expType.equals("ArrayIndexing")) {                   // 数组
            ArrayIndexing arrayIndexingExp = (ArrayIndexing) expression;
            Map<String, Object> arrayIndexingExpMap = new HashMap<>();
            expMap.put("arrayIndexing", arrayIndexingExpMap);

            // array-name
            arrayIndexingExpMap.put("array", arrayIndexingExp.getArrayExpression().getEscapedCodeStr());
            // index
            Expression index = arrayIndexingExp.getIndexExpression();
            Map<String, Object> indexMap = new HashMap<>();
            getExpressionAST(index, indexMap);
            arrayIndexingExpMap.put("index", indexMap);

        } else if(expType.equals("MemberAccess")){
            MemberAccess memberAccessExp = (MemberAccess) expression;
            Map<String, Object> memberAccessExpMap = new HashMap<>();
            expMap.put("memberAccess", memberAccessExpMap);
            if(memberAccessExp.getChildCount() == 2){
                memberAccessExpMap.put("leftOperand", memberAccessExp.getChild(0).getEscapedCodeStr());  // leftOperand
                memberAccessExpMap.put("rightOperand", memberAccessExp.getChild(1).getEscapedCodeStr()); //rightOperand
                memberAccessExpMap.put("operator", "."); //operator     struct.member
            }

        } else if(expType.equals("PtrMemberAccess")){
            PtrMemberAccess ptrMemberAccessExp = (PtrMemberAccess) expression;
            Map<String, Object> ptrMemberAccessExpMap = new HashMap<>();
            expMap.put("ptrMemberAccess", ptrMemberAccessExpMap);
            if(ptrMemberAccessExp.getChildCount() == 2){
                ptrMemberAccessExpMap.put("leftOperand", ptrMemberAccessExp.getChild(0).getEscapedCodeStr());   // leftOperand
                ptrMemberAccessExpMap.put("rightOperand", ptrMemberAccessExp.getChild(1).getEscapedCodeStr());  // rightOperand
                ptrMemberAccessExpMap.put("operator", "->");    //operator struct -> member
            }

        } else if (expType.equals("Identifier")) {                      // 变量
            expMap.put("identifier", expression.getEscapedCodeStr());
        } else if (expType.equals("Constant")) {                        // 常量
            expMap.put("constant", expression.getEscapedCodeStr());
        }
    }
}
