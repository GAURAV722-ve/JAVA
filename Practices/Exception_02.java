import java.util.Scanner;

public class Exception_02 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = S.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = S.nextInt();

        try{
            int res = a/b; // Illegal --> new ArithematicException("/ by zero")
            System.out.println("Result : "+res);
        }
        catch(ArithmeticException e){
            System.out.println("Type of Exception : "+e);
        }

        // finally{
        //     // This always run if exception occur or not.
        //     System.out.println("Hello Gaurav");
        //     // Cleanup code.
        //     // Closed resoures
        //     // Loggin
        // }

        System.out.println("Program is end.");
    }
}
