import java.util.*;
public class sort_2d_array{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no. of rows - ");
        int m = input.nextInt(); System.out.println(" ");
        System.out.print("Please enter no. of columns - ");
        int n = input.nextInt(); System.out.println(" ");
        int[][] sortArray = new int[m][n];
        int[] tempArray = new int[m*n];
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray[0].length; j++){
                System.out.print("ARRAY [" + (i+1) + "][" + (j+1) + "] - ");
                sortArray[i][j] = RGen.randomInt(100,10);
                tempArray[i * n + j] = sortArray[i][j];
            }
        }
        System.out.println("Array:");
        arrayOut.outTwo(sortArray);
        tempArray = array_selection_sort.aSs(tempArray);
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray[0].length; j++){
                sortArray[i][j] = tempArray[i*n + j];
            }
        }
        System.out.println("Sorted Array:");
        arrayOut.outTwo(sortArray);
    }
}