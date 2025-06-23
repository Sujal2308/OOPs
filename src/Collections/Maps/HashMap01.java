package Collections.Maps;

import java.nio.file.Path;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class HashMap01 {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"pqr");
        map.put(3,"xyz");
        System.out.println(map.get(3));
        System.out.println(map);

        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                file.createNewFile();
                System.out.println("File created.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        try{
//            FileWriter fw = new FileWriter("example.txt");
//            fw.write("Hello world");
//            fw.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        //! Reading
        try {
            File file2 = new File("example.txt");
            FileReader fr = new FileReader(file2);
            int i = 0;
            while(i!=-1){
                i=fr.read();
                System.out.print((char)i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        createFile();
    }

    static void createFile(){
        File fl = new File("D:\\JavaIO/demo.txt");
        if(fl.exists()){
            System.out.println("File is already existed");
        }else{
            try{
                fl.createNewFile();
                System.out.println("file is created successfully");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    }

