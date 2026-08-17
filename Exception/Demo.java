public class Demo {
    public static void main(String[] args) {

        // Inner try handle it own Exception.
        try{
            System.out.println("Outer try start.");

            try{
                System.out.println("Inner try start");

                System.out.println(5/0);

                System.out.println("Inner try end");
            }
            catch(ArithmeticException e){
                System.out.println("/ by 0 Exception occur.");
            }
            System.out.println("Outer try end");
        }
        catch(ArithmeticException e){
            System.out.println("/ by zero Exception.");
        }
    }
}
