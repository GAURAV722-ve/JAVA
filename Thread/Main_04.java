class A implements Runnable{
    public void run(){
        System.out.println("Using Runnable interface.");
    }
}

public class Main_04 {
    public static void main(String[] args) {
        A F1 = new A();
        Thread T1 = new Thread(F1);
        T1.start();
    }
}
