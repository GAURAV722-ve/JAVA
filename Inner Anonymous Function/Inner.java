class Parent{
    void display(){
        System.out.println("Display in parent class");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Display in child class");
    }
}

public class Inner {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
    }
}
