// Generated from JSON.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#jsonwa}.
	 * @param ctx the parse tree
	 */
	void enterJsonwa(JSONParser.JsonwaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jsonwa}.
	 * @param ctx the parse tree
	 */
	void exitJsonwa(JSONParser.JsonwaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(JSONParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(JSONParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JSONParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JSONParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(JSONParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(JSONParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(JSONParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(JSONParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(JSONParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(JSONParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JSONParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JSONParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JSONParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JSONParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(JSONParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(JSONParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(JSONParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(JSONParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(JSONParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(JSONParser.RelopContext ctx);
}