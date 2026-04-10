import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Gaurav", "Abhi", "Anupam", "Durgesh");
        List<String> Name = list.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        // System.out.print(Name);
        Name.forEach(name -> System.out.print(name + " "));
    }
}
