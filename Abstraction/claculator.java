abstract class cal {
    abstract void add(int a, int b);

    abstract void sub(int a, int b);

    abstract void mul(int a, int b);

    abstract void div(int a, int b);

    static void display(){
        System.out.println("Simple calculator.");
    }
}

class A extends cal {
    void add(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction : " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication : " + (a * b));
    }

    void div(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero!");
    }
}

public class claculator {
    public static void main(String[] args) {
        cal obj = new A();

        obj.add(10, 5);
        obj.sub(10, 5);
        obj.mul(10, 5);
        obj.div(10, 5);
        cal.display(); // Static object call by class name.
    }
}
