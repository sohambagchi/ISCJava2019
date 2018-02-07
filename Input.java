import java.util.Scanner;
public class Input{
    public static Scanner input = new Scanner(System.in);
    public static int inputInt(){
        return input.nextInt();
    }
    public static String inputString(){
        input.nextLine();
        return input.nextLine();
    }
    public static double inputDouble(){
        return input.nextDouble();
    }
    public static char inputChar(){
        input.nextLine();
        return input.next().charAt(0);
    }
}