import java.util.Scanner;

public class UserEx_01 {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = S.nextInt();

        try {
            checkEligibility(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Your Entered age is : " + e.getAge());
        }
    }

    private static void checkEligibility(int age) throws InvalidAgeException {

        if(age <= 0) {
            throw new InvalidAgeException("Age can't be negative.", age);
        }

        if(age >= 18) {
            System.out.println("You are Eligible for vote");
        }
        else {
            System.out.println("You are not Eligible for vote");
        }
    }
}

class InvalidAgeException extends Exception {

    private int age;

    public InvalidAgeException(String msg, int age) {
        super(msg);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}