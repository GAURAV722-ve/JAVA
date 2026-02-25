class A{
    final void display(){
        System.out.println("Hyy i am class A");
    }
}

class B extends A{
    void display(){
        System.out.println("Hyy i am class B");
    }
}

public class Toclass {
    public static void main(String[] args) {
        B B1 = new B();
        B1.display();
    }
}
