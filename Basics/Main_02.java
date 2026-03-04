//Perimeterize Constructor.

class A{
    int a;
    String name;

    A(int X, String y){
        a=X;
        name = y;
    }
    void show(){
        System.out.println("Name : "+name+"\nRollno : "+a);
    }
}

public class Main_02 {
    public static void main(String[] args) {
        A obj = new A(468, "Versha");
        obj.show();
    }
}
