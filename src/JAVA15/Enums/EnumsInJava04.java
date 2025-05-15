package JAVA15.Enums;

public class EnumsInJava04 {
    public static void main(String[] args) {

        // Note we can't explicitly create an object of enum
//        Company c = new COMPANY();
        Company AMAZON = Company.AMAZON;
        System.out.println(AMAZON.turnOver);
        System.out.println(Company.FLIPKART.getTurnOver());
        System.out.println(Company.MERCEDES.turnOver);
    }
}
