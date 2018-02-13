import java.util.*;
public class array_sort{
    public static int[][] input(int[][] arr){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt(); 
        int[][] array = new int[m][n];
        array = array_sort.input(array);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                for(int k = 0; k < array[0].length - j - 1; k++){
                    if(array[i][k] > array[i][k+1]){
                        int temp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temp;
                    }
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + "\t");

            }
            System.out.println(" ");
        }
    }
}