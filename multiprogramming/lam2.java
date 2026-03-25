interface sample {
    void str(String name);
}

public class lam2 {
    public static void main(String[] args) {

        sample S = (String name) ->
            System.out.println("Sample name : " + name);

        S.str("Gaurav singh");
    }
}