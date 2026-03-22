class first implements Runnable{
    public void run(){
        System.out.println("Class first.");
    }
}

class second implements Runnable{
    public void run(){
        System.out.println("Class second.");
    }
}

class third implements Runnable{
    public void run(){
        System.out.println("Class third.");
    }
}

public class Main_06 {
    public static void main(String[] args) {
        first F1 = new first();
        second S1 = new second();
        third TH1 = new third();
        Thread T1 = new Thread(F1);
        Thread T2 = new Thread(S1);
        Thread T3 = new Thread(TH1);
        T1.run();
        T2.run();
        T3.run();
    }
}
