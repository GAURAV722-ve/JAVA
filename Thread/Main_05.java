class first extends Thread{
    public void run(){
        System.out.println("Run method of the first class.");
    }
}

class second extends Thread{
    public void run(){
        System.out.println("Run method of the second class.");
    }
}

class third extends Thread{
    public void run(){
        System.out.println("Run method of the third class.");
    }
}

public class Main_05 {
    public static void main(String[] args) {
        first A = new first();
        second B = new second();
        third C = new third();
        A.start();
        B.start();
        C.start();
    }
}
