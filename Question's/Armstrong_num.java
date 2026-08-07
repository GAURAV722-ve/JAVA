import java.util.Scanner;

public class Armstrong_num{
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        if(isArmstrong(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        s.close();
    }
}