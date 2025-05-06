package L3CollectorsOptionalAdvancedStreams;
import java.util.Optional;

public class Q20GetAValue {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(null);

        String name = optionalName.orElse("Default Name");

        System.out.println(name);  // Output: Default Name
    }
}
