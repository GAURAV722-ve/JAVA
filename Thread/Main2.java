class Example1 implements Runnable {
    public void run() {
        System.out.println("The Run() in Example 1");
    }
}

class Example2 implements Runnable {
    public void run() {
        System.out.println("The Run() in Example 2");
    }
}

class Example3 implements Runnable {
    public void run() {
        System.out.println("The Run() in Example 3");
    }
}

public class Main2 {
    public static void main(String[] args) {

        Example1 E1 = new Example1();
        Thread T1 = new Thread(E1);
        T1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Example2 E2 = new Example2();
        Thread T2 = new Thread(E2);
        T2.start();

        Example3 E3 = new Example3();
        Thread T3 = new Thread(E3);
        T3.start();
    }
}