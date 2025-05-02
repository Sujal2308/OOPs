package PolyMorphism;

public class MethodOverloading01 {
    public static void main(String[] args) {
        MethodOverloading01 MO1 = new MethodOverloading01();
        MO1.m1("Sujal");
        System.out.println(MO1.m1(100));
        System.out.println(MO1.m1('a')); // Automatic Type Promotion in Overloading
    }
    void m1(String name){
        System.out.println("Hello "+name);
    }
    int m1(int a){
        return a;
    }

}
