package CRT25;

import java.util.Arrays;

public class ARRAYS {
    public static void main(String[] args){

        int[] nums2 = {5,6,1,2,5,1};
        int[] nums3 = Arrays.copyOf(nums2,nums2.length);
        Arrays.sort(nums2);

        int count = 0;
        for(int i = 0; i<nums2.length-1 ; i++){
            if(nums2[i]==nums2[i+1]){
                    count++;
            }
        }
        int len = nums2.length-count;
        System.out.println(len);
        int[] newArr = new int[len];
        int k = 0;
        for(int i : nums3){
            boolean check = ifPresent(newArr ,i);
            if(!check){
                newArr[k] = i;
                k++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }

    static boolean ifPresent(int[]arr,int i){
        for(int j = 0 ; j<arr.length ; j++){
            if(arr[j]==i){
                return true;
            }
        }
        return false;
    }


}
