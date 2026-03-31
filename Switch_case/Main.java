
import java.util.Scanner;


public class  Main{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.err.print("Enter the value : ");
        int r = S.nextInt();
        switch (r) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Default");
        }
        S.close();
    }
}