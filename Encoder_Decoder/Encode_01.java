import java.util.Base64;

public class Encode_01 {
    public static void main(String[] args) {
        String msg = "GOD IS GOOD";
        String encode_msg = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("Encrypted message : "+encode_msg);

        byte[] decode_msg_byte = Base64.getDecoder().decode(encode_msg);
        String decode_msg = new String(decode_msg_byte);
        System.out.println("Decrypted message : "+decode_msg);
    }
}
