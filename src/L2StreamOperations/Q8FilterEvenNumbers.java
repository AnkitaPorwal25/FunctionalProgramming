package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q8FilterEvenNumbers {
    public static void main(String ar[]){
        List<Integer> li=List.of(10,20,345,67,35,25,80);
        List<Integer> ans= li.stream().filter((a)-> a%2==0).collect(Collectors.toList());
        System.out.println(li);
    }
}
