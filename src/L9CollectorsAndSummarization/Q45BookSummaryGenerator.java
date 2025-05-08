package L9CollectorsAndSummarization;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;
class Book1 {
    private String title;
    private double rating;
    private double price;

    // Constructor, Getters, Setters
    public Book1(String title, double rating, double price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public double getRating() { return rating; }
    public double getPrice() { return price; }
}

public class Q45BookSummaryGenerator {
    public static void main(String[] args) {
        List<Book1> books = Arrays.asList(
                new Book1("Book A", 4.5, 299.0),
                new Book1("Book B", 3.8, 199.0),
                new Book1("Book C", 4.9, 399.0)
        );

        // Summarize rating
        DoubleSummaryStatistics ratingStats = books.stream()
                .collect(Collectors.summarizingDouble(Book1::getRating));

        // Summarize price
        DoubleSummaryStatistics priceStats = books.stream()
                .collect(Collectors.summarizingDouble(Book1::getPrice));

        // Output summary
        System.out.println("Total Books: " + ratingStats.getCount());
        System.out.println("Average Rating: " + ratingStats.getAverage());
        System.out.println("Total Price: " + priceStats.getSum());
    }
}
