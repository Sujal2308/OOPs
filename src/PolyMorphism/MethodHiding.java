package PolyMorphism;

public class MethodHiding {
    /*
     Take very special care : Static methods can't be overridden as
     non-static and vice versa but what if both are static ???
     Then it's not overriding but Method-Hiding
     */

    /*
    Note :
    1) Method Hiding : Method resolution is taken care by compiler
    based on reference type . Both methods must be static

    2) Method Overriding : Here method resolution is taken care by
    JVM based on runtime object type . Both methods must be non-static
     */
    public static void main(String[] args) {
        MethodHiding.m1();
        C5.m1();

        MethodHiding MH = new C5();
        MH.m1();

    }
    static void m1(){
        System.out.println("Parent static method");
    }
}
class C5 extends MethodHiding{
//    void m1(){     can't override static methods
//        System.out.println("Child method");
//    }
    static void m1(){
        System.out.println("Child static method");
    }
}