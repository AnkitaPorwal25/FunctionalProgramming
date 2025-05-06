package L11RealLifeMiniChallenges;
import java.util.*;
import java.util.stream.Collectors;

public class Q54TopLongestStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "banana",
                "apple",
                "pineapple",
                "strawberry",
                "kiwi",
                "watermelon",
                "fig"
        );

        // Get top 3 longest strings
        List<String> top3Longest = strings.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());

        // Output
        System.out.println("Top 3 longest strings:");
        top3Longest.forEach(System.out::println);
    }
}
