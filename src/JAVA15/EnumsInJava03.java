package JAVA15;

import java.util.Scanner;

public class EnumsInJava03 {
    public static enum COMPANY{AMAZON,BBC_NEWS,COLGATE};

    // inside switch we can only pass byte,short,char,int and their
    // corresponding wrapper classes(Byte,Short,Character,Integer) +
    // Strings + ENUMS also but not rest primitives and objects
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        COMPANY c  = COMPANY.AMAZON;

        switch (c) {
            case COLGATE -> System.out.println("jeffrey");
            case AMAZON -> System.out.println("Jeff");
//            case FLIPKART -> System.out.println(""); every case must be the valid enum constant
            default -> System.out.println("enter valid char");
        }
    }
}
