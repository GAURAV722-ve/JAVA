import java.util.Base64;

public class Encode {
    public static void main(String[] args) {
        String name = "Gaurav Singh";
        String enstr = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(enstr);   
    }
}
