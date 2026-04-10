import java.util.Scanner;

record Employee(int eid, String name, double sal) {
    Employee(int eid, String name, double sal) {
        if (eid == 0) {
            throw new IllegalArgumentException("Employee ID cannot be zero");
        }
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }
}

public class Main_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            Employee e1 = new Employee(id, name, sal);
            System.out.println("\nEmployee Details:");
            System.out.println(e1);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}