class P1{
    void display(){
        System.out.println("Static display P1");
    }
    static void show(){
        System.out.println("Static display P1");
    }
}

class C1 extends P1{
    void display(){
        System.out.println("Static display C1");
    }
    static void show(){
        System.out.println("Static display C1");
    }
}

public class Main4 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.display();
        P1.show();
    }
}

