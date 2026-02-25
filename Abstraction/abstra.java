abstract class Exampel{
    abstract void display();
    void show(){
        System.out.println("Show in abstract class.");
    }
}

class test extends Exampel{
    void display(){
        System.out.println("Display method in test");
    }
}

public class abstra {
    public static void main(String[] args) {
        test T = new test();
        T.display();
        T.show();
    }
}
