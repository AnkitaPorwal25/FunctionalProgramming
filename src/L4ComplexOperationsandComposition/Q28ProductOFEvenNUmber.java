package L4ComplexOperationsandComposition;

import java.util.*;
        import java.util.stream.*;

public class Q28ProductOFEvenNUmber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        int product = numbers.stream()
                .filter(n -> n % 2 == 0)          // Keep even numbers
                .reduce(1, (a, b) -> a * b);      // Multiply them together

        System.out.println("Product of even numbers: " + product);  // Output: 48 (2*4*6)
    }
}
