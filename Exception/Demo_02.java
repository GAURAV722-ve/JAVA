public class Demo_02 {
    public static void main(String[] args) {
        try{
            // System.out.println(5/0);
            String S = null;
            S.length();
        }
        // catch(ArithmeticException e){
        //     System.out.println("/ by zero is not allowed");
        // }
        // catch(NullPointerException e){
        //     System.out.println("Nulls are not allowed");
        // }

        catch(ArithmeticException |NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Run Time Exception occur");
        }
        catch(Exception e){
            System.out.println("Some generice Exception");
        }
    }
}
