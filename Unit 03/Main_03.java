interface cal{
    int Wow(int a);
}

public class Main_03 {
    public static void main(String[] args) {
        cal obj;
        obj = (int a)->{
            return a*a;
        };
        System.out.println(obj.Wow(20));

        obj = (int a)->{
            return a*2;
        };
        System.out.println(obj.Wow(5));
    }
}
