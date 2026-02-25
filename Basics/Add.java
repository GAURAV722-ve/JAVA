import java.util.Scanner;

class Add{
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the 1st and 2nd terms : ");
        a = X.nextInt();
        b = X.nextInt();
        System.out.println("The Sum of two number is  : "+(a+b));
    }
}