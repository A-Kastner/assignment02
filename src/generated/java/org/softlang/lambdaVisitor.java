// Generated from org/softlang/lambda.g4 by ANTLR 4.7.1
package org.softlang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(lambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(lambdaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(lambdaParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(lambdaParser.ScopeContext ctx);
}