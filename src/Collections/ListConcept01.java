package Collections;
import java.util.*;

//! List is an interface
//! 3 classes implements List - ArrayList , Vector and LinkedList
//! Properties of List - insertion order is preserved, duplicates allowed, elements are stored indexwise

public class ListConcept01 {
    public static void main(String[] args){
        Integer[] arr = {1,3,4,56};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);


        Collections.addAll(list,2,3,4,5,6);
        System.out.println(list);
//        List arr = Arrays.asList(list);
//        System.out.println(arr);
        list.set(2,3); //! set is used to replace item at 2nd index with 3
        list.add(2,3); //! used to add element 3 at 2nd index and each element from 2 gets shifted one place after
//        list.removeAll(list); //? remove entire itemsz

        for(int i : list){
            System.out.println(i);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            it.next();
        }


        //? we know that interface can hold the object of its implemented class
//        List<Object> newList = List.of(arr);
//        System.out.println(newList);
    }

}
