package CRT25.Project2;

import java.util.Scanner;

public class Users extends Thread{
    private int id;
    private String name;
    @Override
            public void run(){
        Scanner sc = new Scanner("System.in");
        int tickets = sc.nextInt();
    }

    Users(int id , String name){
        this.id = id;
        this.name = name;
        Thread t = new Thread();
    }

}
