public class class1 {
    int r;
    String name;

    void getdata() {
        r = 1;
        name = "ABC";
    }

    void display() {
        System.out.println(r);
        System.out.println(name);
    }

    public static void main(String[] args) {
        class1 s1 = new class1();
        s1.getdata();
        s1.display();
    }
}
