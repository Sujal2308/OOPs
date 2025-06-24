package Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Comparable01> list = new ArrayList<>();
        list.add(new Comparable01("sujal",1,20));
        list.add(new Comparable01("aman",3,21));
        list.add(new Comparable01("chinmay",2,17));
        for(Comparable01 obj : list){
            System.out.println(obj.getName()+": "+obj.getId());
        }

        System.out.println("======================================");

        // * either list.sort(null); or
        Collections.sort(list); //! internally calling compareTo();
        for(Comparable01 obj : list){
            System.out.println(obj.getName()+": "+obj.getId());
        }

    }
}
