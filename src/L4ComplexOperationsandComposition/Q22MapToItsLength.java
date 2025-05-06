package L4ComplexOperationsandComposition;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q22MapToItsLength {
    public static void main(String ar[]){
        List<String> li=List.of("Ankita","Alice","BOb","Raman","Phylen");
        Map<String,Integer> map=li.stream().collect(Collectors.toMap(word->word,word->word.length()));
        System.out.println(map);
    }
}

