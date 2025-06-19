package miscellaneous;
public class CopyContructor {
    int age;
    String name;

    CopyContructor(String name , int age){
        this.name = name;
        this.age = age;
    }

    //! copy constructor
    CopyContructor(CopyContructor c){
        this.age = c.age;
        this.name = c.name;
    }
}
