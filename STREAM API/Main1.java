import java.util.*;
import java.util.stream.Stream;

public class Main1 {
  public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7,8,1,2,3,9,4,5,6);
        Stream<Integer> strm = list.stream();
        Stream<Integer> sorteddata = strm.sorted();
        sorteddata.forEach(n->System.out.print(n +"  "));
    }
}
