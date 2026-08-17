import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println(list.get(0));     // 10
        System.out.println(list.size());     // 2
        System.out.println(list.hashCode()); // hash value
        System.out.println(list.isEmpty());  // false
        System.out.println(list.contains(10)); // true

        list.clear();
        System.out.println(list);            // []
    }
}