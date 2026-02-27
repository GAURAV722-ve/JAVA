class Example1 implements Runnable{
    public void run(){
        System.out.println("The Run() in Example 1");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Example1 E1= new Example1();
        Thread T1 = new Thread(E1);
        T1.start();
    }
}
