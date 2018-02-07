import java.util.Scanner;
public class firstofaugust2017
{
    public static void main() 
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Pls enter a no. - ");
        int n=a.nextInt();
        
        int sum = 0;
        int x=2;
        int count = 0;
        int i;
        boolean prime=true;
        for(; count<n ; x++){
            
            for(i = 2; i < x ; i++){
                if(x%i==0){
                    System.out.println(x + " is not prime!");
                    prime = false;
                    break;
                }
            }
            if(prime) {System.out.println(x + " is prime!"); 
                count = count+1;
                sum = sum + x;
                      }
            prime = true;   
        }
        System.out.print("The sum of the first " + n);
        System.out.print(" prime numbers is - " + sum);
    }
}  

