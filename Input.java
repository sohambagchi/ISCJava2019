import java.util.Scanner;
public class Input{
    public static Scanner input = new Scanner(System.in);
    public static int inputInt(){
        return input.nextInt();
    }
    public static String inputString(){
        input.nextLine();
        return input.nextLine();
    }
    public static double inputDouble(){
        return input.nextDouble();
    }
    public static char inputChar(){
        input.nextLine();
        return input.next().charAt(0);
    }
    public static int[] inputArrayOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int[][] inputArrayTwo(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}