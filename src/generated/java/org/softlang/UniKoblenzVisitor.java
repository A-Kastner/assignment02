// Generated from UniKoblenz.g4 by ANTLR 4.7.1

package org.softlang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UniKoblenzParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UniKoblenzVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#uniKoblenz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniKoblenz(UniKoblenzParser.UniKoblenzContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#faculty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaculty(UniKoblenzParser.FacultyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#mensa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensa(UniKoblenzParser.MensaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#wifihotspot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWifihotspot(UniKoblenzParser.WifihotspotContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServer(UniKoblenzParser.ServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#student}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStudent(UniKoblenzParser.StudentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniKoblenzParser#employee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmployee(UniKoblenzParser.EmployeeContext ctx);
}