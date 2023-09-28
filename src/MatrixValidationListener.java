// Generated from D:/GitHub/matrix-validation-sdd-antlr/MatrixValidation/grammars\MatrixValidation.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixValidationParser}.
 */
public interface MatrixValidationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatrixValidationParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MatrixValidationParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixValidationParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MatrixValidationParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixValidationParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(MatrixValidationParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixValidationParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(MatrixValidationParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixValidationParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(MatrixValidationParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixValidationParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(MatrixValidationParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixValidationParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(MatrixValidationParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixValidationParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(MatrixValidationParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixValidationParser#hashtag}.
	 * @param ctx the parse tree
	 */
	void enterHashtag(MatrixValidationParser.HashtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixValidationParser#hashtag}.
	 * @param ctx the parse tree
	 */
	void exitHashtag(MatrixValidationParser.HashtagContext ctx);
}