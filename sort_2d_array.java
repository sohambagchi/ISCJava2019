import java.util.*;
public class sort_2d_array{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        sort_2d_array s2a = new sort_2d_array();
        System.out.print("Please enter no. of rows - ");
        int m = input.nextInt(); System.out.println(" ");
        System.out.print("Please enter no. of columns - ");
        int n = input.nextInt(); System.out.println(" ");
        int[][] sortArray = new int[m][n];
        int[] tempArray = new int[m*n];
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray[0].length; j++){
                System.out.print("ARRAY [" + (i+1) + "][" + (j+1) + "] - ");
                sortArray[i][j] = input.nextInt();
                tempArray[i * n + j] = sortArray[i][j];
            }
        }
        System.out.println("Array:");
        arrayOut.outTwo(sortArray);
        tempArray = s2a.aSs(tempArray);
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray[0].length; j++){
                sortArray[i][j] = tempArray[i*n + j];
            }
        }
        System.out.println("Sorted Array:");
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray[0].length; j++){
                System.out.print(sortArray[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    int[] aSs(int[] sArray){
        for(int i = 0; i < sArray.length - 1; i++){
            int large = i;
            for(int j = i + 1; j < sArray.length; j++){
                if(sArray[large] > sArray[j]){
                    large = j;
                }
            }
            int temp = sArray[i];
            sArray[i] = sArray[large];
            sArray[large] = temp;
        }
        return sArray;
    }
}