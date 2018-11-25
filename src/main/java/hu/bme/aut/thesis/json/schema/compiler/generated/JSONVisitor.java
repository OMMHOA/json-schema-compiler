// Generated from JSON.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#jsonwa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonwa(JSONParser.JsonwaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(JSONParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSONParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JSONParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(JSONParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JSONParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(JSONParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(JSONParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(JSONParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JSONParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JSONParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(JSONParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(JSONParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(JSONParser.RelopContext ctx);
}