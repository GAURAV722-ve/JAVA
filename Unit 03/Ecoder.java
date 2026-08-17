import java.util.Base64;
import java.util.Scanner;

public class Ecoder {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Entre the String : ");
        String str = S.nextLine();

        String Enco = Base64.getEncoder().encodeToString(str.getBytes());
        String Deco = new String (Base64.getDecoder().decode(Enco));
        System.out.println("Encode : "+Enco);
        System.out.println("Decode : "+Deco);
    }
}
