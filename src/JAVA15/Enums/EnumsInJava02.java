package JAVA15.Enums;

public class EnumsInJava02 {
    // we can happily declare enums inside a class
    public enum Months{
        JAN,FEB,MAR,APR,MAY,JUN
    }

    public static void main(String[] args) {
        Months JAN = Months.JAN;
        System.out.println(JAN);


        enum DAY{ // Local enum : accessible within the method scope only
            SUNDAY,MONDAY,TUESDAY;
        }
        Day Sunday = Day.SUNDAY;
    }
}
