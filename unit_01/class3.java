class Demo{
    String name;
    long mob;
    void getdata(String x, long y){
        name = x;
        mob = y;
    }
    void display(){
        System.out.println(name);
        System.out.println(mob);
    }
}
public class class3 {
    public static void main(String[] args) {
        Demo a = new Demo();
        a.getdata("Versha", 8810000065L);
        a.display();
    }
}
