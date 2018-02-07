import java.util.*;
public class ThisClassTestsClasses{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1) All chars from x");
        System.out.println("2) All chars between x and y");
        System.out.print("Please enter choice - "); int choice = input.nextInt();
        input.nextLine();
        System.out.println("Please enter text string - "); String str = input.nextLine();
        if(choice == 1){
            System.out.print("Please enter starting number - "); int x = input.nextInt();
            System.out.println("Extracted text - " + Extractor.extractor(str, x));
        }
        else if(choice == 2){
            System.out.print("Please enter starting number - "); int x = input.nextInt();
            System.out.print("Please enter ending number - "); int y = input.nextInt();
            System.out.println("Extracted text - " + Extractor.extractor(str, x, y));
        }
    }
}
