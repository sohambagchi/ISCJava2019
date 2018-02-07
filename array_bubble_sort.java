import java.util.Scanner;
public class array_bubble_sort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of terms - ");
        int n = in.nextInt();
        int[] sortArray = new int[n];
        for(int i = 0; i < sortArray.length; i++){
            System.out.print("Please enter number - ");
            sortArray[i] = in.nextInt();
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Your array is - ");
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + "; ");
        }
        System.out.println(" ");
        for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray.length - i - 1; j++){
                if(sortArray[j] > sortArray[j+1]){
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = temp;
                    /**for(int k = 0; k < sortArray.length; k++){
                    System.out.print(sortArray[k] + "; ");
                    }**/
                }
            }
        }
        for(int k = 0; k < sortArray.length; k++){
            System.out.print(sortArray[k] + "; ");
        }
    }
}