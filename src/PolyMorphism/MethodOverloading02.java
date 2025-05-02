package PolyMorphism;

public class MethodOverloading02 {
    // Case 2 : If parent and child arguments got matched then
    // Child argument will get the highest priority and resolved first
    public static void main(String[] args) {
        MethodOverloading02 M02 = new MethodOverloading02();
        M02.m2(new Object());
//        M02.m1(new String("Hello")); // same String object will call
        M02.m2("Hello");
        M02.m2(null); // string (child) arg called

    }
    void m2(Object O){
        System.out.println("Object type");
    }

    void m2(String s){
        System.out.println("String type");
    }
}
