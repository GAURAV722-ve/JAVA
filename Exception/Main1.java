import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int a = S.nextInt();
        System.out.print("Enter 2nd value : ");
        int b = S.nextInt();

        try{
            int res = a/b;
            System.out.println("Rseult : "+res);
        }
        catch(ArithmeticException e){
            System.out.println("Type of Exception : "+e.getMessage());
        }

        finally{
            // Finally run in Every condition.
            // Cleanup code
            // closed resoures or deallocate resoures.
            System.out.println("Finally block run properly.");
        }
        System.out.println("Program Is End");
    }
}