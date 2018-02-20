import java.util.Scanner;
public class array_bubble_sort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        array_bubble_sort Abs = new array_bubble_sort();
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
            System.out.print(sortArray[i] + "\t");
        }
        System.out.println(" ");
        sortArray = Abs.aBs(sortArray);
        System.out.println("Your sorted array is - ");
        for(int k = 0; k < sortArray.length; k++){
            System.out.print(sortArray[k] + "\t");
        }
    }

    public static int[] aBs(int[] sArray){
        for(int i = 0; i < sArray.length; i++){
            for(int j = 0; j < sArray.length - i - 1; j++){
                if(sArray[j] > sArray[j+1]){
                    int temp = sArray[j];
                    sArray[j] = sArray[j+1];
                    sArray[j+1] = temp;
                }
            }
        }
        return sArray;
    }
}