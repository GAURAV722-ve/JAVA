
import java.util.Scanner;

interface Area{
    double cal(double r);
}

public class CircleArea{
    public static void main(String[] args) {
        Area A = (double r)->Math.PI*r*r;
        System.out.print("Enter radius  : ");
        Scanner S = new Scanner(System.in);
        double radius1 = S.nextDouble();
        double res = A.cal(radius1);
        System.out.println("Area  : "+res+"unit");
    }
}