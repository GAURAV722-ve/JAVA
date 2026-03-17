class A{
    static void fun(){
        System.out.println("Hello world!");
    }
}

public class Main_01 {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++)
            A.fun();
    }
}
