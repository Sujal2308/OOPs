package Multithreading;
public class Multithreading01 extends Thread{

    public void run(){
        for(int i = 0 ; i<20; i++){

        }
    }
    public static void main(String[] args){
        Multithreading01 t = new Multithreading01();

        for(int i = 0 ; i<3 ; i++){
            t.start();
         //  System.out.println(i);
        }

    }
}
