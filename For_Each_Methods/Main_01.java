import java.util.*;
import java.util.function.Consumer;

public class Main_01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,56,7);
        System.out.println(list);
        Consumer<Integer> obj = new Consumer<>(){
            public void accept(Integer n) {
                System.out.println(n);
            }
        }; 
        list.forEach(obj);
    }
}