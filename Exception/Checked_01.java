import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_01 {
    public static void main(String[] args) {
            try{
                readfile();
            }
            catch(FileNotFoundException e){
                System.out.println(e.getMessage());
            }
    }
    private static void readfile() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

// Checked Exception --> throws