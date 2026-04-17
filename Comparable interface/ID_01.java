import java.util.*;

class Employees1 {
    int id;
    String name;
    double sal;

    Employees1(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal;
    }
}

public class ID_01 {
    public static void main(String[] args) {
        List<Employees1> list = new ArrayList<>();
        list.add(new Employees1(468, "Gaurav Singh", 1200));
        list.add(new Employees1(468, "Anupam Singh", 1300));
        list.add(new Employees1(469, "Harsh Singh", 25562));
        list.add(new Employees1(454, "Durgesh Patel", 452230));

        Collections.sort(list, (a, b) -> Integer.compare(a.id, b.id));

        for (Employees1 i : list) {
            System.out.println(i);
        }
    }
}