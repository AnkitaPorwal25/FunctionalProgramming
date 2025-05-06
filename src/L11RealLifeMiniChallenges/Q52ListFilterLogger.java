package L11RealLifeMiniChallenges;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q52ListFilterLogger {

    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew");

        // Filter names that start with 'A'
        List<String> filtered = filterAndLog(names, name -> name.startsWith("A"));

        System.out.println("Filtered List: " + filtered);
    }

    // Generic reusable method
    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .peek(item -> System.out.println("Filtered item: " + item)) // Logging each filtered item
                .collect(Collectors.toList());
    }
}
