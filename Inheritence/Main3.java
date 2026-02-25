class grandpraent{
    void display(){
        System.out.println("I am grand parent class.");
    }
}

class parent extends grandpraent{
    void show(){
        System.out.println("I am parent class.");
    }
}

class child extends parent{
    void see(){
        System.out.println("I am child class.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        
    }
}
