import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MatrixValidationRunner {
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

