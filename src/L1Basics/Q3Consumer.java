package L1Basics;

import java.util.function.Consumer;

public class Q3Consumer {
    public static void main(String arp[]){
        Consumer<String> c=(a)-> System.out.println(a.toUpperCase());
        c.accept("ankita");
    }
}
