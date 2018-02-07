import java.util.Scanner;
public class arrayOperations{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Array Input and Display
        System.out.println("Please enter square array size - ");
        int m = input.nextInt();
        int[][] opArray1 = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.println("Please enter Row " + i + " Column " + j);
                opArray1[i][j] = input.nextInt();
                System.out.println(" ");
            }            
        }
        int[][] opArray2 = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.println("Please enter Row " + i + " Column " + j);
                opArray2[i][j] = input.nextInt();
                System.out.println(" ");
            }            
        }

        System.out.println("Array 1:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(opArray1[i][j] + " ") ;
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Array 2:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(opArray2[i][j] + " ") ;
            }
            System.out.println(" ");
        }        
        System.out.println(" ");
        System.out.println("1) Add the arrays");
        System.out.println("2) Subtract the arrays");
        System.out.println("3) Multiply the arrays");
        int menu = input.nextInt();
        if(menu == 1){
            int[][] addArray = new int[m][m];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    addArray[i][j] = opArray1[i][j] + opArray2[i][j];
                    System.out.print(addArray[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        else if(menu == 2){
            int[][] subArray = new int[m][m];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    subArray[i][j] = opArray1[i][j] + opArray2[i][j];
                    System.out.print(subArray[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        else if(menu == 3){
            int[][] mulArray = new int[m][m];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    for(int k = 0; k < m; k++){
                        mulArray[i][j] += opArray1[i][k] * opArray2[k][i];
                    }
                    System.out.print(mulArray[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
