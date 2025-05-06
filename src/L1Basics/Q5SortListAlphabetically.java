package L1Basics;

import java.util.Arrays;
import java.util.List;

public class Q5SortListAlphabetically {
    public static void main(String arp[]){
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Sort alphabetically using lambda
        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(names);
    }
}
