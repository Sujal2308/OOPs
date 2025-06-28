package CRT25;
public class findLargest {
  public static void main(String[] args){
      int[] arr = {89,67,45,90,56,99};
      int max = findMax(arr);
      System.out.println("Max item is: "+max);
  }

  static int findMax(int[] arr){
      int max = Integer.MIN_VALUE;
      for(int i : arr){
          if(i>max){
              max = i;
          }
      }
      return max;
  }


}
