// Generated from Company.g4 by ANTLR 4.7.1

package org.softlang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompanyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompanyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompanyParser#company}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompany(CompanyParser.CompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompanyParser#department}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartment(CompanyParser.DepartmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompanyParser#employee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmployee(CompanyParser.EmployeeContext ctx);
}