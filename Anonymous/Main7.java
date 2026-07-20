class demo{
    private int r;
    private String name;
    void getdata(int r, String name){
        this.r = r;
        this.name = name;
    }
    void show(){
        System.out.println(r);
        System.out.println(name);
    }
}
public class Main7 {
    public static void main(String[] args) {
        demo D = new demo();
        // D.r = 10;
        // D.name = "Arvind";
        // System.out.println(D.r);
        // System.out.println(D.name);
        D.getdata(10, "Arvind");
        D.show();
    }
}
