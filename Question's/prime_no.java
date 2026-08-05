import java.util.Scanner;

public class prime_no{

    public static String isprime(int n){
        if(n<=1){
            return "Not prime";
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return "Not prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}