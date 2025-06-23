package Collections.ComparatorAndComparable;

//! Comparable is the interface present in java.lang package
//! It contains single abstract method compareTo();
//! It is used to give natural ordering
//! compareTo() is implemented in class itself
public class Comparable01 implements Comparable<Comparable01> {
   String name;
   int id;
   int age;

    public Comparable01(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Comparable01 i){
        return this.id - i.id;
    }


}
