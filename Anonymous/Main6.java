class StaticExample{
    void normal(){
        display();
        System.out.println("I am Normal method.");
    }
    static void display(){
        show();
        System.out.println("I am static display.");
    }
    static void show(){
        System.out.println("I am static show.");
    }
}
public class Main6 {
    public static void main(String[] args) {
        StaticExample SE = new StaticExample();
        SE.normal(); 
        StaticExample.display();
        StaticExample.show();
    }
}
