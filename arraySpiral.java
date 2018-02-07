import java.util.Scanner;
public class arraySpiral{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = 'n';
        do{
            System.out.println("1) Descending Snake");
            System.out.println("2) Reverse Snake");
            System.out.println("3) Spiral Array");
            System.out.println("4) Ascending Snake");
            int menu = input.nextInt();
            System.out.print("Please enter Array Size - ");
            int m = input.nextInt();
            if(menu == 1){
                System.out.print("Please enter starting number - ");
                int x = input.nextInt();
                System.out.println(" ");
                int[][] snakeArray = new int[m][m];
                for(int i = 0; i < snakeArray.length; i++){
                    if(i%2 == 0){
                        for(int j = 0; j < snakeArray[0].length; j++){
                            snakeArray[i][j] = x;
                            x = x - 1;
                        }
                    }
                    else{
                        for(int j = snakeArray[0].length - 1; j >= 0; j--){
                            snakeArray[i][j] = x;
                            x = x - 1;
                        }
                    }
                }
                for(int i = 0; i < snakeArray.length; i++){
                    for(int j = 0; j < snakeArray[0].length; j++){
                        System.out.print(snakeArray[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
            else if(menu == 2){
                System.out.print("Please enter starting number - ");
                int x = input.nextInt();
                System.out.println(" ");
                int[][] snakeArray = new int[m][m];
                for(int i = 0; i < snakeArray.length; i++){
                    if(i%2 == 0){
                        for(int j = snakeArray[0].length - 1; j >= 0; j--){
                            snakeArray[i][j] = x;
                            x = x - 1;
                        }
                    }
                    else{
                        for(int j = 0; j < snakeArray[0].length; j++){
                            snakeArray[i][j] = x;
                            x = x - 1;
                        }
                    }
                }
                for(int i = 0; i < snakeArray.length; i++){
                    for(int j = 0; j < snakeArray[0].length; j++){
                        System.out.print(snakeArray[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
            else if(menu == 3){
                System.out.print("Please enter starting number - ");
                int x = input.nextInt();
                System.out.println(" ");
                int[][] snakeArray = new int[m][m];
                int i = m/2, j = m/2, count;
                for(int k = 0; k < snakeArray.length; k++){ //Counter variable per instance
                    count = 0; //Controls number of times do-while loop runs
                    do{
                        count = count + 1;//Controls number of times the addition or subtraction of position occurs
                        snakeArray[i][j] = x; 
                        if(k%2 == 0){//Even instances subtract position
                            j = j - 1;
                        }
                        else{//Odd instances add position
                            j = j + 1;
                        }
                        x = x + 1;
                    }while(count <= k);
                    count = 0;//Resets count variable for row manipulation
                    if(j < m){
                        if(j >= 0){
                            do{
                                count = count + 1;//Same function as previous
                                snakeArray[i][j] = x;
                                if(k%2 == 0){//Even instances subtract position
                                    i = i - 1;
                                }
                                else{//Odd instances add position
                                    i = i + 1;
                                }
                                x = x + 1;
                            }while(count <= k);
                        }
                    }
                }
                for(i = 0; i < snakeArray.length; i++){
                    for(j = 0; j < snakeArray[0].length; j++){
                        System.out.print(snakeArray[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
            else if(menu == 4){
                System.out.print("Please enter starting number - ");
                int x = input.nextInt();
                System.out.println(" ");
                int[][] snakeArray = new int[m][m];
                for(int i = 0; i < snakeArray.length; i++){
                    if(i%2 == 0){
                        for(int j = snakeArray[0].length - 1; j >= 0; j--){
                            snakeArray[i][j] = x;
                            x = x + 1;
                        }
                    }
                    else{
                        for(int j = 0; j < snakeArray[0].length; j++){
                            snakeArray[i][j] = x;
                            x = x + 1;
                        }
                    }
                }
                for(int i = 0; i < snakeArray.length; i++){
                    for(int j = 0; j < snakeArray[0].length; j++){
                        System.out.print(snakeArray[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
            System.out.print("Do you wish to continue - ");
            ch = input.next().charAt(0);
            System.out.println('\u000c');
        }while(ch == 'y' || ch == 'Y');
    }
}