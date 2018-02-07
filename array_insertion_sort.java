import java.util.*;
public class array_insertion_sort{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array length - "); int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            System.out.print("Please enter number - ");
            array[i] = input.nextInt();
        }
        System.out.println(" ");
        System.out.println("Your array is - ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println(" ");
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println("Sorted array - ");
        for(int t = 0; t < array.length; t++){
            System.out.print(array[t] + "\t");
        }
        System.out.println(" ");
    }
}