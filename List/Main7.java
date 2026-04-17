import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Original list : "+list);

        list.set(2,1000);
        System.out.println("Updated list : "+list);
    }
}
