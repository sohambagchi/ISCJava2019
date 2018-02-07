import java.util.Scanner;
public class twod_array_sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows in an array");
        int m = input.nextInt();
        System.out.println("Please enter the number of columns in an array");
        int n = input.nextInt();
        int[][] d2array = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Please enter array cell value - ");
                d2array[i][j] = input.nextInt();
                System.out.println(" " );
            }
        }
        int[] rowSum = new int[m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                rowSum[i] += 
            }
        }
    }
}