package CRT25.Project01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringsInJava {
    public static void main(String[] args){
        String s = "sujal";
        String s1 = "sujal";

        String s2 = new String("abcd");
        String s3 = new String("abcd");


        System.out.println(s1==s);
        System.out.println(s.equals(s1));

        System.out.println("===================");

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));


        int len = "".length();
        System.out.println(len);

        System.out.println("Heollo".lastIndexOf('o'));



    }
}
