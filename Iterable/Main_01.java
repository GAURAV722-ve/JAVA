import java.util.Arrays;
import java.util.Iterator;

public class Main_01 {
    public static void main(String[] args) {
        Iterable<Integer> list = Arrays.asList(1,2,3,4,5);

        // Enhance for each loop
        // for(Integer i:list){
        //     System.out.print(i+" ");
        // }

        // For each method
        // list.forEach(n-> System.out.print(n+" "));

        // Iterator interface
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
