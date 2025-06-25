package Collections.LinkedList01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args){
        //* Deletion op => TC : O(1)
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1,2,3,4,5,5,6));
        linkedList1.removeFirst();
//        linkedList1.remove(linkedList1.size()-1);
        linkedList1.removeLast();
        System.out.println(linkedList1);

        //! Random removal
        linkedList1.remove(2);



        //! Remove the common elements in both collection
        List<Integer> list = Arrays.asList(4,5,5);
        linkedList1.removeAll(list);
        System.out.println(linkedList1);

        //! Remove on basis of specific condition
        LinkedList<Integer> linkedList3 = new LinkedList<>(Arrays.asList(10,20,30,40,50,1,7));
        linkedList3.removeIf(x->x%2==0); //* remove those who are divisible by 2
        System.out.println(linkedList3); //op: [1,7]


    }
}
