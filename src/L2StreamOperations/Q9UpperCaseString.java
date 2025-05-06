package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q9UpperCaseString {
    public static void main(String ar[]){
        List<String> li=List.of("Ram","Alice","Bob","Raman");
        List<String> ans=li.stream().map((a)->a.toUpperCase()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
