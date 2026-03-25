@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Lambda expression InterfaceName  obj_name = (<parameter>) -> function.
        Add obj = (x, y) -> x + y;

        int result = obj.sum(10, 20);
        System.out.println("Sum = " + result);
    }
}