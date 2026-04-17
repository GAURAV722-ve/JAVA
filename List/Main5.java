import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Original list : "+list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Sorted list : "+list);
    }
}
