package L5CustomFunctionalInterfaces.Q30FunctionPipeline;

class Order {
    private String customerName;
    private double amount;
    private String status;

    // Constructor
    public Order(String customerName, double amount, String status) {
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    // Getters
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Order{customerName='" + customerName + "', amount=" + amount + ", status='" + status + "'}";
    }
}
