class parent{
    int a,b;
    void show(){
        System.out.println(a+" and "+b);
    }
}

class child extends parent{
    int c;
    void display(){
        System.out.println(c);
    }
    void getsum(){
        System.out.println(a+b+c);
    }
}
public class Main1 {
    public static void main(String[] args) {
        // parent P = new parent();
        // P.a = 10;
        // P.b = 20;
        // P.show();
        child c = new child();
        c.a = 10;
        c.b = 20;
        c.c = 30;
        c.show();
        c.display();
    }
}
