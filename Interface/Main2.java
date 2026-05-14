import java.util.Scanner;

interface client{
    void input();
    void output();
}

class A implements client{
    String name;
    Double sal;
    public void input(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = S.nextLine();
        this.name = name;
        System.out.print("Enter Salary : ");
        Double sal = S.nextDouble();
        this.sal = sal;
    }

    public void output(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+sal);
    }
}

public class Main2 {
    public static void main(String[] args) {
        client C = new A();
        C.input();
        C.output();
    }
}