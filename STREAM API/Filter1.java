import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
      public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 8, 1, 2, 3, 9);
        List<Integer> res = list.stream()
        .filter(n->n%2!=0)
        .map(n -> n * n)
        .collect(Collectors.toList());
        System.out.print(res);

    }
}
