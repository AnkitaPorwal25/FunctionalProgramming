package L2StreamOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q13SortingUsingStreams {
    public static void main(String ar[]){
        List<Integer> li=List.of(10,9,3,2,5,7,23,8,42,90);
        List<Integer> sortedDescending =li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDescending);
    }
}
