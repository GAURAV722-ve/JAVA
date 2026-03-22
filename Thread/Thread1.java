class A extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Gaurav singh");
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
         A S = new A();
         S.start();
         for(int i=0; i<5; i++){
            System.out.println("Versha Singh");
        }
    }
}
