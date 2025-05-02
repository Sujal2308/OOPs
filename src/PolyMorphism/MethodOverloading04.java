package PolyMorphism;

import java.util.Arrays;

public class MethodOverloading04 {
    public static void main(String[] args) {
        MethodOverloading04 MO4 = new MethodOverloading04();
//        System.out.println(Arrays.toString(MO4.m4("Sujal","Anil")));
        System.out.println(MO4.m4(10,20));
        System.out.println(MO4.m4());
        System.out.println(MO4.m4(10));
    }
//    String[] m4(String ...a){ //varargs method
//        return a;
//    }
    String m4(int... a){
        return Arrays.toString(a);
    }

    int m4(int b){
        return b;
    }
}
