package L5CustomFunctionalInterfaces.Q30FunctionPipeline;
import java.util.*;
import java.util.stream.*;

public class OrderProcessor {
    public static void main(String[] args) {
        // List of orders
        List<Order> orders = Arrays.asList(
                new Order("Alice", 250.00, "shipped"),
                new Order("Bob", 150.00, "pending"),
                new Order("Charlie", 300.00, "shipped"),
                new Order("David", 100.00, "shipped")
        );

        // Processing pipeline: filter by "shipped", sort by amount descending, map to customer name
        List<String> processedCustomers = orders.stream()
                .filter(order -> "shipped".equals(order.getStatus()))   // Step 1: Filter by status
                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())  // Step 2: Sort by amount descending
                .map(Order::getCustomerName)     // Step 3: Map to customer name
                .collect(Collectors.toList());   // Collect result into list

        System.out.println(processedCustomers);  // Output: [Charlie, Alice, David]
    }
}
