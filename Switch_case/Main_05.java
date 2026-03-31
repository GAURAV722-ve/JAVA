import java.util.Scanner;

public class Main_05 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int r = S.nextInt();

        double res = switch (r) {
            case 1 -> { yield 100; }
            case 2 -> { yield 200; }
            case 3 -> { yield 1300; }
            default -> { yield 0; }
        };

        System.out.println("Result = " + res);

        S.close();
    }
}