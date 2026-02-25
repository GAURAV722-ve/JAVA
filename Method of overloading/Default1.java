class A {
    A() {
        System.out.println("Hyy i am class A");
    }
}

class B extends A {
    B() {
        System.out.println("Hyy i am class B");
    }
}

public class Default1 {
    public static void main(String args[]) {
        B X = new B();
    }
}