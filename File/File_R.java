import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_R {
    public static void main(String[] args) {
        try{
            File r = new File("D:\\File_R.txt");
            Scanner S1 = new Scanner(r);

            while(S1.hasNextLine()){
                System.out.println(S1.nextLine());
            }

            S1.close();
        }
        catch(IOException e){
            System.out.println("Error while reading file");
        }
    }
}