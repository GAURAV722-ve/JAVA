// An abstraction.

abstract class shape1 {
    public abstract void area();

    void display(){
        System.out.println("Class Shape1");
    }
}

class Rectangle extends shape1 {
    public void area() {
        System.out.println("Rectangle : ");
    }
}

class circle extends shape1 {
    public void area() {
        System.out.println("circle : ");
    }
}

class abstraction {
    public static void main(String[] args) {
        shape1 r = new Rectangle();
        r.area();
        r.display();

        shape1 c = new circle();
        c.area();
        c.display();
    }
}