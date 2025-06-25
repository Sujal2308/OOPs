package Collections.ArrayList01;
import  java.util.*;
public class ArrayList02 {
    public static void main(String[] args){

        ArrayList<Integer> list2 = new ArrayList<>();
        List<Integer> unModifiableList2 = List.of(1, 2, 3, 4, 5);
        //! ADD operation 01 (1 item at a time)
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2); //? We can directly print list as it calls toString() internally

        //! ADD operation 02 (ADD whole collection in an existing list)
        list2.addAll(unModifiableList2); //? addALL takes any Collection as an argument
        System.out.println(list2);

        //! Remove operation (by index)
        list2.remove(0);
        System.out.println(list2);

        //! Remove (by value -  value must be an object not primitive);
//        list2.remove(new Integer(30)); or
        list2.remove(Integer.valueOf(30));
        System.out.println(list2);

        //! Remove all items once
//        list2.removeAll(list2); removes all items result in empty list
        list2.removeAll(unModifiableList2); // only removes specified list items
        System.out.println(list2);

        //! ADD Items in between list - Expensive operation because new item
        //! is added + all items from given index will be shifted on place after
        //! Here size() get increased by one
        ArrayList<Integer> newList01 = new ArrayList<>();
        newList01.addAll(unModifiableList2);
        System.out.println(newList01);
        newList01.add(1,100);
        System.out.println(newList01);

        //! SET OP (replaces current item with new item) - size remains same
        newList01.set(1,200);
        System.out.println(newList01);

        //! SORT OP (List itself doesn't have inbuild method but the
        //!Collection (parent) interface has some static helper methods for all collections classes)
        Collections.sort(newList01);

        //! Trim OP:
        newList01.trimToSize(); //? trim the capacity to actual size


        //! Custom increasing capacity
        newList01.ensureCapacity(5);
        //* when no of items exceeds the initial capacity (10)
        //* the new capacity increases by (old capacity + 5)
    }
}
