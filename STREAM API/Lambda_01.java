interface sqrt{
    int square(int a);
}

public class Lambda_01 {
    public static void main(String[] args) {
        sqrt s = (int a) ->  a*a ;
        System.out.println(s.square(10));
    }
}
