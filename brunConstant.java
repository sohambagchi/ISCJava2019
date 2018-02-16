import java.util.*;
public class brunConstant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the limit - ");
        int x = input.nextInt(); System.out.println(" ");
        brunConstant bC = new brunConstant();
        double brun = 0.0;
        System.out.println("TWIN PRIMES");
        System.out.println("===========");
        for(int i = 2; i < x; i++){
            if(bC.checkPrime(i) && bC.checkPrime(i+2) && (i+2) <= x){
                double a = 1.0/i;
                double b = 1.0/(i+2);
                brun = brun + a + b;
                System.out.println(i + " " + (i+2));
            }
        }
        System.out.println("Brun Constant = " + brun);
    }
    
    boolean checkPrime(int prime){
        for(int j = 2; j < (prime); j++){
            if(prime % j == 0) return false;
        }
        return true;
    }
}