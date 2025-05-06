package L11RealLifeMiniChallenges;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Q53DateRangeFinder {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2025, 5, 6),
                LocalDate.of(2023, 1, 15),
                LocalDate.of(2024, 12, 25),
                LocalDate.of(2022, 8, 10)
        );

        // Custom comparator (natural order for dates)
        Comparator<LocalDate> comparator = Comparator.naturalOrder();

        // Find earliest date
        Optional<LocalDate> earliest = dates.stream()
                .min(comparator);

        // Find latest date
        Optional<LocalDate> latest = dates.stream()
                .max(comparator);

        // Print results
        earliest.ifPresent(date -> System.out.println("Earliest date: " + date));
        latest.ifPresent(date -> System.out.println("Latest date: " + date));
    }
}
