
import java.util.Scanner;


public class  Main_01{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.err.print("Enter the value : ");
        int r = S.nextInt();
        switch (r) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default");
        }
        S.close();
    }
}