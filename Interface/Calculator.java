interface add{
    void sum(int a, int b);
}

interface sub{
    void subtract(int a, int b);
}

class A implements add, sub{
    public void sum(int a, int b){
        System.out.println("Addition : "+(a+b));
    }
    public void subtract(int a, int b){
        System.out.println("Subtraction : "+(a-b));
    }
}

public class Calculator {
    public static void main(String[] args) {
        A a = new A();
        a.sum(10, 20);
        a.subtract(20, 15);
    }
}
