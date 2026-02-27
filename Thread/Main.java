class Example extends Thread{
    public void run(){
        System.out.println("Run method of the example class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Example A = new Example();
        A.run();
    }
}
