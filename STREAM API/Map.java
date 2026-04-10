import java.util.*;
import java.util.stream.Stream;

public class Map {
  public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7,8,1,2,3,9,4,5,6);
        Stream<Integer> strm = list.stream();
        Stream<Integer> data = strm.map(n->n*n);
        data.forEach(n->System.out.print(n+" "));
  }
}