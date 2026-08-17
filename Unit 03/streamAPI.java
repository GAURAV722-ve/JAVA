import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String[] args) {
        List<String> name = List.of("Akash", "Gaurav Singh", "Anupam");

        List<String> res = name.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}