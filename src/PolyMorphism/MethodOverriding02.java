package PolyMorphism;
// Covariant return type -  strictly for non-primitives(objects)

import java.util.ArrayList;

class Animal {}; // parent class

class dog extends Animal{}; // child class of Animal

public class MethodOverriding02 {
       Animal m1(){ // overridden method
        return new Animal();
    }

    Number m2(){
           return  Integer.valueOf(4); // or return 4
    }

    Object m3(){
           return new Object().hashCode();
    }

    int m4(){
           return 5;
    }

    public static void main(String[] args) {
        MethodOverriding02 M02 = new C2();
        System.out.println(M02.m1());
        System.out.println(M02.m2());// calls child method so 10i
        System.out.println(M02.m3());

    }
}
class C2 extends MethodOverriding02{
    // overriding the method m1 of parent
      dog m1(){ // overriding method
          /* Here we can clearly see return type of overriding class defined in subclass
          is a child class of return type of overridden method defined
          in parent
           */
        return new dog();
    }

    Integer m2(){
//          return Integer.valueOf(10); or
        return 10; //Autoboxing takes place 10 -> Integer(10);
    }

    ArrayList<Integer> m3(){ // arraylist is the subclass of Object class
          return new ArrayList<>();
    }

//    double m4(){ not allowed
//          return 20;
//    }


}
