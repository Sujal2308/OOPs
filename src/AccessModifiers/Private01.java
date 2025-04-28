package AccessModifiers;

// top level class can never be private
public class Private01 {
    private static int salary;
    static {
        salary = 20_00_000;
    }
    String name;
    int age;
    Private01(String name , int age){
        this.name =name;
        this.age = age;
    }

    private void getPromotion(){
        System.out.println("You are promoted");
    }

    public static void main(String[] args) {
        System.out.println(Private01.salary);
        Private01 newObj = new Private01("Sujal",20);
        newObj.getPromotion(); // private method
    }
}
