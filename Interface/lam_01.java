@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class lam_01 {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20 is : " + c.sum(10, 20));
    }
}