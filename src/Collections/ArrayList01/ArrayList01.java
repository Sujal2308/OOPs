package Collections.ArrayList01;
import java.util.*;
public class ArrayList01 {
    public static void main(String[] args){
        //? Creating ArrayList (TYPE UNSAFE - can hold any data irrespective of type)
        ArrayList list1 = new ArrayList();

        //? Creating ArrayList (TYPE SAFE - can hold only similar data)
        ArrayList<Integer> list2 = new ArrayList<>();
        //System.out.println(list2.getClass().getName());

        //? Method -2
        List<String> list3 = new ArrayList<>();

        //* On the go Arrays.asList() -> returns an unmodifiable list not an ArrayList
        //* We can't add or remove items but can replace one
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
        // System.out.println(list4.getClass().getSimpleName());
        //list4.add(10);
        list4.set(0,10);
        System.out.println(list4);

        //* Method - 3 List.of(items) : Also unmodifiable but set() operation is even not allowed
        List<Integer> unModifiableList2 = List.of(1, 2, 3, 4, 5);
//        unModifiableList2.set(0,100);
        System.out.println(unModifiableList2);
    }
}
