import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the 1st value : ");
        int x = S.nextInt();
        System.out.print("Enter the 2nd value : ");
        int y = S.nextInt();
        if(x>y){
            System.out.println("1st value is larger than 2nd.");
        }
        else{
            System.out.println("2nd value is larger than 1st.");
        }
    }
}
