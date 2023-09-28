// Generated from D:/GitHub/matrix-validation-sdd-antlr/MatrixValidation/grammars\MatrixValidation.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatrixValidationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatrixValidationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MatrixValidationParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MatrixValidationParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatrixValidationParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MatrixValidationParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatrixValidationParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(MatrixValidationParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatrixValidationParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(MatrixValidationParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatrixValidationParser#hashtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashtag(MatrixValidationParser.HashtagContext ctx);
}