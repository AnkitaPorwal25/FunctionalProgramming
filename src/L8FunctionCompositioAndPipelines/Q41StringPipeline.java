package L8FunctionCompositioAndPipelines;
import java.util.function.Function;
import java.util.regex.*;

public class Q41StringPipeline {
    public static void main(String[] args) {
        // Define the pipeline functions
        Function<String, String> trim = s -> s.trim();  // Step 1: Trim whitespace
        Function<String, String> lowercase = s -> s.toLowerCase();  // Step 2: Convert to lowercase
        Function<String, String> removePunctuation = s -> s.replaceAll("[^a-zA-Z0-9 ]", "");  // Step 3: Remove punctuation

        // Combine the functions into a single pipeline
        Function<String, String> pipeline = trim.andThen(lowercase).andThen(removePunctuation);

        // Test the pipeline
        String input = "  Hello, World!  ";
        String result = pipeline.apply(input);

        System.out.println("Original: \"" + input + "\"");
        System.out.println("Processed: \"" + result + "\"");
    }
}
