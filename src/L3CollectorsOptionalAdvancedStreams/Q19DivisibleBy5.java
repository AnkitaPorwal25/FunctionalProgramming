package L3CollectorsOptionalAdvancedStreams;


import java.util.*;

public class Q19DivisibleBy5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 10, 12, 15, 20);

        Optional<Integer> firstDivBy5 = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findFirst();

        firstDivBy5.ifPresent(System.out::println);  // Output: 10
    }
}
