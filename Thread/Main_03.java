class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread started");
    }
}

public class Main_03 {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        T1.start();
    }
}
