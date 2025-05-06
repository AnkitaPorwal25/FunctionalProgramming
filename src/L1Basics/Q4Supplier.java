package L1Basics;

import java.util.function.Supplier;

public class Q4Supplier {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());  // e.g., 0.731058...
        System.out.println(randomSupplier.get());  // e.g., 0.217903...
    }
}

