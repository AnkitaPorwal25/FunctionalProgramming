package L1Basics;

public class Q7RunnableLambda {
    public static void main(String gar[]){
        Runnable r=()-> System.out.println("Hello Functional Java");
        Thread t=new Thread(r);
        t.start();
    }
}
