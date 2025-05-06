package L3CollectorsOptionalAdvancedStreams;


import java.util.*;
        import java.util.stream.Collectors;

public class Q21ConversionToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3);

        Set<Integer> uniqueNumbers = numbers.stream().collect(Collectors.toSet());

        System.out.println(uniqueNumbers);  // Output: [1, 2, 3, 4, 5]
    }
}
