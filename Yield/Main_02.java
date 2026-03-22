
import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = S.nextInt();
        switch (n) {
            case 1:System.out.println("Java Class");
                break;
            case 2:System.out.println("C Class");
            break;
            default:System.out.println("No class");
        }
        S.close();
    }
}
