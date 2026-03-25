import java.util.Scanner;

interface add {
    int sum(int x, int y);
}

public class lam_add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        add obj = (a, b) ->{
            return a+b;
        };

        int res = obj.sum(x, y);

        System.out.println("Sum : " + res);
    }
}
