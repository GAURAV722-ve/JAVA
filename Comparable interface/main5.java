import java.util.*;

class Student3 {
    int r;
    String name;

    public Student3(int r, String name) {
        this.r = r;
        this.name = name;
    }
}

public class main5 {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<>();

        list.add(new Student3(5, "Durgesh"));
        list.add(new Student3(2, "Gaurav Singh"));
        list.add(new Student3(3, "Mukesh"));

        
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));

        for (Student3 i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}