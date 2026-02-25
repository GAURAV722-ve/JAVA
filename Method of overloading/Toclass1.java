class A{
    // int a=10;
    // final int a =10; // Final instance variable.
    // final int a;  // Final instance blanck variable.
    final static int a ;
    static {
        a=10;
    }
}

public class Toclass1 {
    public static void main(String[] args) {
        System.out.println(A.a);
    }
}
