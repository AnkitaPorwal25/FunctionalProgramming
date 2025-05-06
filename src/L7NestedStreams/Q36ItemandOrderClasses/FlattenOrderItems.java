package L7NestedStreams.Q36ItemandOrderClasses;
import java.util.*;
import java.util.stream.*;

public class FlattenOrderItems {
    public static void main(String[] args) {
        // Create items
        List<Item> items1 = Arrays.asList(new Item("Apple"), new Item("Banana"));
        List<Item> items2 = Arrays.asList(new Item("Orange"), new Item("Banana"));
        List<Item> items3 = Arrays.asList(new Item("Grapes"), new Item("Apple"));

        // Create orders
        List<Order> orders = Arrays.asList(
                new Order(items1),
                new Order(items2),
                new Order(items3)
        );

        // Flatten to get all item names
        List<String> itemNames = orders.stream()
                .flatMap(order -> order.getItems().stream())     // Flatten items from all orders
                .map(Item::getName)                              // Extract item name
                .collect(Collectors.toList());                   // Collect into a list

        System.out.println(itemNames);
    }
}
