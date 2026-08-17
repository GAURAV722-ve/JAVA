interface IOperation{
    int doOP(int a);
}

class cls1 implements IOperation{
    public int doOP(int a){
        return a*a;
    }
}

class cls2 implements IOperation{
    public int doOP(int a){
        return a*2;
    }
}

public class Main_02 {
    public static void main(String[] args) {
        cls1 obj1 = new cls1();
        cls2 obj2 = new cls2();
        System.out.println(obj1.doOP(10));
        System.out.println(obj2.doOP(20));
    }
}
