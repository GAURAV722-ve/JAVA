import java.util.Scanner;

public class Exception_prop {

    static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero.");
        } else {
            int r = a / b;
            System.out.println("Result: " + r);
        }
    }

    static void display() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = S.nextInt();
        int b = S.nextInt();

        divide(a, b);   // Exception may propagate from here

        S.close();
    }

    public static void main(String[] args) {
        try {
            display();
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}