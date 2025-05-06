package L6DataProcessingAndTransformation.Q31ListOfTransactions;
import java.util.*;
import java.util.stream.*;

public class TransactionProcessor {
    public static void main(String[] args) {
        // List of transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.00, "DEBIT"),
                new Transaction(50.00, "CREDIT"),
                new Transaction(200.00, "DEBIT"),
                new Transaction(150.00, "CREDIT"),
                new Transaction(300.00, "DEBIT")
        );

        // Calculate total debit amount using streams
        double totalDebit = transactions.stream()
                .filter(t -> "DEBIT".equals(t.getType()))  // Step 1: Filter "DEBIT" transactions
                .mapToDouble(Transaction::getAmount)      // Step 2: Map to amounts
                .sum();                                   // Step 3: Sum the amounts

        System.out.println("Total Debit Amount: " + totalDebit);  // Output: 600.0
    }
}
