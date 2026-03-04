// Non- Perimeterized Constructor or Default Constructor.

class A {
    // int a=468;
    // String name="Gaurav Singh";

    int a;
    String name;

    // A(){
    //     a=20;
    //     name="Versha";
    // }

    void show(){
        System.out.println("Name : "+name+"\nRollno : "+a);
    }
}

public class Main_01 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
