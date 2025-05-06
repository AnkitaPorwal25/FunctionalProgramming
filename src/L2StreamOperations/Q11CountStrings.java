package L2StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Q11CountStrings {
    public static void main(String ar[]){
        List<String> li=List.of("Ankita","Shayd","Sharma");

        int count=0;
        List<String> ans=li.stream().filter(a->a.startsWith("S")).collect(Collectors.toList());
        System.out.println("There are "+ans.size()+" starting with S in above list");
    }
}
