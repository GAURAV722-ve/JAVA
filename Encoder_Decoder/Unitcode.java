import java.util.Base64;

public class Unitcode {
    public static void main(String[] args) {

        String name = "https://www.google.com/";

        // Encode
        String enstr = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded: " + enstr);

        // Decode
        String decoded = new String(Base64.getDecoder().decode(enstr));
        System.out.println("Decoded: " + decoded);
    }
}
