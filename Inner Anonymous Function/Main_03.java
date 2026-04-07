class OuterClass {
    void display() {
        System.out.println("Display method in outer class.");
    }

    class InnerClass {
        void show() {
            System.out.println("Display method in inner class.");
        }
    }
}

public class Main_03 {
    public static void main(String[] args) {
        OuterClass OC = new OuterClass();
        OC.display();
        OuterClass.InnerClass IC = OC.new InnerClass();
        IC.show();
    }
}
