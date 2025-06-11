package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcept01 {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        Object[] arr = {"hello" , 10 , true, 'b'};
        List<Object> newList = List.of(arr);
        System.out.println(newList);
    }

}
