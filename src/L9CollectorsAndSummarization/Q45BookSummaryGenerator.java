package L9CollectorsAndSummarization;
import java.util.List;

class Book {
    private String title;
    private double rating;  // Rating between 0 and 5
    private double price;   // Price in dollars

    public Book(String title, double rating, double price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
}

class BookSummary {
    private int totalCount;
    private double averageRating;
    private double totalPrice;

    public BookSummary(int totalCount, double averageRating, double totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Summary: Total Books = %d, Average Rating = %.2f, Total Price = %.2f",
                totalCount, averageRating, totalPrice);
    }
}

public class Q45BookSummaryGenerator {

    // Method to generate the summary
    public static BookSummary generateSummary(List<Book> books) {
        if (books == null || books.isEmpty()) {
            return new BookSummary(0, 0.0, 0.0);
        }

        int totalCount = books.size();
        double totalRating = 0.0;
        double totalPrice = 0.0;

        for (Book book : books) {
            totalRating += book.getRating();
            totalPrice += book.getPrice();
        }

        double averageRating = totalRating / totalCount;

        return new BookSummary(totalCount, averageRating, totalPrice);
    }

    public static void main(String[] args) {
        // Example books
        List<Book> books = List.of(
                new Book("The Great Gatsby", 4.5, 10.99),
                new Book("Moby Dick", 3.8, 12.50),
                new Book("1984", 4.8, 8.99),
                new Book("To Kill a Mockingbird", 4.7, 15.99)
        );

        // Generate the summary
        BookSummary summary = generateSummary(books);

        // Output the summary
        System.out.println(summary);
    }
}
