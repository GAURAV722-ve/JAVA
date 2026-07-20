class Test {
    void show() {
        System.out.println("Hello");
    }
}

public class anonymous_obj {
    public static void main(String[] args) {
        new Test().show();   // Anonymous object
    }
}