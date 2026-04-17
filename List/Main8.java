import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(13);
        list2.add(100);
        list2.add(103);
        list2.add(102);
        System.out.println(list1);
        System.out.println(list2);

        list1.addAll(0,list2);

        System.out.println("Merging list : "+list1);

    }
}
