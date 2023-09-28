import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MatrixValidationRunner {

//    /**
//     * Parses a provided string using Task 9's grammar
//     * and gets the value of the attribute "check" of the variable "s"
//     *
//     * @param input a string to parse
//     * @return the value of the attribute "check" of the variable "s"
//     */
//    public static int sCheckValue(String input) {
//        Task9Lexer lexer = new Task9Lexer(CharStreams.fromString(input));
//        Task9Parser parser = new Task9Parser(new CommonTokenStream(lexer));
//        return parser.s().check;
//    }

    public static void main(String[] args) {
        String input = "121#311#111";
        MatrixValidationLexer lexer = new MatrixValidationLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MatrixValidationParser parser = new MatrixValidationParser(tokens);

        MatrixValidationParser.StartContext context = parser.start();
        int check = context.matrix().check;

        System.out.println("Check: " + check);
    }

}

