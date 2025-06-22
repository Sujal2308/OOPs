package Collections;
import java.util.Comparator;

public class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        // TODO Auto-generated method stub
        int i = o1.getName().compareTo(o2.getName());

        return i;
    }

}