class cal {

    int calculator(int a, int b) {
        return a + b;
    }

    int calculator(int a) {
        return a * a;
    }
}

public class Overloding {
    public static void main(String[] args) {

        cal C = new cal();

        System.out.println("Sum : " + C.calculator(1, 2));
        System.out.println("Square : " + C.calculator(4));
    }
}