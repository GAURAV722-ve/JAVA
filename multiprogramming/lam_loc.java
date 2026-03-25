@FunctionalInterface
interface sample {
    String display(String name);
}

public class lam_loc {
    public static void main(String[] args) {

        String str = "Hello";

        sample S = (name) -> {
            return str + " " + name;
        };

        String res = S.display("Gaurav Singh");
        System.out.println(res);
    }
}