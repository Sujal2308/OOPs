package NonAccessModifiers;

abstract class Person{
    String name;
    int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int rollNo;
    Student(String name , int age , int rollNo){
        super(name,age);
        this.rollNo = rollNo;
    }
}

 class Rahul extends Student {
    int salary;
    Rahul(String name , int age , int rollNo, int salary){
        super(name, age, rollNo);
        this.salary = salary;

    }
    public static void main(String[] args) {
        Rahul obj = new Rahul("Sujal" , 20 , 360,200000);
        System.out.println(obj.name);
        System.out.println(obj.hashCode());

    }
}
