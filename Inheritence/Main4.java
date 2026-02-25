class Animal{
    void eat(){
        System.out.println("Animal eat.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Woof");
    }
}

class cat extends Animal{
    void meow(){
        System.out.println("Meow");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Dog D = new Dog();
        System.out.println("Dog");
        D.bark();
        D.eat();
        System.out.println("Cat");
        cat C = new cat();
        C.meow();
        C.eat();
    }
}
