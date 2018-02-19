import java.util.*;
public class stringFrequency{
    //Write a program to calculate the frequency of a string in another string
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the parent string - ");
        String parent = input.nextLine();
        System.out.println("Please enter the child string - ");
        String child = input.nextLine();
        int frequency = 0;
        for(int i = 0; i < parent.length(); i++){
            boolean s1 = true;
            if(parent.charAt(i) == child.charAt(0)){
                for(int j = 0; j < child.length(); j++){
                    if(parent.charAt(i+j) == child.charAt(j)) s1 = true;
                    else{
                        s1 = false;
                        break;
                    }
                }
                if(s1) frequency += 1;
            }

        }

        System.out.println("Frequency of '" + child + "' in '" + parent + "' is " + frequency);
    }
}