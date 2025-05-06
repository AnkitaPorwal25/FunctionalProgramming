package L4ComplexOperationsandComposition;


import java.util.*;
        import java.util.stream.Collectors;

public class Q26RemoveDuplicates  {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "orange", "apple", "banana", "grape");

        List<String> uniqueSortedWords = words.stream()
                .distinct()                // Remove duplicates
                .sorted()                  // Sort alphabetically
                .collect(Collectors.toList());

        System.out.println(uniqueSortedWords);  // Output: [apple, banana, grape, orange]
    }
}
