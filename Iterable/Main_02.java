import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main_02 {
    public static void main(String[] args) {
        // Spliterator interface
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Spliterator<Integer> sp = list.spliterator();
        sp.tryAdvance(n->System.out.println(n));
        System.out.println("Remaining Elements");
        sp.forEachRemaining(n->System.out.print(n+" "));
    }
}
