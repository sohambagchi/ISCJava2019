import java.util.Scanner;
public class hourglass{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array width - ");
        int m = input.nextInt();
        System.out.println(" ");
        System.out.print("Please enter array height - ");
        int n = input.nextInt();
        System.out.println(" ");
        int[][] hourglassArray = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.println("Please enter Row " + i + " Column " + j);
                hourglassArray[i][j] = input.nextInt();
                System.out.println(" ");
            }            
        }
    }
}