import java.util.ArrayList;
import java.util.List;

public class Exam_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(31);
        list.stream()
            .filter(n->n%2==0)
            .forEach(System.out::println);
            // .forEach(n->System.out.println(n));
    }
}
