class Example implements Runnable{
    public void run(){
        System.out.println("Thread is running.");
    }
}

public class Thread_01 {
    public static void main(String[] args) {
        Example E1 = new Example();
        Thread T1 = new Thread(E1, "Thread 1");
        T1.start();
        System.out.println(T1.getName());
        System.out.println(Thread.currentThread().getState());
    }
}
