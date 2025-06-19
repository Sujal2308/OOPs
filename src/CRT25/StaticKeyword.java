package CRT25;
public class StaticKeyword {

    static int i;
    static {
        System.out.println("Hello World"); //! Run first

    }
    public static void main(String[] args){
        System.out.println(StaticKeyword.i); //! run second

        System.out.println(i);// no need of class name since
        // it's present in same class but outside class we
        // have to specify classs name
    }

}
