package AccessModifiers;

public class ACM02 {
    int a;
    String name;
    public static void main(String[] args) {
//        Public01 obj = new Public01();
//        obj.getName();
//        System.out.println(Public01.a);
//        Default01 defaultObj = new Default01("Sujal" , 20);
//        System.out.println(defaultObj.name); // default field
//        System.out.println(Default01.a); // default static field
//        int summation = defaultObj.getSum(10,20); // default method
//        System.out.println(summation);

        Private01 privateObj = new Private01("Sujal" , 20);
        System.out.println(privateObj.age);
//        System.out.println(Private01.salary); can't access since its private
    }
}
