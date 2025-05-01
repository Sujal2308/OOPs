package NonAccessModifiers;

 abstract class Vehicle {
     //Static fields
     static boolean isRechargable = false;


//     static abstract void sound(); static + abstract = illegal comb
    public abstract void sound(); // abstract method

     //Non static fields
    String type;
    int NumberOfWheels;
    Vehicle(String type , int NumberOfWheels){
         this.type = type;
         this.NumberOfWheels = NumberOfWheels;
    }

//     public static void main(String[] args) {
//         System.out.println(Vehicle.isRechargable);
//
//     }
}
class Car extends Vehicle{
     String brand;
    public void sound(){
         System.out.println("Brum Brum.....");
     }
     Car(String type , int NumberOfWheels , String brand){
         super(type,NumberOfWheels);
         this.brand = brand;
     }

    public static void main(String[] args) {
        System.out.println(Vehicle.isRechargable);// can access static members of abstract directly no obj creation req.
        Car C1 = new Car("CAR",4,"Honda");
        System.out.println(C1.brand);
        System.out.println(C1.type);
        C1.sound();

        Vehicle.isRechargable = true; //reinitialize static field since its not final
    }
}
