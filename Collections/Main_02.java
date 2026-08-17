import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main_02{
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Enhance for each loop
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println("");

        // For each method
        list.forEach(n-> System.out.print(n+" "));
        System.out.println("");
        
        // Iterator interface
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}