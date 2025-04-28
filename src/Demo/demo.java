package Demo;
//import AccessModifiers.*; you can do but not recommended
import AccessModifiers.Public01;
import AccessModifiers.ACM02;
import AccessModifiers.Protected01;

public class demo extends Protected01 {
    public static void main(String[] args) {
        Public01 obj = new Public01(20,"sujal");
        obj.getName();
        System.out.println(obj.name);
        obj.greetMe();
//        ACM02 obj2 = new ACM02();
//        obj2.greet(); // public method
        System.out.println(Public01.a); // public variable

        System.out.println(demo.age); // accessing protected field outside the package

    }
}


