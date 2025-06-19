package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {
    int rollNo;
    Child(int age ,String name , int rollNo){
        super(age,name);
        this.rollNo = rollNo;

    }

    static void callMe(){

    }

    public static void main(String[] args){

        //down casting


        //upcasting
        Parent p = new Child(10,"Sujal",109);


        //down casting
        Child C = (Child) p;
        System.out.println(C.age);

        System.out.println(sum(10,20,30));
        System.out.println(generateRandom(10,20));




    }

    static  int sum(int ...a){
        int add = 0;
        for(int i :a ){
            add+=i;
        }
        return add;
    }



    static int generateRandom(int low,int high){
        return (int) Math.floor(Math.random()*(high-low))+low;
    }

}
