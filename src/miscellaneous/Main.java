package miscellaneous;
public class Main {

    public static void main(String[] args){
        CopyContructor c1 = new CopyContructor("sujal",20);

        //? Here we are passing obj1 values to obj2 both ref pointing to diff objects
        CopyContructor c2 = new CopyContructor(c1);
        System.out.println(c2==c1); //! false since 2 objects are there
        System.out.println(c2.equals(c1)); //!false since instance variables of diff obj are unequal


        //? passing reference object is still same just 2ref pointing same
        CopyContructor c3 = c2;
        System.out.println(c3==c2);//! true
        System.out.println(c3.equals(c2));//!true

        //! singleton class instantiation
        SingeltonClass SC1 = SingeltonClass.getInstance();
        SingeltonClass SC2 = SingeltonClass.getInstance();
        System.out.println(SC2==SC1);

//        SingeltonClass SC2 = new SingeltonClass();
//        System.out.println(SC2.hashCode());
    }

    }
