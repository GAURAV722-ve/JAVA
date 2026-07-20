class staticMethod {
    static int add(int x,int y){
        return(x+y);
    }
    static int sub(int x,int y){
        return(x-y);
    }
    static int mul(int x,int y){
        return(x*y);
    }
    static int div(int x,int y){
        return(x/y);
    }
}
public class Main4 {
    public static void main(String[] args) {
        int res1 = staticMethod.add(10, 20);
        int res2 = staticMethod.sub(10, 20);
        int res3 = staticMethod.mul(10, 20);
        int res4 = staticMethod.div(10, 20);

        System.out.println("Addition: " + res1);
        System.out.println("Subtraction: " + res2);
        System.out.println("Multiplication: " + res3);
        System.out.println("Division: " + res4);

    }
}
