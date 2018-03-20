import java.util.*;
public class arrayRandomize{
    public static void main(String[] args){
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = RGen.randomInt(100, 1);
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
        for(int i = 0; i < arr.length; i++){
            int index = rand.nextInt(arr.length) + 1;
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}