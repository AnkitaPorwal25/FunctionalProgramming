package L10AdvancedOptional;
import java.time.LocalDate;
import java.util.*;

class Order {
    private int id;
    private LocalDate date;
    private double totalAmount;

    public Order(int id, LocalDate date, double totalAmount) {
        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", date=" + date + ", totalAmount=" + totalAmount + '}';
    }
}

public class Q50OrderProcessing {
    public static void main(String[] args) {
        // Sample list of orders
        List<Order> orders = List.of(
                new Order(1, LocalDate.of(2025, 1, 15), 100.50),
                new Order(2, LocalDate.of(2025, 3, 25), 200.75),
                new Order(3, LocalDate.of(2025, 5, 5), 150.00),
                new Order(4, LocalDate.of(2025, 6, 10), 250.20),
                new Order(5, LocalDate.of(2025, 8, 18), 300.00)
        );

        // Date range for filtering (example: orders from January to June 2025)
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 6, 30);

        // Chain operations to filter by date range, map to totalAmount, and sum
        double totalAmount = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate)) // Filter by date range
                .mapToDouble(Order::getTotalAmount) // Map to total amount
                .sum(); // Sum all the total amounts

        // Print the result
        System.out.println("Total amount for orders between " + startDate + " and " + endDate + ": " + totalAmount);
    }
}
