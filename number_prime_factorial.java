import java.util.Scanner;
public class number_prime_factorial{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        //To calculate factorial
        int prime = 2;
        int numer = 1;
        int z=2;
        double q;
        boolean primecond = true;
        int j = 2;
        int fact = 1;
        double g = 0;
        for(int c = 1; c<=in; c++){
            j = j+1;
            fact = 1;
            for(int i = j; z<i; z++){
                if(i%z == 0){primecond = true;
                    break;}
                
                
                    }
                if(primecond == true) System.out.print(" ");
                else{
                
                }
            q = c/fact;
            g = g + q;
        }
        System.out.println(g);
    }
}