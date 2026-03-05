package pack1;

class A{
    protected void show(){
        System.out.println("Hello Every one.");
    }
}

public class protected_01 extends A {
    public static void main(String[] args) {
        // A obj = new A();
        protected_01 obj = new protected_01();
        obj.show();
    }
}
