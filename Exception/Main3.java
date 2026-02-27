class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Main3 {

    static void display() throws MyException {
        System.out.println("Inside display");
        throw new MyException("This is exception");
    }

    public static void main(String[] args) {
        try {
            display();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
