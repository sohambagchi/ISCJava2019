import java.util.*;
public class insertionSort{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("array length - "); int n = input.nextInt();
        int[] array = new int[n];
        System.out.println(" ");
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(30) + 10;
            System.out.print(array[i] + "\t");
        }
        System.out.println(" ");

        /**for(int i = 1; i < array.length; i++){
        int temp = array[i];
        int k = i - 1;
        while(k > -1 && array[k] > temp){
        array[k+1] = array[k];
        k--;
        }
        array[k+1] = temp;
        }**/

        /**for(int i = 1; i < array.length; i++){
        int temp = array[i];
        int j = i - 1;
        while(j > -1 && array[j] > temp){
        array[j+1] = array[j];
        j--;
        }
        array[j + 1] = temp;
        }**/

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            for(int t = 0; t < array.length; t++){
                System.out.print(array[t] + "\t");
            }
            System.out.println(" ");
        }

        for(int t = 0; t < array.length; t++){
            System.out.print(array[t] + "\t");
        }
        System.out.println(" ");
    }
}