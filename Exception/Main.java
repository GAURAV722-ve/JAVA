// Exception distrube the normal Execution of program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int a = S.nextInt();
        int  b = S.nextInt();
        int res = a/b;
        System.out.println("The result is  : "+res);
    }
}