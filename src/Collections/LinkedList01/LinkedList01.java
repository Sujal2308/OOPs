package Collections.LinkedList01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    //! LinkedList is a linear data structure
    //! LinkedList consists of nodes and each node contains 2 fields
    //! one is actual data (object) and other one is the address to next node
    //! LinkedList is a great choice if you want to perform
    //! add and delete op nearly taking O(1)
    //! But not great for accessing data : O(n)

    public static void main(String[] args){

        //? Creation of linked-list;
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList);

        //? Add nodes/ items in LL one by one
        linkedList.add(1); //! T.C => O(1)
        linkedList.add(2);
        linkedList.add(10);
        linkedList.add(1);

        //? Add items all at once;
        //? pass list of item in constructor of LL
        List<Integer> list1 = Arrays.asList(1,2,3,10);
        List<Integer> linkedList2 = new LinkedList<>(list1);
//        List<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1,2,3,10));

        //? Add whole list/collection in linkedlist
        linkedList.addAll(linkedList2);
        System.out.println(linkedList);

        //? Add items at first And Last

        linkedList.addFirst(100);
        linkedList.addLast(200);

        System.out.println(linkedList);


        System.out.println(linkedList2);


    }
}
