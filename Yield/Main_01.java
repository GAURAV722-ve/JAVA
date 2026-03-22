
import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Day : ");
        String r = S.nextLine();
        switch(r){
            case "Monday","Tuesday":
                System.out.println("Java class");
                break;
            case "Wednesday","Thusday":
                System.out.println("C class");
                break;
            default:System.out.println("No class");
        }
    }
}