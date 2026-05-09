public class Main_09 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(()->{
            System.out.println("Current Thread is : "+Thread.currentThread().getName());
            System.out.println("Main Thread state "+mainThread.getState());
        });

        System.out.println(t1.getState());

        t1.start();

        System.out.println(t1.getState());

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

       System.out.println(t1.getState()); 
    }
}
