// Functional Interface -->> Functional Programming.

interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("Hello");
    }
}

public class Main_02 {
    public static void main(String[] args) {
        B t = new B();
        t.show();
    }
}
