class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running.");
    }
}

public class Main_01 {
    public static void main(String[] args) {
        MyThread T1 = new MyThread();
        T1.start();
    }
}
