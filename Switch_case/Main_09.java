import java.util.Scanner;

public class Main_09{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Rollno : ");
        int n = S.nextInt();
        String name = switch (n) {
            case 1 -> "Gaurav Singh";
            case 2 -> "Durgesh";
            case 3 -> "Harsh Rajpoot";
            case 4 -> "Advika";
            default->"You Entered a wrong number.";
        };
        System.out.println("Name : "+name);
        S.close();
    }
}