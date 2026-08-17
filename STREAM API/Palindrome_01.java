public class Palindrome_01 {
    public static void main(String[] args) {
        String str = "mam";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("This given string is palindrom.");
        }
        else{
            System.out.println("This given string is not palindromeṇ");
        }
    }
}