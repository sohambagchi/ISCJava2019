import java.util.*;
public class Extractor{
    static String str;
    static String extr;
    Extractor(){
        str = null;
        extr = "";
    }
    static String input(Scanner input){
        System.out.print("Please enter the name - "); str = input.nextLine();
        return str;
    }
    static String extractor(String inp, int start){
        String ext = "";
        for(int i = start; i < inp.length(); i++){
            ext += inp.charAt(i);
        }
        return ext;
    }
    static String extractor(String inp, int start, int end){
        String ext = "";
        for(int i = start; i < end; i++){
            ext += inp.charAt(i);
        }
        return ext;
    }
    void display(){
        System.out.println("String is - " + extr);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1) All chars from x");
        System.out.println("2) All chars between x and y");
        System.out.print("Please enter choice - "); int choice = input.nextInt();
        input.nextLine();
        Extractor exr = new Extractor();
        exr.input(input);
        if(choice == 1){
            System.out.print("Please enter starting number - "); int x = input.nextInt();
            extr = exr.extractor(str, x);
        }
        else if(choice == 2){
            System.out.print("Please enter starting number - "); int x = input.nextInt();
            System.out.print("Please enter ending number - "); int y = input.nextInt();
            extr = exr.extractor(str, x, y);
        }
        exr.display();
    }
}