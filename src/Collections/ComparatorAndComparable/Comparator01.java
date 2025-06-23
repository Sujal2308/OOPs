package Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

//! Comparator is used to perform custom ordering of objects
//! Comparator is an interface present in java.util package so you have to implement it and implements a compare() method
//! It consists of two methods compare() and equals()
//! There are two ways to implement custom ordering
//? 1) By implementing Comparator interface and overrides the compare method and write custom logic
//? 2) By directly passing lambda expression in sort fnc

//! NOTE: WE WRITE COMPARE() METHOD IN SEPERATE CLASS UNLIKE compareTo()

//* WAY-1 : IMPLEMENTS COMPARATOR AND GIVE TYPE OF OBJECT
//* ON WHICH YOU WANT TO PERFORM OP
class MyComparatorClass implements Comparator<Students>{
    public int compare(Students o1 , Students o2){
        return o2.getAge() - o1.getAge();
    }
}

public class Comparator01{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 2, 1, 5, 8);
        list.sort(null); //! sort list in natural order(ascending in case of int)
        System.out.println(list);

        //* WAY-2 LAMBDA EXPRESSION (CLEANER WAY)
        list.sort((a,b)->b-a);
        System.out.println(list);

        //? String list
        List<String> list1 = Arrays.asList("sujal", "shreya", "anil", "nita");
        //list.sort(null);  sort lexicographically (alphabetically)
        list1.sort((a,b)->b.length() - a.length());
        System.out.println(list1);

        ArrayList<Students> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Students("Sujal" , 20 , 10));
        listOfStudents.add(new Students("Vijay" , 23,25));
        listOfStudents.add(new Students("Om" , 17,5));
        listOfStudents.add(new Students("Aman" , 17,99));


        listOfStudents.sort(new MyComparatorClass().thenComparing((o1,o2)->o1.getName().compareTo(o2.getName())));
//        System.out.println(listOfStudents); //! INTERNALLY CALLING TOSTRING() IN STUDENT CLASS
        for(Students i : listOfStudents){
            System.out.println(i.getName()+ ": "+i.getAge());
        }
    }
}
