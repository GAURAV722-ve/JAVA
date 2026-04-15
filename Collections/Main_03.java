import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main_03 {
    public static void main(String[] args) {
        // Spliterator interface
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list+" ");
        Spliterator<Integer> sp1 = list.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();;
        System.out.println("First Part");
        sp1.forEachRemaining(n->System.out.print(n+" "));
        System.out.println("\nSecond Part");
        sp2.forEachRemaining(n->System.out.print(n+" "));
    }
}