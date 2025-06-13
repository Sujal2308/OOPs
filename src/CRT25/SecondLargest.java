package CRT25;
public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {89,67,45,90,56,99};
        int secondMax = secondLargest(arr);
        System.out.println("Second largest: "+secondMax);
    }
    static int secondLargest(int[] arr){
        int secondMax = 0;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i>max){
                secondMax = max;
                max = i;
            }
            if(i>max && i<secondMax){
                secondMax = max;
            }
        }

        return secondMax;



    }
}
