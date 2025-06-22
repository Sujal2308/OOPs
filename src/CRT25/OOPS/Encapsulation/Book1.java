package CRT25.OOPS.Encapsulation;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Book1 {
    public static void main(String[] args){
        Book b1 = new Book(1,"Atomic Habits","James Clear",2005);
        System.out.println(b1.getId());
        b1.setAuthor("SUJAL");
        System.out.println(b1.toString());

        Book b2 = new Book(2,"Deep Work","Martin luther",2001);

        Book.getAllBooks();
    }
}
