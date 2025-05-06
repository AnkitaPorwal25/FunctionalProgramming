package L7NestedStreams;
import java.util.*;
import java.util.stream.*;

public class Q40CsvToList {
    public static void main(String[] args) {
        String csv = "1,2,3,4";

        List<Integer> numbers = Arrays.stream(csv.split(","))  // Step 1: Split the CSV string by commas
                .map(Integer::parseInt)                             // Step 2: Convert each string to Integer
                .collect(Collectors.toList());                       // Step 3: Collect into a List<Integer>

        System.out.println(numbers);  // Output: [1, 2, 3, 4]
    }
}
