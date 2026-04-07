public class Main_01 {
    public static void main(String[] args) {
        // Boxing. 
        int a = 10;
        System.out.println("Primitive value "+a);
        Integer I = Integer.valueOf(a);
        System.out.println("Interger Wrapper "+I);
        boolean V = I instanceof Integer;
        System.out.println(V);
        // Autoboxing
        int b = 20;
        Integer I1 = b;
        System.out.println("Autoboxing: "+I1);
        boolean v1 = I1 instanceof Integer;
        System.out.println(v1);
        // Another Example.
        float c = 10.5f;
        Float F1 = c;
        System.out.println("Wrapper Float : "+F1);
    }
}
