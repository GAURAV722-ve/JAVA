class class1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class class2 implements Runnable{
    @Override
    public void run(){
        for(char i='A'; i<='E'; i++){
            System.out.println(i);
        }
    }
}

public class Main_04{
    public static void main(String[] args) {
        class1 T1 = new class1();
        class2 C2 = new class2();
        Thread T2 = new Thread(C2, "Thread 2");

        // Priorities.
        // T1.setPriority(1);
        // T2.setPriority(10);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(T2.getName());

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}