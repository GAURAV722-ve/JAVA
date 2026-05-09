class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running.");
    }
}

public class Main_02 {
    public static void main(String[] args) {
        MyRunnable R1 = new MyRunnable();
        Thread T1 = new Thread(R1);
        T1.start();
    }
}
