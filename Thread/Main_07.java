public class Main_07 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread T1 = new Thread(()->{
            System.out.println("The name of 1nd thread : "+Thread.currentThread().getName());
        });
        Thread T2 = new Thread(()->{
            System.out.println("The name of 2nd thread : "+Thread.currentThread().getName());
        });

        T1.start();
        T2.start();
    }
}
