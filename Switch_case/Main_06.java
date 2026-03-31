
class Example1 implements Runnable {

    public void run() {
        System.out.println("Runnable thread running");
    }
}

class Thread1 extends Thread {

    public void run() {
        System.out.println("Thread1 running");
    }
}

public class Main_06 {

    public static void main(String[] args) {

        Thread1 T1 = new Thread1();

        Example1 E1 = new Example1();
        Thread T2 = new Thread(E1, "Second Thread");

        T1.start();
        T2.start();
    }
}
