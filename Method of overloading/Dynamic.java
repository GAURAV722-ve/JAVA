class p {
    void display() {
        System.out.println("Display of p class.");
    }
}

class c extends p {
    void display() {   // Method overriding
        System.out.println("Display of c class.");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        p C1 = new c();   // Superclass reference, Subclass object
        C1.display();     // Dynamic Method Dispatch
    }
}
