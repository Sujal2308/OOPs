package PolyMorphism;

public class MethodOverriding01 {
    // Method Overriding is also called as Runtime Polymorphism
    // or dynamic polymorphism or late binding
    public static void main(String[] args) {
        MethodOverriding01 obj = new C1();
        MethodOverriding01 obj3 = new MethodOverriding01();
        C1 obj2 = new C1();
        // Which overridden method will be called is depend upon object type
        // and not reference type.
        // Reference type only decides which class member can be accessed
        obj.m1();
        obj2.m1();
        obj3.m1();
    }
    void m1(){
        System.out.println("Namaste World");
    }

}
class C1 extends MethodOverriding01{
    @Override
    void m1(){
        System.out.println("Hello World");
    }
}
