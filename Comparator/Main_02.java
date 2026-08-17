import java.util.*;

class student1 {
    int roll;
    String name;
    double marks;

    student1(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class Main_02 {
    public static void main(String[] args) {
        List<student1> list = new ArrayList<>();

        list.add(new student1(1, "Gaurav Singh", 100.00));
        list.add(new student1(2, "Durgesh Patel", 89));
        list.add(new student1(3, "Arvind", 98.00));

        // Sorting by roll, then name
        list.sort(
            Comparator.comparing((student1 s) -> s.roll)
                      .thenComparing(s -> s.name)
        );

        for (student1 s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }
}