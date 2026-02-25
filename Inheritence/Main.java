class Parent{
    void display(){
        System.out.println("I am Display() of Parent class");
        // privatemethod();
        protectedmethod();
    }
    // private void privatemethod(){
    //     System.out.println("I am private method of parent class.");
    // }
    protected void protectedmethod(){
        System.out.println("I am private method of parent class.");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("I am in show() of child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
        c.protectedmethod();
    }
}
