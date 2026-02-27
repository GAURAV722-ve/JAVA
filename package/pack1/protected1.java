package pack1;
class A{
    protected void show(){
        System.out.println("This is a protected method in class A.");
    }
}
public class protected1 {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}
