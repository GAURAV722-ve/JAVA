class Example<T,Q>{
    void display(T a, Q b){
        System.out.println(a+" "+b);
    }
}

public class Generic_02 {
    public static void main(String[] args) {
        Example<Integer,String> E1 = new Example<>();
        E1.display(10,"Gaurav Singh");
    }
}
