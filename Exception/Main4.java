import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int idx, a, ans = 0;

        Scanner S = new Scanner(System.in);
        System.out.println("Enter the idx and value.");

        try{
            idx = S.nextInt();
            a = S.nextInt();

            ans = arr[idx] / a;
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of range.");
        }finally{
            System.out.println("Finallay block.");
        }

        System.out.println("Answer : " + ans);
    }
}