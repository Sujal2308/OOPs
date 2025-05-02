package PolyMorphism;

public class MethodOverloading03 {
    // If the argument got matched with the two classes references
    // with no relation(parent-child) then compiler will face
    // ambiguity with method to resolve and throws Error
    public static void main(String[] args) {
        MethodOverloading03 MO3 = new MethodOverloading03();
        MO3.m3("Sujal");
        MO3.m3(new StringBuffer("Anil"));
//        MO3.m3(null); reference to m3 is ambiguous
    }
    void m3(String s){
        System.out.println("String type");
    }
    void m3(StringBuffer s){
        System.out.println("StringBuffer type");
    }
}
