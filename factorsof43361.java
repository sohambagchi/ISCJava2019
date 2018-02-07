import java.util.Scanner;
public class factorsof43361{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1;
        double x2;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        double y = b*b - 4*a*c;
        double d = Math.sqrt(y);
        x1 = (b + d)/(2*a);
        x2 = (b - d)/(2*a);
        
        System.out.println(x1 + " as well as " + x2);
        }
}