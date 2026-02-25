package pack1;

class sample1{
    public static int r=1;
    public static String name = "Gaurav Singh";
    public static void display(){
        System.out.println("Display in sample 1 class");
        System.out.println(r+" "+name);
    }
}

public class First extends sample1{
    public static void main(String[] args) {
        sample1.display();
    }
}