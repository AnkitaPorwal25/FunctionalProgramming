package L11RealLifeMiniChallenges;
import java.util.*;
import java.util.stream.Collectors;

public class Q51TextAnalyzer {

    public static void main(String[] args) {
        // Sample input
        String paragraph = "This is a sample paragraph. This paragraph is just for testing! Testing, one, two, three.";

        // Analyze and get word frequencies
        Map<String, Integer> wordFrequencyMap = analyzeText(paragraph);

        // Print the result
        wordFrequencyMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }

    public static Map<String, Integer> analyzeText(String text) {
        // Split the text into words using regex to handle punctuation
        String[] words = text.split("\\W+"); // Splits by non-word characters

        // Use streams to process and collect word frequencies
        return Arrays.stream(words)
                .map(String::toLowerCase)               // Convert to lowercase to normalize
                .filter(word -> !word.isEmpty())        // Skip empty strings
                .collect(Collectors.toMap(
                        word -> word,                   // Key = word
                        word -> 1,                      // Initial count = 1
                        Integer::sum                    // Merge function: sum if word repeats
                ));
    }
}
