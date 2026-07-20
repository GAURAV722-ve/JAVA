class Student {
    int r = 10;
    static String name = "Arvind";

    void display() {
        System.out.println(r);
        System.out.println(name);
    }

    static void show() {
        Student s = new Student(); // object needed
        System.out.println(s.r);
        System.out.println(name);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        Student.show();
    }
}
