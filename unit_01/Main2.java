public class Main2 {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(); // object stored in heap
        R.getdata(5, 10);
        int res = R.area();
        System.out.println("The area of rectangle is : " + res);
    }
}