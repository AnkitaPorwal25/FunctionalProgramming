package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q15LIstOfLength {
    public static void main(String ar[]){
        List<String> li=List.of("Ankita","Shraddhaa","Varun");
        List<Integer> length=li.stream().map(a->a.length()).collect(Collectors.toList());
        System.out.println(length);
    }
}
