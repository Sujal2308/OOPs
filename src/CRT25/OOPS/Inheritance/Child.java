package CRT25.OOPS.Inheritance;
public class Child extends Parent{
    String name;
    int age;
    Child(String name , int age , int assets ,String residency){
        super(assets,residency);
        this.name = name;
        this.age = age;
    }

}
