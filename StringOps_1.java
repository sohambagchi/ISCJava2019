import java.util.*;
public class StringOps_1{
    String s1;
    String s2;
    char[] s1c;
    char[] s2c;
    StringOps_1(Scanner input){
        s1 = input.nextLine();
        s2 = input.nextLine();
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
    }

    void compareTheArrays(){
        char rM = '^';
        for(int i = 0; i < Math.max(s1c.length, s2c.length); i++){
            for(int j = 0; j < Math.max(s1c.length, s2c.length); j++){
                if(s1c[i] == s2c[j]){
                    rM = s1c[i];
                }
            }
            for(int k = 0; k < Math.max(s1c.length, s2c.length); k++){
                if(s1c[k] == rM){
                    s1c[k] = '0';
                }
                if(s2c[k] == rM){
                    s2c[k] = '0';
                }
            }
        }
        for(int i = 0; i < Math.max(s1c.length, s2c.length); i++){
            if(s1c[i] == '0'){
                char temp = s1c[i];
                s1c[i] = s1c[i+1];
                s1c[i+1] = temp;
            }
            if(s2c[i] == '0'){
                char temp = s2c[i];
                s2c[i] = s2c[i+1];
                s2c[i+1] = temp;
            }
        }
    }
    
    void printTheStrings(){
        s1 = String.valueOf(s1c);
        s2 = String.valueOf(s2c);
        System.out.println(s1c);
        System.out.println(s2c);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringOps_1 sO = new StringOps_1(input);
        sO.compareTheArrays();
        sO.printTheStrings();
    }
}