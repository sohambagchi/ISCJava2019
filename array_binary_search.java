import java.util.*;
public class array_binary_search{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array - ");
        int m = input.nextInt(); System.out.println(" ");
        int[] array = new int[m];
        for(int i = 0; i < array.length; i++){
            System.out.print("ARRAY [" + (i+1) + "] - ");
            array[i] = input.nextInt();
        }
        array_binary_search aBs = new array_binary_search();
        System.out.println("Your Array is: ");
        aBs.output(array);
        array = aBs.sort(array);
        System.out.println("Your sorted array is: ");
        aBs.output(array);
        System.out.println(" ");
        System.out.print("Please enter the number to search for - ");
        int s = input.nextInt(); System.out.println(" ");
        boolean sS = aBs.search(array, s);
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
        int low = 0;
        int high = arra.length;
        while(low <= high){
            int m = (low + high)/2;
            if(arra[m] < term) low = m + 1;
            else if(arra[m] == term) {
                return true; 
            }
            else high = m - 1;
        }
        return false;
    }
}
