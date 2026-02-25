class A{
    int x,y;
    A(int a, int b){
        x=a;
        y=b;
    }
    void show(){
        System.out.println(x+" "+y);
    }
}

public class perimetrized{
    public static void main(String[] args) {
        A ref = new A(200,100);
        ref.show();
    }
}