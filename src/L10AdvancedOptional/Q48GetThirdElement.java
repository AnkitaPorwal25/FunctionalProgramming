package L10AdvancedOptional;
import java.util.*;

public class Q48GetThirdElement {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Safely get the third element using stream
        Optional<String> thirdElement = items.stream()
                .skip(2)         // Skip the first two elements
                .findFirst();    // Get the first element of the remaining stream (which is the third element)

        // Print the result
        thirdElement.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No third element found.")
        );
    }
}
