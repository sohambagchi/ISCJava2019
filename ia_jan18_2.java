import java.util.*;
public class ia_jan18_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum1 = input.nextDouble();
        double sum2 = input.nextDouble();
        
        System.out.println(series(sum1));
        System.out.println(series(sum1, sum2));
        
    }
    public static double series(double n){
        double sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + 1/i;
        }
        return sum;
    }
    public static double series(double a, double n){
        double sum = 0;
        double p = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2+3*i; j++){
                p = p*a;
            }
            sum = sum + 1/p;
        }
        return sum;
    }
}