// Generated from D:/Workspace/RobustParser/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg\Common.g4 by ANTLR 4.9.1
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParser}.
 */
public interface CommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(CommonParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(CommonParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(CommonParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(CommonParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CommonParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CommonParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(CommonParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(CommonParser.Ptr_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(CommonParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(CommonParser.Access_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CommonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CommonParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(CommonParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(CommonParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(CommonParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(CommonParser.Equality_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_start(CommonParser.Template_decl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_start(CommonParser.Template_decl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_param_list(CommonParser.Template_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_param_list(CommonParser.Template_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(CommonParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(CommonParser.No_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(CommonParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(CommonParser.No_curliesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(CommonParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(CommonParser.No_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(CommonParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(CommonParser.Assign_waterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(CommonParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(CommonParser.Assign_water_l2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(CommonParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(CommonParser.WaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CommonParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CommonParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CommonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CommonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void enterPtrs(CommonParser.PtrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void exitPtrs(CommonParser.PtrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ptrs(CommonParser.Func_ptrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ptrs(CommonParser.Func_ptrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(CommonParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(CommonParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(CommonParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(CommonParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void enterBase_classes(CommonParser.Base_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void exitBase_classes(CommonParser.Base_classesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 */
	void enterBase_class(CommonParser.Base_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 */
	void exitBase_class(CommonParser.Base_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(CommonParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(CommonParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(CommonParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(CommonParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CommonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CommonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(CommonParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(CommonParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterNormOr(CommonParser.NormOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitNormOr(CommonParser.NormOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCndExpr(CommonParser.CndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link CommonParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCndExpr(CommonParser.CndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(CommonParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(CommonParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CommonParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CommonParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(CommonParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(CommonParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(CommonParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(CommonParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(CommonParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(CommonParser.Bit_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(CommonParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(CommonParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CommonParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CommonParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(CommonParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(CommonParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CommonParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CommonParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(CommonParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(CommonParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(CommonParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(CommonParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(CommonParser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(CommonParser.Cast_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CommonParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CommonParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_expression(CommonParser.New_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_expression(CommonParser.New_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_and_cast_expr(CommonParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_and_cast_expr(CommonParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(CommonParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(CommonParser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof(CommonParser.SizeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof(CommonParser.SizeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand(CommonParser.Sizeof_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand(CommonParser.Sizeof_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand2(CommonParser.Sizeof_operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand2(CommonParser.Sizeof_operand2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(CommonParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(CommonParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(CommonParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(CommonParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOp(CommonParser.IncDecOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOp(CommonParser.IncDecOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instance}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInstance(CommonParser.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instance}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInstance(CommonParser.InstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOnly(CommonParser.PrimaryOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOnly(CommonParser.PrimaryOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CommonParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CommonParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(CommonParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(CommonParser.ArrayIndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPtrMemberAccess(CommonParser.PtrMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link CommonParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPtrMemberAccess(CommonParser.PtrMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_list(CommonParser.Function_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_list(CommonParser.Function_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(CommonParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(CommonParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(CommonParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(CommonParser.Primary_expressionContext ctx);
}