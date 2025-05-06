package L4ComplexOperationsandComposition;

import java.util.*;
        import java.util.stream.*;

public class Q27AverageLengthOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear");

        double averageLength = words.stream()
                .mapToInt(String::length)     // Convert each string to its length
                .average()                    // Compute average
                .orElse(0.0);                 // Default if list is empty

        System.out.println("Average length: " + averageLength);
    }
}
