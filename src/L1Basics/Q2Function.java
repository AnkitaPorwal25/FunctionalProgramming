package L1Basics;

import java.util.function.Function;

public class Q2Function {
    public static void main(String ae[]){
        Function<String,Integer> f=(a)-> a.length();
        System.out.println(f.apply("Ankita"));
        System.out.println(f.apply("Acropolis Institute of Technology and Research"));
    }
}
