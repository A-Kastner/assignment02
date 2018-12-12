// Generated from Lambda.g4 by ANTLR 4.7.1

package org.softlang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LambdaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LambdaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(LambdaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(LambdaParser.ScopeContext ctx);
}