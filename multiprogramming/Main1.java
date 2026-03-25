interface sample{
    void Display();
    
}

public class Main1 implements sample{
    public void Display() {
        System.out.println("Display in main class");
    }
    public static void main(String[] args) {
        Main1 M = new  Main1();
        M.Display();
    }
}