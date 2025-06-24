package Collections.Maps;

import java.util.*;

class sortByName implements Comparator<Books>{
    public int compare(Books b1 , Books b2){
        return  b1.getAuthor().length() - b2.getAuthor().length();
    }
}

public class Main {
    public static void main(String[] args){
        Books b1 = new Books(1,"James Clear");
        Books b2 = new Books(2,"Nomad");
        Books b3 = new Books(3,"arther");

        sortByName sm = new sortByName();
        TreeMap<Books,Integer> bookMap = new TreeMap<>(sm);
        bookMap.put(b1,1);
        bookMap.put(b2,3);
        bookMap.put(b3,2);
        System.out.println(bookMap);


    }
}
