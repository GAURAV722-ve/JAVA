import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Original list : "+list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list : "+list);
    }
}
