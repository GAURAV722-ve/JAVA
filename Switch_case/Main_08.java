import java.util.Scanner;

public class Main_08 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value : ");
        String str = S.nextLine();
        switch (str) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuseday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thusday":
                System.out.println("4");
                break;
            case "friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
            case "Sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("Default");
        }
    }
}
