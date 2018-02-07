import java.util.Scanner;
public class input_sum{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number - ");
        int user = input.nextInt();
        int a = user;
        int b = 1;
        int c = 0;

        do{b=a%10;
            a=a/10;
            c = (10*c) + b;
        }while(a!=0);
        
        System.out.println("Reverse digits is " + c);
    }
}