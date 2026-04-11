import java.util.*;

public class Findany {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Gaurav", "Abhi", "Anupam", "Durgesh","Harsh");

        Optional<String> name = list.stream()
                .filter(n -> n.startsWith("Z"))
                .findAny();

        // System.out.println(name.get());
        if(name.isPresent())
            System.out.println(name.get());
        else
            System.out.println("Not found");
    }
}