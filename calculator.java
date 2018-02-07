import java.util.Scanner;

public class calculator{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();

        double c = a/b;
        double x = a%b;
        System.out.println("This - " + c);
        System.out.println(x);
        double y = x%b;
        double z = c/b;
        System.out.println(z);
        System.out.println(y);
    }
}