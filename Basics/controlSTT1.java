import java.util.Scanner;

public class controlSTT1 {
    public static void main(String[] args) {
        int a,b;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter First Element : ");
        a = n.nextInt();
        System.out.println("Enter Second Element : ");
        b = n.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }else if(a<b){
            System.out.println("B is greater than A");
        }else{
            System.out.println("Both are Equal.");
        }
    }
}
