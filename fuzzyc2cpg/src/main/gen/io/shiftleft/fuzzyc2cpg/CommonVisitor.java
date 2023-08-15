// Generated from /Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg/Common.g4 by ANTLR 4.10.1
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(CommonParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(CommonParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CommonParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl_specifiers(CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_operator(CommonParser.Ptr_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_specifier(CommonParser.Access_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CommonParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(CommonParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(CommonParser.Equality_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl(CommonParser.Template_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param_list(CommonParser.Template_decl_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_template(CommonParser.Template_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param(CommonParser.Template_decl_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_keyword(CommonParser.Template_decl_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_name(CommonParser.Template_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args(CommonParser.Template_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param_list(CommonParser.Template_args_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param(CommonParser.Template_args_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets(CommonParser.No_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_curlies_or_squares(CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_or_semicolon(CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_angle_brackets_or_brackets(CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_curlies(CommonParser.No_curliesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares(CommonParser.No_squaresContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares_or_semicolon(CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_comma_or_semicolon(CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water(CommonParser.Assign_waterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water_l2(CommonParser.Assign_water_l2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(CommonParser.WaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CommonParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CommonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrs(CommonParser.PtrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptrs(CommonParser.Func_ptrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#rvalue_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue_ref(CommonParser.Rvalue_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(CommonParser.Class_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(CommonParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(CommonParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_classes(CommonParser.Base_classesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_class(CommonParser.Base_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(CommonParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(CommonParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#gcc_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcc_attribute(CommonParser.Gcc_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CommonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(CommonParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormOr(CommonParser.NormOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndExpr(CommonParser.CndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(CommonParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(CommonParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(CommonParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(CommonParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(CommonParser.Bit_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(CommonParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(CommonParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(CommonParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(CommonParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(CommonParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(CommonParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(CommonParser.Cast_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(CommonParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(CommonParser.New_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op_and_cast_expr(CommonParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(CommonParser.Sizeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof(CommonParser.SizeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand(CommonParser.Sizeof_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand2(CommonParser.Sizeof_operand2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(CommonParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(CommonParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOp(CommonParser.IncDecOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instance}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance(CommonParser.InstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOnly(CommonParser.PrimaryOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(CommonParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(CommonParser.ArrayIndexingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrMemberAccess(CommonParser.PtrMemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_list(CommonParser.Function_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(CommonParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(CommonParser.Primary_expressionContext ctx);
}