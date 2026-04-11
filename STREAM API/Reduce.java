import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int res = list.stream()
                .filter(n->n%2!=0)
                .reduce(0, (n, i) -> n + i);

        System.out.println(res);
    }
}
