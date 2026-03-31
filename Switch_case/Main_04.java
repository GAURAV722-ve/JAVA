import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int r = S.nextInt();

        int res = switch (r) {
            case 1 -> 100;
            case 2 -> 200;
            case 3 -> 300;
            case 4 -> 400;
            default -> 0;
        };

        System.out.println("Result = " + res);

        S.close();
    }
}