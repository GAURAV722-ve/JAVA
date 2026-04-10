import java.util.*;

public class pipeline2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7,8,1,2,3,9,4,5,6);

        list.stream()
            .sorted()
            .forEach(n -> System.out.print(n + " "));
    }
}