interface I1{
    int r= 17;
    String name="Gaurav Singh";
}

interface I2 extends I1{
    void display();
}



class Main1 implements I2{
    public void display() {
        System.out.println("Rollno : "+r);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        Main1 M = new Main1();
        M.display();
        System.out.println(Main1.r);
        System.out.println(Main1.name);
    }
}
