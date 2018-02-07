import java.util.Scanner;
public class buzzgcd{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("1) BUZZ Number Checker");
        System.out.println("2) GCD Calculator");
        System.out.println("Please enter your choice – ");
        int menu = input.nextInt();
        if(menu == 1){
            boolean buzz = false;
            System.out.println("Please enter a number – ");
            int num = input.nextInt();
            if(num % 10 == 7) buzz = true;
            if(num % 7 == 0) buzz = true;
            if(buzz == true) System.out.println(num + " is a BUZZ number");
            else System.out.println(num + " is not a BUZZ number");
        }
        else if(menu == 2){
            System.out.println("Please enter a number – ");
            int a = input.nextInt();
            System.out.println("Please enter another number – ");
            int b = input.nextInt();
            int g, l;
            if(a > b){
                g = a; 
                l = b;
            }
            else{ 
                g = b; 
                l = a;
            }
            int t = 0; 
            while(g % l != 0){
                t = l;
                l = g%l;
                g = t;
            }
            System.out.println("The GCD is " + l);
        }
    }
}
