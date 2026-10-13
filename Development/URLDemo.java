import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://claude.ai/chat/a2");

            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host Name: " + u.getHost());
            System.out.println("Port Number: " + u.getPort());
            System.out.println("File Name: " + u.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}