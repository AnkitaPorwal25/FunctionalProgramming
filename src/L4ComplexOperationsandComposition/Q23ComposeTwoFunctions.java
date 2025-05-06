package L4ComplexOperationsandComposition;


import java.util.function.Function;

public class Q23ComposeTwoFunctions {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addExclamation = s -> s + "!";

        // Compose: first toUpperCase, then add "!"
        Function<String, String> shout = toUpperCase.andThen(addExclamation);

        String result = shout.apply("hello");
        System.out.println(result);  // Output: HELLO!
    }
}