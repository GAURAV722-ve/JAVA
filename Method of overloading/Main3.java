class P1{
    static void display(){
        System.out.println("Static Display P1 class.");
    }
}

class C1 extends P1{
    static void display(){
       System.out.println("Static Display C1 class."); 
    }
}

public class Main3 {
    public static void main(String[] args) {
        P1.display();
        C1.display();
    }
}
