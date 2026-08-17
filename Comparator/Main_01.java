import java.util.*;

class student {
    int roll;
    String name;
    double marks;

    student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

class sortbyRoll implements Comparator<student> {
    public int compare(student a, student b) {
        return a.roll - b.roll;  // ascending order
    }
}

class sortbyName implements Comparator<student> {
    public int compare(student a, student b) {
        return a.name.compareTo(b.name);
    }
}

class sortbyMarks implements Comparator<student> {
    public int compare(student a, student b) {
        return Double.compare(a.marks, b.marks);
    }
}

public class Main_01 {
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
        list.add(new student(1, "Gaurav Singh", 100.00));
        list.add(new student(2, "Durgesh patel", 89));
        list.add(new student(3, "Arvind", 98.00));

        // Collections.sort(list, new sortbyRoll());
        // Collections.sort(list, new sortbyName());
        Collections.sort(list, new sortbyMarks());
        for(student s : list){
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }
}
