import java.util.ArrayList;
import java.util.List;

class Student{
    int r;
    String name;

    Student(int r, String name){
        this.r = r;
        this.name = name;
    }

    @Override
    public String toString() {
        return r + " " + name;
    }
}



public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(468,"Gaurav Singh"));
        list.add(new Student(469,"Anupam Singh"));
        list.add(new Student(468,"Harsh Singh"));
        list.add(new Student(468,"Durgesh patel"));

        System.out.println(list);

        for(Student i:list){
            System.out.println(i.r +" " + i.name);
        }
    }
}
