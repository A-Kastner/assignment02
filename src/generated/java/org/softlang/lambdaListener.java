// Generated from lambda.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lambdaParser}.
 */
public interface lambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(lambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(lambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(lambdaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(lambdaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(lambdaParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(lambdaParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(lambdaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(lambdaParser.ScopeContext ctx);
}