package CRT25.OOPS.Abstraction;
public abstract class Vehicles {
    public int noOfWheels;
    boolean isElectric;
    String type;

    public abstract void getNoOfWheels(String name);

    Vehicles(int noOfWheels , boolean isElectric , String type){
        this.noOfWheels = noOfWheels;
        this.isElectric = isElectric;
        this.type = type;
    }
}
