import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer a[] = {1,2,3,4,5};
        for(Integer i:a){
            list.add(i);
        }
        list.forEach(n->System.out.print(n+" "));
    }
}
