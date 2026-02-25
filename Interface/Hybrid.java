class A{
    void show(){
        System.out.println("Show class A");
    }
}

interface B{
    void show();
}

interface C{
    void show();
}

class D extends A implements B,C{
    public void show(){
        System.out.println("Show in class D");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        D d1 = new D();
        d1.show();
    }
}
