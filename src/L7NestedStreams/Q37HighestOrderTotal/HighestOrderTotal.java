package L7NestedStreams.Q37HighestOrderTotal;
import java.util.*;
import java.util.stream.*;
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    // Helper method to compute total price
    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}

public class HighestOrderTotal {
    public static void main(String[] args) {
        // Sample data
        Order order1 = new Order(Arrays.asList(new Item("Apple", 1.0), new Item("Banana", 2.0)));
        Order order2 = new Order(Arrays.asList(new Item("Orange", 3.0), new Item("Grapes", 4.0)));
        Order order3 = new Order(Arrays.asList(new Item("Watermelon", 10.0)));

        List<Order> orders = Arrays.asList(order1, order2, order3);

        // Find order with highest total price
        Optional<Order> maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalPrice));

        // Print result
        maxOrder.ifPresent(order -> {
            System.out.println("Highest Total Price: " + order.getTotalPrice());
            System.out.println("Items: " + order.getItems().stream()
                    .map(Item::getName).collect(Collectors.joining(", ")));
        });
    }
}
