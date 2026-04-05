import java.util.Scanner;

interface greet {
    String GM(String name);
}

public class Main_01 implements greet {

    public String GM(String name){
        return "Hello " + name;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("May I know what is your name?");
        String name = S.nextLine();

        Main_01 M = new Main_01();
        String res = M.GM(name);

        System.out.println(res);

        S.close();
    }
}