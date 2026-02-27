package pack1;

public class private1 {
    private void show(){
        System.out.println("This is a private method in class private.");
    }
    public static void main(String[] args) {
        private1 obj = new private1();
        obj.show();
    }
}
