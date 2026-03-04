class A{
    int sum(int x, int y){
        int sum = x+y;
        return sum;
    }
    void show(int x){
        System.out.println("Sum : "+x);
    }
}

public class Method_01 {
    public static void main(String[] args) {
        A obj = new A();
        int x = obj.sum(10, 20);
        obj.show(x);
    }
}
