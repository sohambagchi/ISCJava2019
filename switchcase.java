import java.util.Scanner;
class switchcase{
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);
        char a = imp.next().charAt(0); 
        

        switch(a){
            case '8': System.out.println("x=8");
            break;
            case '5': System.out.println("x=5");   
            break;
            case '4': System.out.println("x=4");
            break;
            default: System.out.println("out of range");
            break;
        }

    }}