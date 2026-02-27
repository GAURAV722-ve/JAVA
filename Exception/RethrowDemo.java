import java.util.Scanner;

class Calculator {

    // Method that performs addition and subtraction
    static void calculate(int a, int b) throws ArithmeticException {
        try {
            int add = a + b;
            int sub = a - b;

            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);

            // Example condition to create exception
            if (b == 0) {
                throw new ArithmeticException("Second number cannot be zero for demo!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Exception caught inside calculate(): " + e.getMessage());
            
            // Rethrowing the exception
            throw e;
        }
    }
}

public class RethrowDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            Calculator.calculate(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main(): " + e.getMessage());
        }

        System.out.println("Program ended successfully.");
    }
}