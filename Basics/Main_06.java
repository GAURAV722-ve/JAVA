class A{
    String name;
    static String college="IIT";
    void fun1(){
        System.out.println("Name : "+name+", College name : "+college);
    }
}

public class Main_06 {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        t1.name = "Gaurav singh";
        t2.name = "Ashok";
        t1.fun1();
        t2.fun1();
    }
}
