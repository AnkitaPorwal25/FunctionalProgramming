package L8FunctionCompositioAndPipelines;
import java.util.*;
import java.util.function.Function;

public class Q43GenericFunctionApplication {

    // Generic method that applies a Function<T, R> to all elements of a List<T>
    public static <T, R> List<R> applyFunctionToList(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));  // Apply the function to each element
        }
        return result;
    }

    public static void main(String[] args) {
        // Example with Integer List, applying a function to double each number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> doubleFunction = n -> n * 2;

        List<Integer> doubledNumbers = applyFunctionToList(numbers, doubleFunction);
        System.out.println("Doubled Numbers: " + doubledNumbers);

        // Example with String List, applying a function to convert each string to uppercase
        List<String> words = Arrays.asList("hello", "world", "java");
        Function<String, String> uppercaseFunction = s -> s.toUpperCase();

        List<String> uppercaseWords = applyFunctionToList(words, uppercaseFunction);
        System.out.println("Uppercase Words: " + uppercaseWords);
    }
}
