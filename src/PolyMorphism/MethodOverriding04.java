package PolyMorphism;

public class MethodOverriding04 {
    /* Make sure you can't minimize the scope of overriding methods
    but you can happily extend the scope meaning if parent method is
    public then you can't make it private , default , protected in child class
    but you can do vice versa
     */

    public static void main(String[] args) {
        MethodOverriding04 MO4 = new C4();
        MO4.m1(); // child method
        MO4.m2(); // child
        MethodOverriding04 parentRef = new MethodOverriding04();
        parentRef.m1(); //parent method
        parentRef.m2(); // parent method
    }

    //overridden default method
     void m1(){
        System.out.println("default Parent method");
    }

    void m2(){
        System.out.println("default parent method");
    }

    public void m3(){
        System.out.println("Public parent method");
    }
}
class C4 extends MethodOverriding04{
    // overriding parent method
    @Override
    public void m1(){ // extending scope by making it public
        System.out.println("public Child method");
    }

    @Override
    protected void m2(){ // protected scope >> default scope
        System.out.println("protected child method");
    }

//    @Override
//    void m3(){ // minimizing access scope not allowed
//        System.out.println("default child method");
//    }
}
