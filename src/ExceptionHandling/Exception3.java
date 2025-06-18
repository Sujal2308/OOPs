package ExceptionHandling;

import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Exception3 {
//    //! A parent exception can
    public static void main(String[] args){
        try{
         System.out.println(div(10,0));
         }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            file();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Hello");
        }

    }
    static int div(int a,int b) throws Exception{

        return a/b;
    }

    static void file() throws IOException {
        FileReader fw = new FileReader("Demo.text");
        System.out.println(fw);
    }
}
