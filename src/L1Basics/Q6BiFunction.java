package L1Basics;

import java.util.function.BiFunction;

public class Q6BiFunction {
    public static void main(String ar[]){
        BiFunction<Integer,Integer,Integer> bi= (a,b) -> a+b;
        System.out.println(bi.apply(10,20));
        System.out.println(bi.apply(1,8));
    }
}
