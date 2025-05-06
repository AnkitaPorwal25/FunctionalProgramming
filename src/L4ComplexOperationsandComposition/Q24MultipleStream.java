package L4ComplexOperationsandComposition;

import java.util.*;
        import java.util.stream.Collectors;

public class Q24MultipleStream {
    public static void main(String[] args) {
        // Original list of words
        List<String> words = Arrays.asList("apple", "hi", "banana", "cat", "dog");

        // Stream pipeline: filter > map > sort > collect
        List<String> result = words.stream()
                .filter(w -> w.length() > 3)        // Filter words with length > 3
                .map(String::toUpperCase)           // Convert to uppercase
                .sorted()                           // Sort alphabetically
                .collect(Collectors.toList());      // Collect to a list

        // Output the result
        System.out.println(result);  // Output: [APPLE, BANANA]
    }
}
