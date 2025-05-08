package L8FunctionCompositioAndPipelines;
import java.util.function.Function;

public class Q42StringParsingAndDoubling {
    public static void main(String[] args) {
        // Step 1: String to Integer
        Function<String, Integer> parse = Integer::parseInt;

        // Step 2: Double the number
        Function<Integer, Integer> doubleIt = x -> x * 2;

        // Compose using andThen: parse first, then double
        Function<String, Integer> parseAndDouble = parse.andThen(doubleIt);

        // Test
        String input = "10";
        Integer result = parseAndDouble.apply(input);

        System.out.println("Result: " + result);  // Output: 20
    }
}

