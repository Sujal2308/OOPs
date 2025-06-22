package CRT25.OOPS.Encapsulation;

import java.util.ArrayList;


public class Book {

    //! POJO class - class having getter setter parametrized constructor
    // ! toString method and instance vaariable

    private int id;
    private String title;
    private String author;
    private int publishYear;
    static ArrayList<String> list = new ArrayList<>();


    //! setter method

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Book(int id , String title , String author , int publishYear){
         this.id = id;
         this.title = title;
         this.author = author;
         this.publishYear = publishYear;
         String bookData = "{ "+"id: "+id+" title: "+title+" author: "+author+" year:"+publishYear+" }";
         list.add(bookData);

     }

     //! getter function
    public int getId(){
         return this.id;
    }

    public  String getTitle(){
         return this.title;
    }

    public  String getAuthor(){
         return this.author;
    }

    public  int getPublishYear(){
         return this.publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    public static void getAllBooks(){
         System.out.println(list);
    }




}
