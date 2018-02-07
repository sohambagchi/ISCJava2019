import java.util.Scanner;
public class Input{
    Scanner input = new Scanner(System.in);
    int inputi(){
        return input.nextInt();
    }
    String inputS(){
        return input.nextLine();
    }
    double inputd(){
        return input.nextDouble();
    }
}