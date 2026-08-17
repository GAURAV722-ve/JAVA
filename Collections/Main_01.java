import java.util.*;

public class Main_01 {
    public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // list.add(6);  // They give error UnsupportedOperationException.
        System.out.println(list);
    }
}
