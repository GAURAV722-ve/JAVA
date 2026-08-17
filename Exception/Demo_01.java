public class Demo_01 {
    public static void main(String[] args) {
        // Outer catch will handle inner Exception.
        try{
            System.out.println("Outer try start.");

            try{
                System.out.println("Inner try start");

                System.out.println(5/0);

                System.out.println("Inner try end");
            }
            catch(NullPointerException e){
                System.out.println("Null Exception occur.");
            }
            System.out.println("Outer try end");
        }
        catch(ArithmeticException e){
            System.out.println("/ by zero Exception.");
        }
    }
}

// Avoid nested try catch block.