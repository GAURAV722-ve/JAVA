class class1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}

class class2 implements Runnable{
    public void run(){
        for(char i='A'; i<='E'; i++){
            System.out.println(i);
        }
    }
}

public class Main_04{
    public static void main(String[] args) {
        class1 T1 = new class1();
        class2 C2 = new class2();
        Thread T2 = new Thread(C2);
        T1.start();
        T2.start();
    }
}