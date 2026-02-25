class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

    void show(Student S) {
        this.r = S.r;
        this.name = S.name;
    }

    void display() {
        System.out.println("Roll No : " + r);
        System.out.println("Name : " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student S1 = new Student(1, "Gaurav");
        S1.display();
        Student S2 = new Student(0, null);
        S2.show(S1);
        S2.display();
    }
}
