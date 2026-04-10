import java.util.*;
import java.util.function.Consumer;

public class Main_02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,56,7);
        System.out.println(list);
        Consumer<Integer> obj = (Integer n) -> System.out.println(n); 
        list.forEach(obj);
    }
}
