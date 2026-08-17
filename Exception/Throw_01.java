import java.util.Scanner;

public class Throw_01 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("AGE : ");
        int age = S.nextInt();
        try{
            checkElegibility(age);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    private static void checkElegibility(int age){
        if(age<=0){
            throw new IllegalArgumentException("Age can't be negative.");
        }
        else if(age>=18){
            System.out.println("You are elegiable for vote.");
        }
        else{
            System.out.println("You are not elegiable for vote.");
        }
    }
}
