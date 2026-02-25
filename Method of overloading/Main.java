class Overload {
    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Overload O1 = new Overload();

        int r1 = O1.add(10, 20);
        double r2 = O1.add(10, 20.5);

        System.out.println(r1);
        System.out.println(r2);
    }
}