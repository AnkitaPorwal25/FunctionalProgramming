package L9CollectorsAndSummarization;
import java.util.*;
import java.util.stream.Collectors;

class Comment {
    private String user;
    private String text;

    public Comment(String user, String text) {
        this.user = user;
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user='" + user + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

public class Q47CommentCount {
    public static void main(String[] args) {
        // List of comments
        List<Comment> comments = List.of(
                new Comment("Alice", "This is a comment."),
                new Comment("Bob", "This is another comment."),
                new Comment("Alice", "Alice's second comment."),
                new Comment("Charlie", "Hello, world!"),
                new Comment("Bob", "Bob's second comment."),
                new Comment("Alice", "Alice's third comment.")
        );

        // Count the number of comments by each user
        Map<String, Long> commentCountByUser = comments.stream()
                .collect(Collectors.groupingBy(Comment::getUser, Collectors.counting()));

        // Print the results
        commentCountByUser.forEach((user, count) -> {
            System.out.println(user + ": " + count + " comments");
        });
    }
}
