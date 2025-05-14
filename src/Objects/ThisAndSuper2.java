package Objects;
/*
        super() and this() are the constructor calls
        super() -> calls parent class constructor depending upon arguments
        we pass
        this() -> calls current class constructor

        what constructor getting called is depend upon what arguments we
        are passing due to overloading concept
 */

public class ThisAndSuper2 {
    public static void main(String[] args) {
        Human sujal = new Human("HomoSapien",2,10_00_000,false);
        System.out.println(sujal.type+" "+sujal.isMarried);

        Human anil = new Human();
        System.out.println(anil.type);
    }

}
class Animal{
    String type;
    int NoOfLegs;

    Animal(String type , int NoOfLegs){
        this.type = type;
        this.NoOfLegs = NoOfLegs;
    }
}

class Human extends Animal{
    int salary;
    boolean isMarried;
    int age;
    String name;

    Human(String type,int NoOfLegs , int salary , boolean isMarried){
        super(type,NoOfLegs); // calling parent constructor with 2 args of specified type
        this.salary = salary;
        this.isMarried = isMarried;
    }

    Human(){
        this("homo",0,0,false);
    }
}
