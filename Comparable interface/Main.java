import java.util.*;

class Employees implements Comparable<Employees> {
    int id;
    String name;
    double sal;

    Employees(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal;
    }

    @Override
    public int compareTo(Employees e) {
        if(id==e.id)
            return 0;
        else if(id> e.id)  
            return 1;
        else
            return -1;
    }
}
 


public class Main {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(468,"Gaurav Singh",1200));
        list.add(new Employees(468,"Anupam Singh",1300));
        list.add(new Employees(469,"Harsh Singh",25562));
        list.add(new Employees(454,"Durgesh patel",452230));

        Collections.sort(list);
        for(Employees i:list){
            System.out.println(i.id +" " + i.name+ " " + i.sal);
        }

    }
}
