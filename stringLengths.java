import java.util.*;
public class stringLengths{
    char[][] banner;
    String[] storage;
    Scanner input = new Scanner(System.in);
    stringLengths(){
        System.out.println("Please enter number of strings - ");
        int n = Input.inputInt();
        storage = new String[n];
        int longest = 1;
        for(int i = 0; i < storage.length; i++){
            System.out.print("Please enter String - "); storage[i] = input.nextLine();
            if(storage[i].length() > longest) longest = storage[i].length();
        }

        banner = new char[n][longest];
        for(int i = 0; i < storage.length; i++){
            for(int j = 0; j < storage[i].length(); j++){
                char temp = storage[i].charAt(j);
                banner[i][j] = Character.toUpperCase(temp);
            }
        }
    }

    void print(){
        for(int i = 0; i < banner[0].length; i++){
            for(int j = 0; j < banner.length; j++){
                System.out.print(banner[j][i] + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        stringLengths sL = new stringLengths();
        sL.print();
    }
}