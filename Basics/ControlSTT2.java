import java.util.Scanner;

public class ControlSTT2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = S.nextInt();
        switch(a){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thusday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default: System.out.println("Invalid");
                    break;
            
        }
    }
}
