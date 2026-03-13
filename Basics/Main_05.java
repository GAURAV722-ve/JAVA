class A{
    int x=10;
    static int y=20;
    void Test1(){
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
    static void Test2(){
        // System.out.println("X : "+x); //cannot be referenced from a static context.
        System.out.println("Y : "+y);
    }
}

public class Main_05 {
     public static void main(String[] args) {
        A obj = new A();
        System.out.println("Y : "+A.y);
        obj.Test1();
        A.Test2();
     }
}
