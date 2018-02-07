import java.util.Scanner;
public class fibonacc_pyramid{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int x = 0;
        int y = 1;
        int z = 0;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++)System.out.print(" ");
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print((x+y) + " ");
                
                y = x + y;
            }
        }
    }
}