interface Vehical{
    void start();
    default void horn(){
        System.out.println("Beep Beep");
    }
}

class car implements Vehical{
    public void start(){
        System.out.println("Car Starting");
    }
}

public class Interface_01 {
    public static void main(String[] args) {
        car C = new car();
        C.start();
        C.horn();
    }
}
