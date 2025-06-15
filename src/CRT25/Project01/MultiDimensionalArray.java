package CRT25.Project01;

public class MultiDimensionalArray {
    public static void main(String[] args){
        //! 2d array
        int[][] arr = {
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };

        int[][][] arr3d = {
                {
                        {1,2,3},
                        {3,4,5}
                },
                {
                        {6,7,8},
                        {9,10,11}
                }
        };
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i[][] : arr3d){
            for(int j[] : i){
                for(int k : j){
                    System.out.print(k);
                }
            }
        }

    }
}
