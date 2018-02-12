import java.util.*;
public class array_row_sort{
    public static int[][] input(int[][] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.println("ARRAY [" + (i+1) + "][" + (j+1) + "] - "); array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static int[][] sort(int[][] array){
        for(int k = 0; k < array.length; k++){
            for(int i = 0; i < array[0].length - 1; i++){
                int large = i;
                for(int j = i + 1; j < array[0].length; j++){
                    if(array[k][large] > array[k][j]){
                        large = j;
                    }
                }
                int temp = array[k][i];
                array[k][i] = array[k][large];
                array[k][large] = temp;
            }
        }
        return array;
    }

    public static void printArr(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter no. of rows - "); int m = in.nextInt();
        System.out.println("Please enter no. of columns - "); int n = in.nextInt();
        int[][] arr = new int[m][n];
        arr = array_row_sort.input(arr);
        System.out.println("Your array is - ");
        array_row_sort.printArr(arr);
        arr = array_row_sort.sort(arr);
        System.out.println("Your sorted array is - ");
        array_row_sort.printArr(arr);
    }
}