package L3CollectorsOptionalAdvancedStreams;


import java.util.*;
        import java.util.stream.Collectors;

public class Q18CommaSeparatedString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        String result = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);  // Output: apple, banana, cherry
    }
}
