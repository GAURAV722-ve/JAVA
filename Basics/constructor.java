class A{
    int a ;
    String name;

    A(){
        a =10;
        name = "Gaurav singh";
    }
    void show(){
        System.out.println(a+ " "+name);
    }
}



public class constructor {
    public static void main(String[] args) {
        A data=new A();
        data.show();
    }
}
