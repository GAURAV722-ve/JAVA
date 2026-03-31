
import java.util.Scanner;


public class  Main_03{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.err.print("Enter the value : ");
        int r = S.nextInt();
        int res = switch (r) {
            case 1->100;
            case 2->200;
            case 3->300;
            default-> 0;
        };
        System.out.println(res);
        S.close();
    }
}