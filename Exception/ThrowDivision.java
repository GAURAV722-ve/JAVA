import java.util.Scanner;

public class ThrowDivision {
    static void divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int res = a/b;
        System.out.println("The result is : "+res);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            divide(a, b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        S.close();
    }
}
