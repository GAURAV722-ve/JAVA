public class Main2 {
    static void Display() throws Throwable{
        System.out.println("Inside display");
        throw new Throwable("Array size is not proper");
    }
    public static void main(String[] args) {
        try{
            Display();
        }catch(Throwable e){
            System.out.println(e.getMessage());
        }
    }
}
