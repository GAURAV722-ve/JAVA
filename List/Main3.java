import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.forEach(n->System.out.print(n+" "));

        list.remove(1);
        System.out.println("");
        System.out.println("After removal of 1 index : "+list);

    }
}
