package CRT25;

import Interfaces.Main;

public class AverageOfArray {
    public static void main(String[] args){
        int[] arr = {89,67,45,90,56,99};
        float average = avg(arr);
        System.out.println("Average: "+average);
    }
    static float avg(int[] arr){
        float sum = 0;
        float average;
        for(int i : arr){
            sum+=i;
        }
        average = sum/arr.length;
        return average;
    }
}
