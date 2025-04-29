package NonAccessModifiers;

public abstract class Abstract {
    public void callMe(){ // concrete method
        System.out.println("Hello World");
    }
    public abstract void getSalary(); // abstract method
    public abstract int getAge();
}
class subclass02 extends Abstract {
    int salary;
    int age;
     subclass02(int salary, int age){
        this.salary = salary;
        this.age = age;
    }
    @Override
    public void getSalary(){
        System.out.println("Hello World");
    }
    @Override
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        subclass02 obj = new subclass02(200000,20);
        obj.getSalary();
        System.out.println(obj.getAge());
    }
}
