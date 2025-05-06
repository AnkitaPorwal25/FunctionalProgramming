package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q10LengthGreaterThan4 {
    public static void main(String ar[]){
        List<String> li=List.of("Ankita","Alice","Bob","Raman","Hiii");
        List<String> ans=li.stream().filter((a)->a.length()>4).collect(Collectors.toList());
        System.out.println(ans);
    }
}
