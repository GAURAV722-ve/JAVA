import java.util.Scanner;

import javax.script.ScriptContext;

public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter a array : ");
        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            a[i]=s.nextInt();
        }
        System.out.println("\nElement of array are :");
        for(int b : a){
            System.out.println(b+" ");
        }
        }
    }
