interface Example {
    int n=10;
    void display();
}

class Test implements Example{
    public void display(){
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Test T = new Test();
        T.display();
        System.out.println(Example.n);
        System.out.println(Test.n);
    }
    
}