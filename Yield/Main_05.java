class sample implements Runnable{
    public void run(){
        System.out.println("Started "+Thread.currentThread());
        Thread.yield(); //Yield ek static method haa.
        System.out.println("Ended "+Thread.currentThread());
    }
}

public class Main_05 {
    public static void main(String[] args) {
        sample S1 = new sample();
        sample S2 = new sample();
        Thread T1 = new Thread(S1,"First Thread");
        Thread T2 = new Thread(S2,"Second Thread");
        T1.setPriority(4);
        T2.setPriority(10);
        T1.start();
        T2.start();
    }
}
