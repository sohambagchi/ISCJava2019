import java.util.Scanner;
public class ia_jan18_1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        char in = input.next().charAt(0);
        String st1 = getIn();
        String st2 = getIn();
        num_calc(n1, in);
        num_calc(n1, n2, in);
        num_calc(st1, st2);
    }
    
    public static void num_calc(int a, char ch){
        if(ch == 's') System.out.println(a*a);
        else System.out.println(a*a*a);
    }
    
    public static void num_calc(int a, int b, char ch){
        if(ch == 'p') System.out.println(a*b);
        else System.out.println(a+b);
    }
    
    public static void num_calc(String s1, String s2){
        if(s1.equals(s2)) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
    }
    
    public static String getIn(){
        Scanner strings = new Scanner(System.in);
        return strings.nextLine();
    }
}