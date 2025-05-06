package L6DataProcessingAndTransformation;
import java.util.*;
import java.util.stream.*;

public class Q33FlattenAndFilter {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(2, 4, 6),
                Arrays.asList(7, 8, 6, 10)
        );

        List<Integer> distinctEvenNumbers = nestedLists.stream()
                .flatMap(List::stream)                // Step 1: Flatten to Stream<Integer>
                .filter(n -> n % 2 == 0)              // Step 2: Keep even numbers
                .distinct()                           // Step 3: Remove duplicates
                .collect(Collectors.toList());        // Step 4: Collect to list

        System.out.println(distinctEvenNumbers);  // Output: [2, 4, 6, 8, 10]
    }
}
