import java.util.*;
public class alphabetFrequency{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any statement - ");
        String parent = input.nextLine(); System.out.println(" ");
        parent = parent.toLowerCase();
        System.out.println("Output:");
        System.out.println("=============================");
        System.out.println("Alphabet\tFrequency");
        System.out.println("=============================");
        for(char i = 'a'; i < 'z'; i++){
            int count = 0;
            for(int j = 0; j < parent.length(); j++){
                if(i == parent.charAt(j)) count++;
            }
            if(count != 0) System.out.println(i + "\t\t" + count);
        }
    }
}