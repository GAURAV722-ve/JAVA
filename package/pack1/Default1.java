package pack1;

class A{
    void show(){
        System.out.println("This is a default method in class A.");
    }
}

public class Default1 {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}
