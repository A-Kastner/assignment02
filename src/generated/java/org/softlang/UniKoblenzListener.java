// Generated from UniKoblenz.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UniKoblenzParser}.
 */
public interface UniKoblenzListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#uniKoblenz}.
	 * @param ctx the parse tree
	 */
	void enterUniKoblenz(UniKoblenzParser.UniKoblenzContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#uniKoblenz}.
	 * @param ctx the parse tree
	 */
	void exitUniKoblenz(UniKoblenzParser.UniKoblenzContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#faculty}.
	 * @param ctx the parse tree
	 */
	void enterFaculty(UniKoblenzParser.FacultyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#faculty}.
	 * @param ctx the parse tree
	 */
	void exitFaculty(UniKoblenzParser.FacultyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#mensa}.
	 * @param ctx the parse tree
	 */
	void enterMensa(UniKoblenzParser.MensaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#mensa}.
	 * @param ctx the parse tree
	 */
	void exitMensa(UniKoblenzParser.MensaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#wifihotspot}.
	 * @param ctx the parse tree
	 */
	void enterWifihotspot(UniKoblenzParser.WifihotspotContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#wifihotspot}.
	 * @param ctx the parse tree
	 */
	void exitWifihotspot(UniKoblenzParser.WifihotspotContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#server}.
	 * @param ctx the parse tree
	 */
	void enterServer(UniKoblenzParser.ServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#server}.
	 * @param ctx the parse tree
	 */
	void exitServer(UniKoblenzParser.ServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#student}.
	 * @param ctx the parse tree
	 */
	void enterStudent(UniKoblenzParser.StudentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#student}.
	 * @param ctx the parse tree
	 */
	void exitStudent(UniKoblenzParser.StudentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniKoblenzParser#employee}.
	 * @param ctx the parse tree
	 */
	void enterEmployee(UniKoblenzParser.EmployeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniKoblenzParser#employee}.
	 * @param ctx the parse tree
	 */
	void exitEmployee(UniKoblenzParser.EmployeeContext ctx);
}