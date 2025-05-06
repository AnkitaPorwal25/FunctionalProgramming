package L2StreamOperations;

import java.util.*;

public class Q12LongestStringUsingReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "pineapple");

        Optional<String> longest = words.stream()
                .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);

        longest.ifPresent(System.out::println);  // Output: "pineapple"
    }
}

