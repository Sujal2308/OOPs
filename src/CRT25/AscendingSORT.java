package CRT25;

import java.util.Arrays;
import java.util.Collections;

public class AscendingSORT {
    public static void main(String[] args){
        int[] arr = {89,67,45,90,56,99};
        sorting(arr);
        ReverseOfArray.reverse(arr);

    }
    static void sorting(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1 ; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Ascending sort"+Arrays.toString(arr));
    }
}
