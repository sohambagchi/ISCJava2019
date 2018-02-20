import java.util.*;
public class commonCharacters{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first string - ");
        String s1 = input.nextLine();
        System.out.println("Please enter second string - ");
        String s2 = input.nextLine();
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        System.out.println("Common Characters are - ");
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2.length; j++){
                if(a1[i] == a2[j] && a1[i] != ' '){
                    char t = a1[i];
                    System.out.print(t + "\t");
                    for(int k = 0; k < a1.length; k++){
                        if(a1[k] == t) a1[k] = ' ';
                    }
                    for(int k = 0; k < a2.length; k++){
                        if(a2[k] == t) a2[k] = ' ';
                    }
                }
            }
        }
    }
}