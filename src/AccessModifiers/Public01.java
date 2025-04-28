package AccessModifiers;

// public class : ClassName must be same as file name
 public class Public01 {
     public static int a = 100; // public variable independent of obj

     // public method
     public void getName(){
        System.out.println("Hello Sujal");
    }
    public String name; // public variable but obj-dependent
     int rollNo; // can't access outside the package

     // public constructor
     public Public01(int rollNo , String name){
         this.name = name;
         this.rollNo = rollNo;
     }
     public void greetMe(){
         System.out.println("Hello "+name);
     }
}
