import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String original = "GOD IS GOOD";

        // 🔹 Encoding
        Base64.Encoder encoder = Base64.getEncoder();
        String encoded = encoder.encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);

        // 🔹 Decoding
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
    }
}