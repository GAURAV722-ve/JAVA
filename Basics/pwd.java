import java.util.Scanner;

public class pwd {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int pwd ;
        System.out.print("Enter your password : ");
        pwd = obj.nextInt();
        if(pwd == 722){
            System.err.println("You are enter a correct password.");
        }
        else{
            System.err.println("You entered a wrong password !");
        }
    }
}
