import java.util.ArrayList;
import java.util.List;

class Employees1{
    int id;
    String name;
    double sal;

    Employees1(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal;
    }
}



public class Employees {
    public static void main(String[] args) {
        List<Employees1> list = new ArrayList<>();
        list.add(new Employees1(468,"Gaurav Singh",1200));
        list.add(new Employees1(469,"Anupam Singh",1300));
        list.add(new Employees1(468,"Harsh Singh",25562));
        list.add(new Employees1(468,"Durgesh patel",452230));

        System.out.println(list);

        for(Employees1 i:list){
            System.out.println(i.id +" " + i.name+ " " + i.sal);
        }

        list.remove(2);
        System.out.println("Updated list");
        for(Employees1 i:list){
            System.out.println(i.id +" " + i.name+ " " + i.sal);
        }
    }
}
