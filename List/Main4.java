import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Original list : "+list);
        Collections.sort(list);
        System.out.println("Sorted list : "+list);
    }
}
