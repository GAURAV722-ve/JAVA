public class Exception_01 {
    public static void main(String[] args) {
        try{
            methodA(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Type of exception : "+e);
        }
        System.out.println("Program is End.");
    }
    private static void methodA(int a, int b){
            methodB(a, b);
        }
        private static void methodB(int a, int b){
            System.out.println(a/b);  // Illegal --> new ArithematicException("/ by zero")
            System.out.println("Step End");
        }
}

// main() --> methodA --> methodB
// If b = 1 output : 5 \n Step End \n Program is End.
// If b = 0 output : Type of exception : java.lang.ArithmeticException: / by zero \n Program is End.