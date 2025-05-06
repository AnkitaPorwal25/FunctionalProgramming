package L8FunctionCompositioAndPipelines;
import java.util.function.Function;

public class Q44FunctionCompositionExample {

    public static void main(String[] args) {
        // Function to double a number
        Function<Integer, Integer> doubleNumber = x -> x * 2;

        // Function to add 3 to a number
        Function<Integer, Integer> addThree = x -> x + 3;

        // Function to square a number
        Function<Integer, Integer> squareNumber = x -> x * x;

        // Using andThen() - First add 3, then double the result
        Function<Integer, Integer> andThenResult = addThree.andThen(doubleNumber);

        // Using compose() - First double the number, then add 3 to the result
        Function<Integer, Integer> composeResult = doubleNumber.compose(addThree);

        // Testing andThen()
        int number1 = 4;
        System.out.println("andThen() Result: " + andThenResult.apply(number1));  // (4 + 3) * 2 = 14

        // Testing compose()
        int number2 = 4;
        System.out.println("compose() Result: " + composeResult.apply(number2));  // (4 * 2) + 3 = 11

        // Additional example using square and then adding 3
        Function<Integer, Integer> squareThenAddThree = squareNumber.andThen(addThree);
        int number3 = 5;
        System.out.println("squareThenAddThree Result: " + squareThenAddThree.apply(number3));  // (5^2) + 3 = 28
    }
}
