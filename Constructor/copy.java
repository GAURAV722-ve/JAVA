class A{
    int a; String b;
    A(){
        a=10; b="Backbencher";
        System.out.println(a+" "+b);
    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

public class copy {
    public static void main(String[] args) {
        A ref = new A();
        A x = new A(ref);
    }
} 