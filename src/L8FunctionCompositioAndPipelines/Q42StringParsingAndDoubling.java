package L8FunctionCompositioAndPipelines;
public class Q42StringParsingAndDoubling {

    // Function to parse a String into an Integer
    public static Integer parseStringToInteger(String input) {
        try {
            return Integer.parseInt(input);  // Parse the string into an Integer
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input);  // Handle invalid input
            return null;  // Return null if the input is not a valid integer
        }
    }

    // Function to double the number
    public static Integer doubleTheNumber(Integer number) {
        if (number == null) {
            return null;  // Return null if the input is invalid
        }
        return number * 2;  // Return double the value of the input
    }

    // Main method to test the functions
    public static void main(String[] args) {
        String input = "25";  // Example input string

        // Step 1: Parse the string into an integer
        Integer parsedNumber = parseStringToInteger(input);

        // Step 2: Double the parsed number (if parsing was successful)
        if (parsedNumber != null) {
            Integer doubledNumber = doubleTheNumber(parsedNumber);
            System.out.println("Original number: " + parsedNumber);
            System.out.println("Doubled value: " + doubledNumber);
        } else {
            System.out.println("Parsing failed, no number to double.");
        }
    }
}
