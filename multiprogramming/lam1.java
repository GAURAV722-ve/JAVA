interface  sample{
    void display();
}

public class lam1 {
    public static void main(String[] args) {
        sample S = ()-> System.out.println("I am in display.");
        S.display();
    }
}
