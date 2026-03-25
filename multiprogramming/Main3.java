interface Example1{
    void Example1();
}

public class Main3{
    int a;

    public Main3(int a) {
        this.a = a;
    }
    
    void show(){
        Example1 E2 = () -> System.out.println(a);
        E2.Example1();  
    }

    public static void main(String[] args) {
        Main3 M1 = new Main3(10); 
        M1.show();
    }
}