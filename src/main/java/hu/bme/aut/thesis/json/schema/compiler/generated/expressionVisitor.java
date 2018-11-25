// Generated from expression.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link expressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface expressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link expressionParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(expressionParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(expressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(expressionParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(expressionParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(expressionParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(expressionParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(expressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(expressionParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(expressionParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(expressionParser.RelopContext ctx);
}