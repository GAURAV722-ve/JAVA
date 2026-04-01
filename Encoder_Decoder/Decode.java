import java.util.Base64;

public class Decode {
    public static void main(String[] args) {

        // Encoder
        String name = "Gaurav Singh";
        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded: " + encoded);

        // Decoder
        String decoded = new String(
                Base64.getDecoder().decode(encoded)
        );
        System.out.println("Decoded: " + decoded);
    }
}