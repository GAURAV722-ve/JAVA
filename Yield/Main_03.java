
import java.util.Scanner;

public class Main_03{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = S.nextInt();
        int res = switch(n){
            case 1: 
                yield 100;
            case 2: 
                yield 200;
            default : 
                yield 0;
        };
        System.out.println("Result : "+res);
        S.close();
    }
}