class student{
    int r;
    String name;
    static String college = "ABES";
    static int count = 0;

    void getdata(int r, String name){
        this.r = r;
        this.name = name;
        count++;
    }

    void display(){
        System.out.println(r);
        System.out.println(name);
        // System.out.println(college);
        // System.out.println(count);
    }
}
public class Main3 {
    public static void main(String[] args) {
        student S = new student();
        S.getdata(7,"Arvind");
        System.out.println(student.count);
        S.display();
        System.out.println(student.college);
        student S1 = new student();
        S1.getdata(468,"Gaurav");
        System.out.println(student.count);
        S1.display();
        System.out.println(student.college);

    }
}