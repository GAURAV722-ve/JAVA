public class Main_08 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Thread name is : "+Thread.currentThread().getName());
        });
        // t1.start();
        t1.run(); // It calling main thread because Thread T1 is not created.
    }
}
