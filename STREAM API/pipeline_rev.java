import java.util.*;

public class pipeline_rev {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7,8,1,2,3,9,4,5,6);

        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(n -> System.out.print(n + " "));
    }
}