public class Var_01 {
    int x = 10;
//  var y = 20;
//     Var_01.java:3: error: 'var' is not allowed here
//     var y = 20;
//     ^
// 1 error
    public static void main(String[] args) {
        Var_01 V1 = new Var_01();
        System.out.println(V1.x);
        // System.out.println(V1.y);
    }
}