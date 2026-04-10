import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 8, 1, 2, 3, 9);

        List<Integer> res = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        res.forEach(n -> System.out.print(n+" "));
        // System.out.println(res);
    }
}