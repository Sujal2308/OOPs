package Interfaces;

public class Main extends C1 {
    @Override
    public void makeSound(){
        System.out.println("Hmmmmmmm....");
    }
    public static void main(String[] args) {
        Main newObj = new Main();
        newObj.displayMessage();
        System.out.println(interface01.age);
        interface01 I1; // interface is also a datatype as classes but can't create object
        newObj.makeSound();

        // Creating School obj
        School S1 = new School();
        System.out.println(S1.colorOfWall("Beige"));
        System.out.println(S1.noOfRooms(200));
    }
}
