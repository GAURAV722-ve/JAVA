class A{
    int a;
    String b;
    boolean c;
    A(){
        a = 22;
        b = "Versha";
        c = true;
    }
    void display(){
        System.out.println(a+" "+b+" "+c);
    }
}

public class Default {
    public static void main(String[] args) {
        A r = new A();
        r.display();
    }
}
