interface sample{
    void show(String name);
}

public class Main2 {
    public static void main(String[] args) {
        sample S = (String name)->System.out.println("Hello "+name);
        S.show("Gaurav Singh");
    }
}
