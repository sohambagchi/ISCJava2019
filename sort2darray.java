import java.util.Scanner;
public class sort2darray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows - ");
        int m = input.nextInt();
        System.out.println(" ");
        System.out.print("Please enter number of columns - ");
        int n = input.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        int[][] sortArray = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Please enter Row " + i + " Column " + j);
                sortArray[i][j] = input.nextInt();
                System.out.println(" ");
            }            
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(sortArray[i][j] + " ") ;
            }
            System.out.println(" ");
        }
        //Initiate sort sequence
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int x = i; x < m; x++){
                    if(x == i){
                        for(int y = j + 1; y < n; y++){
                            if(sortArray[x][y] > sortArray[i][j]){
                                int temp = sortArray[x][y];
                                sortArray[x][y] = sortArray[i][j];
                                sortArray[i][j] = temp;}
                        }
                    }
                    else{
                         for(int y = 0; y < n; y++){
                            if(sortArray[x][y] > sortArray[i][j]){
                                int temp = sortArray[x][y];
                                sortArray[x][y] = sortArray[i][j];
                                sortArray[i][j] = temp;}    
                        }
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(sortArray[i][j] + " ");
            }
            System.out.println(" ");
        }                  
    }
}