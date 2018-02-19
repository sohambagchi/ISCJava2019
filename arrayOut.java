public class arrayOut{
    public static void outOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }
    public static void outTwo(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}