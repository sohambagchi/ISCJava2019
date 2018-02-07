import java.util.Scanner;
public class array_2d_sort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number of rows - ");
        int m = in.nextInt(); //Enter number of rows
        System.out.println(" ");
        System.out.print("Please enter number of columns - ");
        int n = in.nextInt();
        System.out.println(" ");
        int[][] sortArray = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("ROW " + i + " COLUMN " + j + " - ");
                sortArray[i][j] = in.nextInt();
                System.out.println(" ");
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(sortArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < m - 1; i++){
            for(int j = 0; j < n; j++){                                             
                int lr = i;
                int lc = j;
                for(int x = i + 1; x < m; x++){
                    for(int y = j; y < n; y++){
                        if(sortArray[lr][lc] < sortArray[x][y]){
                            lr = x;
                            lc = y;
                        }
                    }
                }
                int temp = sortArray[i][j];
                sortArray[i][j] = sortArray[lr][lc];
                sortArray[lr][lc] = temp;
                System.out.println(". ");
                for(int p = 0; p < m; p++){
                    for(int q = 0; q < n; q++){
                        System.out.print(sortArray[p][q] + " ");
                    }
                    System.out.println(" ");
                }
            }
        }
        System.out.println(" ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(sortArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}