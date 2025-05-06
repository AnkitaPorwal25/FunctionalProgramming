package L3CollectorsOptionalAdvancedStreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q16GroupingUsingGroupBy {
    public static void main(String ar[]){
        List<String> li=List.of("Ankita","Alice","Bob","Raman","Unicorn","Anaya");
        Map<Character,List<String>> map=li.stream().collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(map);
    }
}
