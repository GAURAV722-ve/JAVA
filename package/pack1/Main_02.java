// Another Example of private access modifier.
package pack1;
class A{
    private void greeting(){
        System.out.println("Hello Everyone!");
    }
    void show(){
        greeting();
    }
}
public class Main_02 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}