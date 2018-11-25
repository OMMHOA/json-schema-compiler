// Generated from expression.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expressionParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(expressionParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(expressionParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(expressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(expressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(expressionParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(expressionParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(expressionParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(expressionParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(expressionParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(expressionParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(expressionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(expressionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(expressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(expressionParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(expressionParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(expressionParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(expressionParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(expressionParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(expressionParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(expressionParser.RelopContext ctx);
}