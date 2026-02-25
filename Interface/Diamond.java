interface A{
    default void display(){
        System.out.println("Display in interface A");
    }
}

interface B extends A{
    default void display(){
        System.out.println("Display in interface B");
    }
}

interface C extends A{
    default void display(){
        System.out.println("Display in interface C");
    }
}

class program2 implements B,C{
    public void display(){
        C.super.display();
        B.super.display();
        System.out.println("Display in class program");
    }
}

public class Diamond {
    public static void main(String[] args) {
        program2 p2 = new program2();
        p2.display();
    }
}
