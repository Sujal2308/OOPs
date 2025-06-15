package CRT25.OOPS.Interface;
public abstract class BMW  implements CAR{
    @Override
    public void run(){
        System.out.println("Car is running");
    }

    @Override
    public void startEngine(){
        System.out.println("Engine is started");
    }

//    public abstract void stopEngine();
}
