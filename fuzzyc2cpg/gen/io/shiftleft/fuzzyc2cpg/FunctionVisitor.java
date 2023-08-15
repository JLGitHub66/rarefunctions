// Generated from D:/Workspace/RobustParser/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg\Function.g4 by ANTLR 4.9.1
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(FunctionParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_opener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_opener(FunctionParser.Pre_openerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_else(FunctionParser.Pre_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_closer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_closer(FunctionParser.Pre_closerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FunctionParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpening_curly(FunctionParser.Opening_curlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosing_curly(FunctionParser.Closing_curlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_starter(FunctionParser.Block_starterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Try_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(FunctionParser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Catch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(FunctionParser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FunctionParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(FunctionParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(FunctionParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(FunctionParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Do_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(FunctionParser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(FunctionParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#do_statement1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement1(FunctionParser.Do_statement1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_statement(FunctionParser.For_init_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(FunctionParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(FunctionParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(FunctionParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FunctionParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(FunctionParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(FunctionParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(FunctionParser.Expr_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclWithCall}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclWithCall(FunctionParser.InitDeclWithCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclWithAssign}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclWithAssign(FunctionParser.InitDeclWithAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclSimple}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclSimple(FunctionParser.InitDeclSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(FunctionParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_suffix(FunctionParser.Type_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_decl(FunctionParser.Simple_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declByClass}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByClass(FunctionParser.DeclByClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByType(FunctionParser.DeclByTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(FunctionParser.Init_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(FunctionParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(FunctionParser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_specifiers(FunctionParser.Param_decl_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(FunctionParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_list(FunctionParser.Param_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type(FunctionParser.Param_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_id(FunctionParser.Param_type_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(FunctionParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(FunctionParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FunctionParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl_specifiers(FunctionParser.Function_decl_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_operator(FunctionParser.Ptr_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_specifier(FunctionParser.Access_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(FunctionParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(FunctionParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(FunctionParser.Equality_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_decl_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_start(FunctionParser.Template_decl_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_param_list(FunctionParser.Template_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets(FunctionParser.No_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_curlies_or_squares(FunctionParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_or_semicolon(FunctionParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_angle_brackets_or_brackets(FunctionParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_curlies(FunctionParser.No_curliesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares(FunctionParser.No_squaresContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares_or_semicolon(FunctionParser.No_squares_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_comma_or_semicolon(FunctionParser.No_comma_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water(FunctionParser.Assign_waterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water_l2(FunctionParser.Assign_water_l2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(FunctionParser.WaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FunctionParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FunctionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrs(FunctionParser.PtrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#func_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptrs(FunctionParser.Func_ptrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(FunctionParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(FunctionParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_classes(FunctionParser.Base_classesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_class(FunctionParser.Base_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(FunctionParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(FunctionParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunctionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(FunctionParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormOr(FunctionParser.NormOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndExpr(FunctionParser.CndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(FunctionParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(FunctionParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(FunctionParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(FunctionParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(FunctionParser.Bit_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(FunctionParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(FunctionParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(FunctionParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(FunctionParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(FunctionParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(FunctionParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(FunctionParser.Cast_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(FunctionParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(FunctionParser.New_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op_and_cast_expr(FunctionParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(FunctionParser.Sizeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof(FunctionParser.SizeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand(FunctionParser.Sizeof_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand2(FunctionParser.Sizeof_operand2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(FunctionParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(FunctionParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOp(FunctionParser.IncDecOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instance}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance(FunctionParser.InstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOnly(FunctionParser.PrimaryOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(FunctionParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(FunctionParser.ArrayIndexingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrMemberAccess(FunctionParser.PtrMemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_list(FunctionParser.Function_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(FunctionParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(FunctionParser.Primary_expressionContext ctx);
}