public class Main_10 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {

            try {
                System.out.println("Child thread starts");

                Thread.sleep(2000);

                System.out.println("Child thread ends");

            } catch (InterruptedException e) {

                System.out.println("Child thread interrupted");
            }
        });

        t1.start();
        // t1.join();
        // Main thread waits only 1 second
        t1.join(1000);

        System.out.println("Main thread ends");
    }
}
