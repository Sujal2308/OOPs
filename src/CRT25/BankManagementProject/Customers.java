package CRT25.BankManagementProject;

import java.util.HashMap;

public class Customers{
    String name;
    int age;
    long aadhar;
    public HashMap<String,Long> users = new HashMap<>();
    Customers(String name , int age , long Aadhar){
        this.name = name;
        this.age = age;
        this.aadhar = Aadhar;
        users.put(name,aadhar);
    }
    Customers(){

    }

      void userData(){
       System.out.println(users);
    }
}
