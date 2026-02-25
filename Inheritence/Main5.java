class classA{
    void display(){
        System.out.println("Class A");
    }
}

class classB{
    void display(){
        System.out.println("Class B");
    }
}

class classC extends classA,classB{ // convert classes to interfaces.
    void show(){
        System.out.println("Class C");
    }
}

public class Main5 {
    public static void main(String[] args) {
        classC c1 = new classC();
        c1.show();
        c1.display();
    }
}
