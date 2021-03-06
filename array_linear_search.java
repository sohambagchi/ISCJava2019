import java.util.*;
public class array_linear_search{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array - ");
        int m = input.nextInt(); System.out.println(" ");
        int[] array = new int[m];
        for(int i = 0; i < array.length; i++){
            System.out.print("ARRAY [" + (i+1) + "] - ");
            array[i] = input.nextInt();
        }
        array_linear_search aLs = new array_linear_search();
        System.out.println("Your Array is: ");
        aLs.output(array);
        array = aLs.sort(array);
        System.out.println("Your sorted array is: ");
        aLs.output(array);
        System.out.println(" ");
        System.out.print("Please enter the number to search for - ");
        int s = input.nextInt(); System.out.println(" ");
        boolean sS = aLs.search(array, s);
        if(sS) System.out.println("Search successful, " + s + " is found.");
        else System.out.println("Search failed");
    }

    void output(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    int[] sort(int[] sortArray){
        for(int i = 0; i < sortArray.length - 1; i++){
            int large = i;
            for(int j = i + 1; j < sortArray.length; j++){
                if(sortArray[large] > sortArray[j]){
                    large = j;
                }
            }
            int temp = sortArray[i];
            sortArray[i] = sortArray[large];
            sortArray[large] = temp;
        }
        return sortArray;
    }

    boolean search(int[] arra, int term){
        for(int i = 0; i < arra.length; i++){
            if(arra[i] == term) return true;
        }
        return false;
    }
}
