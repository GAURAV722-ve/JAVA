import java.util.Scanner;

interface client {
    void employee();
    void show();
}

public class Main_01 implements client {

    int sal;
    String name;

    public void employee() {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = S.nextLine();

        System.out.print("Enter salary: ");
        sal = S.nextInt();
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Main_01 obj = new Main_01();
        obj.employee();
        obj.show();
    }
}