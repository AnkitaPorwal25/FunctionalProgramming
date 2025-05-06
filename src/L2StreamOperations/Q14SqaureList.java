package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q14SqaureList {
    public static void main(String ar[]){
        List<Integer> li=List.of(10,30,4,87,2);
        List<Integer> square=li.stream().map((a)->a*a).collect(Collectors.toList());
        System.out.println(square);
    }
}
