package CRT25;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args){
        int[] arr = {89,67,45,90,56,99};
        reverse(arr);
    }

    static void reverse(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        System.out.println("reverse:"+Arrays.toString(arr));
    }
}
