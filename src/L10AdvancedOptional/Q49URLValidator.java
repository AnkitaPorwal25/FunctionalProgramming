package L10AdvancedOptional;
import java.net.URL;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q49URLValidator {
    public static void main(String[] args) {
        // Sample list of URLs (both valid and invalid)
        List<String> urls = List.of(
                "https://www.google.com",
                "ftp://invalid-url",
                "htp://missing-tld",
                "https://www.example.com"
        );

        // Predicate to check if the URL is valid
        Predicate<String> isValidURL = url -> {
            try {
                new URL(url).toURI(); // Try to create a URL and convert it to URI
                return true; // Valid URL
            } catch (Exception e) {
                return false; // Invalid URL
            }
        };

        // Use stream to filter out invalid URLs
        List<String> validURLs = urls.stream()
                .filter(isValidURL) // Apply the predicate to each URL
                .collect(Collectors.toList()); // Collect the valid URLs into a list

        // Print valid URLs
        System.out.println("Valid URLs:");
        validURLs.forEach(System.out::println);
    }
}
