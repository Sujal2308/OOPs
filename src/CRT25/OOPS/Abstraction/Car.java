package CRT25.OOPS.Abstraction;
public class Car extends Vehicles {

    String color;
    @Override
    public void getNoOfWheels(String name){
        System.out.println("Vehicle is: "+name);
    }
    Car(int noOfWheels , boolean isElectric , String type , String color){
        super(noOfWheels , isElectric , type);
        this.color = color;
    }
    public static void main(String[] args){
        Vehicles C = new Car(4,true,"Car","Black");
        C.getNoOfWheels("Car");
        System.out.println(C.getClass().getName());
    }
}
