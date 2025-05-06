package L5CustomFunctionalInterfaces.Q29CustomTriFunction;

public class TriFunctionExample {
    public static void main(String[] args) {
        TriFunction<String, String, String, String> concatThree =
                (a, b, c) -> a + "-" + b + "-" + c;

        String result = concatThree.apply("Java", "Stream", "API");
        System.out.println(result);  // Output: Java-Stream-API
    }
}
