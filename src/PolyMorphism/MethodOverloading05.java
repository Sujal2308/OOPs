package PolyMorphism;

public class MethodOverloading05 {
    // Two methods with same name and same number of arguments
    // of same type are considered overloaded if their arguments order
    // is not same
    public static void main(String[] args) {
        MethodOverloading05 MO5 = new MethodOverloading05();
        MO5.m5(10.20f,30);
        MO5.m5(100,20.01f);
    }
    void m5(int a , float b){
        System.out.println(a+","+b);
    }
    void m5(float a , int b){
        System.out.println(a+","+b);
    }
}
