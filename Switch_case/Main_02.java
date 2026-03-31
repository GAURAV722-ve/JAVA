
import java.util.Scanner;


public class  Main_02{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.err.print("Enter the value : ");
        int r = S.nextInt();
        switch (r) {
            case 1->System.out.println("Java class");
            case 2->System.out.println("C class");
            default-> System.out.println("No class");
        }
        S.close();
    }
}