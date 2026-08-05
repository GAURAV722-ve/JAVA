import java.util.Scanner;

public class Digit_No {
    public static void printDigit(int n){
        int count=0,sum=0;
        System.out.print("Digit in reverse order : ");
        while(n!=0){
            int p = n%10;
            sum+=p;
            System.out.print(p);
            n/=10;
            count++;
        }

        System.out.println("\nNo of digit : "+count);
        System.out.println("Sum of Digit is : "+sum);
    }
    public static void main(String[] args) {  // Time complexity : O(log(n)).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        printDigit(n);
        sc.close();
    }
}
