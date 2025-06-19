package miscellaneous;
public class SingeltonClass {

    private static  SingeltonClass instance;

    public static SingeltonClass getInstance(){
        if(instance == null){
            instance  = new SingeltonClass();
        }
        return instance;
    }
}
