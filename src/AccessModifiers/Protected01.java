package AccessModifiers;

class childClass{
    static int rollNo = 101;
    void callMe(){
        System.out.println("Hi Joe Goldberg");
    }
}

public class Protected01 extends childClass {
    protected static int age = 100;

    public static void main(String[] args) {
        Protected01 obj = new Protected01();
        obj.callMe();
        System.out.println(Protected01.rollNo);
    }
}
