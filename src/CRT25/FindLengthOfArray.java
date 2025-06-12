package CRT25;
public class FindLengthOfArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Length :"+len(arr));

    }
    static int len(int[] arr){
        int count = 0;
        boolean b = true;
        while(b)
            try{
                int val = arr[count];
                count++;

            }catch (Exception e){
                System.out.println(e);
                b=false;
            }

        return count;
    }
}
