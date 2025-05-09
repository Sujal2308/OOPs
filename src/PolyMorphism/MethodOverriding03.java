package PolyMorphism;

public class MethodOverriding03 {
    // Private methods can't be overridden since they are accessible
    // within the class only so when we create exact same private methods
    // in 2 parent and subclass they are independent of each other
    public static void main(String[] args) {
        MethodOverriding03 M03 = new C3();
        M03.m1(); // not a runtime polymorphism , here method resolution is taken care by compiler
        C3 childObj = new C3();
//        childObj.m1() can't access private methods in diff class

    }

    private void m1(){
        System.out.println("Parent method");
    }

}

class C3 extends MethodOverriding03{
   private void m1(){
       System.out.println("Child method");
    }
}
