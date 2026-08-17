interface  cal{
    int sum(int a, int b);
}

public class LamdaFun {
    public static void main(String[] args) {
        cal c = (a,b)-> a+b;
        System.out.println("Sum : "+c.sum(10, 30));
    }
}
