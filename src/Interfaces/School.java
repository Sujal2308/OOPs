package Interfaces;

public class School implements InfrastructureInterFace,BuildingInterFace{
// a class can implements 1 or more interfaces at a time
    @Override
    public int noOfRooms(int rooms) {
        return rooms;
    }

    @Override
    public boolean stairs() {
        return true;
    }

    @Override
    public String colorOfWall(String color){
        return color;
    }
}
