// Generated from org/softlang/Company.g4 by ANTLR 4.7.1
package org.softlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompanyParser}.
 */
public interface CompanyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompanyParser#company}.
	 * @param ctx the parse tree
	 */
	void enterCompany(CompanyParser.CompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#company}.
	 * @param ctx the parse tree
	 */
	void exitCompany(CompanyParser.CompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompanyParser#department}.
	 * @param ctx the parse tree
	 */
	void enterDepartment(CompanyParser.DepartmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#department}.
	 * @param ctx the parse tree
	 */
	void exitDepartment(CompanyParser.DepartmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompanyParser#employee}.
	 * @param ctx the parse tree
	 */
	void enterEmployee(CompanyParser.EmployeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#employee}.
	 * @param ctx the parse tree
	 */
	void exitEmployee(CompanyParser.EmployeeContext ctx);
}