class scooter{
    void run(){
        System.out.println("Grrrrr");
    }
}

class Bike extends scooter{
    void run(){
        super.run();
        System.out.println("Furrrr");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // scooter s = new scooter();
        // s.run();
        Bike B = new Bike();
        B.run();
    }
}
