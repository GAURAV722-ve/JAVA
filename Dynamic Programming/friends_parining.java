import java.util.Scanner;

public class friends_parining {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ans : "+pair(n));
    }

    private static int pair(int n){
        if(n<=2) return n;
        return pair(n-1)+(n-1)*pair(n-2);
    }
}
