import java.util.*;
public class ThisClassTestsClasses{
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        /**System.out.println("1) All chars from x");
        System.out.println("2) All chars between x and y");
        System.out.print("Please enter choice - "); int choice = Input.inputInt();
        System.out.println("Please enter text string - "); String str = Input.inputString();
        if(choice == 1){
            System.out.print("Please enter starting number - "); int x = Input.inputInt();
            System.out.println("Extracted text - " + Extractor.extractor(str, x));
        }
        else if(choice == 2){
            System.out.print("Please enter starting number - "); int x = Input.inputInt();
            System.out.print("Please enter ending number - "); int y = Input.inputInt();
            System.out.println("Extracted text - " + Extractor.extractor(str, x, y));
        }**/
        System.out.println("A RANDOM SENTENCE - " + RGen.randomSentence());
        System.out.println("AAAAND A RANDOM INTEGER - " + RGen.randomInt(100, 200));
        System.out.println("A LETTER - " + RGen.randomChar());
        System.out.println("AND A WORD - " + RGen.randomString());
        System.out.println("AND FINALLY, A DECIMAL - " + RGen.randomDouble());
    }
}
