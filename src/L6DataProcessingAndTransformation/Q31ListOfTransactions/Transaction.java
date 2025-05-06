package L6DataProcessingAndTransformation.Q31ListOfTransactions;
class Transaction {
    private double amount;
    private String type;

    // Constructor
    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    // Getters
    public double getAmount() { return amount; }
    public String getType() { return type; }
}

