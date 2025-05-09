package PolyMorphism;

public class Shadowing {
    /*
    Shadowing or Variable hiding : We can't override variables (either
    static or non-static) but we can redefine it

    Note : Variable resolution is taken care by compiler based on
    reference types not object types
     */
    int num = 100;
    static String NAME = "universal";

    public static void main(String[] args) {

        Shadowing sh = new C6();
        System.out.println(sh.num); // 100 not 200
        System.out.println(C6.NAME);

        C6 obj = new C6();
        System.out.println(obj.num);



    }
}

class C6 extends Shadowing{
    int num = 200;
    static String NAME = "multiversal";
}
