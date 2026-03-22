class A extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Akhilesh");
                Thread.sleep(1000); // pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}


public class Thread2 {
    public static void main(String[] args) {

        A t = new A();
        t.start();  // start new thread

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}