import java.util.*;
public class Encode{
    String str;
    Encode(){
        str = null;
    }
    void input(Scanner input){
        str = input.nextLine();
    }
    void encode(){
        char[] cd = str.toCharArray();
        char temp = cd[cd.length - 1];
        for(int i = cd.length - 1; i > 0; i--){
            cd[i] = cd[i - 1];
        }
        cd[0] = temp;
        for(int i = 0; i < cd.length; i++){
            if(cd[i] == 'a') cd[i] = 'z';
            else if(cd[i] == 'A') cd[i] = 'Z';
            else cd[i] -= 1;
        }
        str = new String(cd);
    }
    void decode(){
        char[] cd = str.toCharArray();
        char temp = cd[cd.length - 1];
        for(int i = cd.length - 1; i > 0; i--){
            cd[i] = cd[i - 1];
        }
        cd[0] = temp;
        for(int i = 0; i < cd.length; i++){
            if(cd[i] == 'a') cd[i] = 'z';
            else if(cd[i] == 'A') cd[i] = 'Z';
            else cd[i] -= 1;
        }
        str = new String(cd);
    }
    void display(){
        System.out.println("Encoded String - " + str);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Encode enc = new Encode();
        enc.input(input);
        enc.encode();
        enc.display();        
    }
}