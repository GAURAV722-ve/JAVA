import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        int Arr[] = new int[5];
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Elements of Array.");
        for(int i=0; i<Arr.length; i++){
            Arr[i] = S.nextInt();
        }
        System.out.println("Entered Elements are give below");
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }
}
