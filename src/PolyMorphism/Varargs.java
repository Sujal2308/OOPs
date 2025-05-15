package PolyMorphism;

public class Varargs {
    /*
    In context of Varargs: Below it's a method overloading not overriding
    because their args type is different (method signature didn't match)
     */
    public static void main(String[] args) {
        Varargs parentRef = new C7();
        System.out.println(parentRef.num(10));

        C7 childRef = new C7();
        System.out.println(childRef.num(10));


    }
    int num (int... a){
        return 10;
    }
}

class C7 extends Varargs{
    int num(int a){
        return 10;
    }
}
