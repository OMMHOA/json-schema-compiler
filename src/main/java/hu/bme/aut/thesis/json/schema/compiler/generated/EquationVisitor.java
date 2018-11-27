// Generated from Equation.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EquationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EquationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EquationParser#equationwa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationwa(EquationParser.EquationwaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(EquationParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EquationParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#plusOrMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinusExpression(EquationParser.PlusOrMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(EquationParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(EquationParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#timesOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDivExpression(EquationParser.TimesOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#timesOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDiv(EquationParser.TimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#poweredExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoweredExpression(EquationParser.PoweredExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(EquationParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(EquationParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EquationParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(EquationParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(EquationParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(EquationParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EquationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(EquationParser.RelopContext ctx);
}