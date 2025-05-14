package Objects;
/*
       When we have same instance members in parent and child classes
       then to refer parent instance member -> super.ref
       To refer current class instance member -> this.ref

       this -> refers to current class object
       super -> refers to parent class object

       Note: Super and this keywords always used to refer instance
       variable so these keywords strictly can't be used in static area
       like static {} , static method
 */

public class ThisAndSuper {
    String name = "sujal";

    void greet(String name){
        System.out.println("Hello"+name);
    }

    public static void main(String[] args) {
        child C = new child();
        C.m1();
        C.m2();
        C.greet("anil");
        C.callMe();
    }
}

class child extends ThisAndSuper{
    String name = "yash";
    void m1(){
        System.out.println("Hello "+super.name); // sujal
    }
    void m2(){
        System.out.println(this.name); // yash
    }

//    static void m3(){
//        System.out.println(this.name); Compiler error
//    }

    void greet(String name){
        super.greet(name); // calling parent method
    }

    void callMe(){
        this.greet("no-name"); // calling child method greet(String name)
    }
}