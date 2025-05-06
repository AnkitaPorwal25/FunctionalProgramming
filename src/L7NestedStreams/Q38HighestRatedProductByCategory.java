package L7NestedStreams;
import java.util.*;
import java.util.stream.*;
class Product {
    private String name;
    private String category;
    private double rating;

    public Product(String name, String category, double rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getRating() { return rating; }
}

public class Q38HighestRatedProductByCategory {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone", "Electronics", 4.6),
                new Product("Samsung TV", "Electronics", 4.7),
                new Product("MacBook", "Electronics", 4.8),
                new Product("Bananas", "Groceries", 4.2),
                new Product("Apples", "Groceries", 4.5),
                new Product("Milk", "Groceries", 4.1),
                new Product("Jeans", "Clothing", 4.3),
                new Product("T-Shirt", "Clothing", 4.4)
        );

        Map<String, String> categoryToTopProduct = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                optProduct -> optProduct.map(Product::getName).orElse("N/A")
                        )
                ));

        // Print the map
        categoryToTopProduct.forEach((category, productName) ->
                System.out.println(category + " → " + productName));
    }
}
