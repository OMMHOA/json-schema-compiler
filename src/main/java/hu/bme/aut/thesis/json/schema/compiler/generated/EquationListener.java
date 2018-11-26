// Generated from Equation.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EquationParser}.
 */
public interface EquationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EquationParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(EquationParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(EquationParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EquationParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EquationParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(EquationParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(EquationParser.PlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(EquationParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(EquationParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#timesOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterTimesOrDiv(EquationParser.TimesOrDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#timesOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitTimesOrDiv(EquationParser.TimesOrDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(EquationParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(EquationParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(EquationParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(EquationParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(EquationParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(EquationParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(EquationParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(EquationParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(EquationParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(EquationParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EquationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(EquationParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EquationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(EquationParser.RelopContext ctx);
}