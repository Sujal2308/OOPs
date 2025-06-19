package CRT25;

import java.util.Arrays;

public class WrapperClasses {
    public static void main(String[] args){
        int[] i = new int[]{1,2,4};
        i = new int[]{2,3,4};
        System.out.println(Arrays.toString(i));

        Integer j = 10;
        System.out.println(Integer.valueOf(j));


    }
}
