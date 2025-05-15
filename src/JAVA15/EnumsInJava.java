package JAVA15;

import java.util.Arrays;

public class EnumsInJava {
    private static final int a = 100;
    public static void main(String[] args) {
        // ctrl+alt+v = declare variable

        // Here all the constants are the instances of Day
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        System.out.println(Arrays.toString(Day.values())); // return array of DAYS
        System.out.println(Day.TUESDAY.ordinal()); // return index value

        System.out.println(monday.hashCode()+" "+sunday.hashCode());

        System.out.println(EnumsInJava.a);

    }

}
