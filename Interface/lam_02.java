import java.util.function.BiFunction;

public class lam_02 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum : " + sum.apply(10, 20));
    }
}
