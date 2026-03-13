class student {
    int rollno;
    String name;
}

public class Main_04 {
    public static void main(String[] args) {
    student S1 = new student();
    student S2 = new student();
    S1.name = "Gaurav Singh";
    S1.rollno = 7;
    S2.name = "Versha shrama";
    S2.rollno = 22;
    System.out.println("Name : "+S1.name+", Rollno : "+S1.rollno);
    System.out.println("Name : "+S2.name+", Rollno : "+S2.rollno);
    }
}
