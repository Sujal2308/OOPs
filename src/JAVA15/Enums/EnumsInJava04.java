package JAVA15.Enums;

public class EnumsInJava04 {
    public static void main(String[] args) {

        //! Note we can't explicitly create an object of enum
        //? Enums can't be extended since they are implicitly
        //? declared as final
        //* All Enums are the direct childs of java.lang.Enums
        //*class which itself direct child of OG Object Class
        //  Company c = new COMPANY();
        Company AMAZON = Company.AMAZON;
        System.out.println(AMAZON.turnOver);
        System.out.println(Company.FLIPKART.getTurnOver());
        System.out.println(Company.MERCEDES.turnOver);
    }
}


