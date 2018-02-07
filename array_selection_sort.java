import java.util.*;
public class array_selection_sort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter number of terms - ");
        int n = in.nextInt();
        int[] sortArray = new int[n];
        for(int i = 0; i < sortArray.length; i++){
            System.out.print("Please enter number - ");
            sortArray[i] = in.nextInt();
        }
        System.out.println(" ");
        System.out.println("Your array is - ");
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + "\t");
        }
        System.out.println(" ");
        System.out.println(" ");
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
        System.out.println("Your sorted array is - ");
        for(int k = 0; k < sortArray.length; k++){
            System.out.print(sortArray[k] + "\t");
        }
    }
}