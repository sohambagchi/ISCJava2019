import java.util.Scanner;
public class methodArray{
    public static void main(String[] args){
        int i;
        String s;
        
    }

    public static int getIn(int i){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String getIn(String s){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}