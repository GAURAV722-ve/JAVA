interface A {
    public void show();
}

public class TestInterface1 implements A {

    public void show() {
        System.out.println("Hello");
    }

    public void print() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        A t1 = new TestInterface1();
        t1.show();

        TestInterface1 t2 = new TestInterface1();
        t2.print();
    }
}
