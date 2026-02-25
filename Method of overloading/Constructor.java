class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {

    int age;

    Dog(String name, int age) {
        super(name);   // calling parent constructor
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Dog d = new Dog("Moti", 10);
        d.show();
    }
}