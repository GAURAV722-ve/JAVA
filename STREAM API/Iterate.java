import java.util.*;
import java.util.stream.*;

public class Iterate {
    public static void main(String[] args) {

        List<Integer> list = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}