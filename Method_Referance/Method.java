@FunctionalInterface
interface Interface1 {
    void show();
}

class A1 {
    static void display() {
        System.out.println("Display in class A1");
    }
}

class A {
    void display() {
        System.out.println("Hello display.");
    }
}

public class Method {
    public static void main(String[] args) {
        Interface1 I1 = A1::display;  // method reference
        I1.show();
    }
}