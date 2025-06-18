package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Exception01 {

    public static void main(String[] args){
        //! checked exception - frequently occurred -----
        // Checked at compile time
        try{
            FileReader fr  = new FileReader("demo.txt");
            System.out.println(fr.toString());
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello world");
    }

}
