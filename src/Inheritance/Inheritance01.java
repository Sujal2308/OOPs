package Inheritance;
class Parent{
    int age;
    String name;
    Parent(int age, String name){
      this.age = age;
      this.name = name;
    }

    static void callMe(){
        System.out.println("I'm parent");
    }
}

