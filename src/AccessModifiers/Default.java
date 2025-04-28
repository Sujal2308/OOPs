package AccessModifiers;

// default class - when no modifiers are explicitly attached
// ClassName can be anything no restrictions
// access within the package only
class Default01{
    static int a = 100;

    int getSum(int num1, int num2){
        return num1+num2;
    }

    String name;
    int age;
    Default01(String name , int age){
        this.name = name;
        this.age = age;
    }


}
