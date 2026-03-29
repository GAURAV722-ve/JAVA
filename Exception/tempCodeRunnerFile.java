
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Hello Everyone!");
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        try {
            int res = a/b;
            System.out.println("Result : "+res);
        } catch (ArithmeticException e) {
            System.out.println("Exception : "+e);
        }
        System.out.println("Program is end.");
    }
}
