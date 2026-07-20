class Demo1{
    private int r;

    public int getR() {
        
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
public class Get {
    public static void main(String[] args) {
        Demo1 D = new Demo1();
        D.setR(20);
        int res = D.getR();
        System.out.println(res);
    }
}
