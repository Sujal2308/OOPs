package CRT25.OOPS.Interface;
public class Main {
    public static void main(String[] args){
        MyCar c = new MyCar();
        c.run();
        c.startEngine();
        c.stopEngine();

        BMW I1 = new MyCar(); //!Interface ref can hold
        I1.run();

        var a = "HELLO";
        System.out.println(a.getClass().getSimpleName());
    }
}
