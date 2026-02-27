import java.util.Scanner;

public class Throwable_div {
    static void divide(int a, int b) throws Throwable{
        if(b==0){
            throw new Throwable("Division by zero is not allowed");
        }
        int res = a/b;
        System.out.println("The result is : "+res);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            divide(a, b);
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        S.close();
    }
}