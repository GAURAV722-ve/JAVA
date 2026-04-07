abstract class Example{
    abstract void display();
}

public class Main_02 {
    public static void main(String[] args) {
        Example E1 = new Example() {
            void display(){
                System.out.println("Hello everyone!");
            }
        };
        E1.display();
    }
    
}
