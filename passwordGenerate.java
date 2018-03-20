import java.util.*;
import java.lang.*;
public class passwordGenerate{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String fname = " ";
        String mname = " ";
        String lname = " ";
        int age = input.nextInt();
        String ag = String.valueOf(age);
        int a = name.indexOf(" ");
        int b = name.lastIndexOf(" ");
        int c = name.length();
        fname = name.substring(0,a);
        int fl = fname.length();
        mname = name.substring(a+1,b);
        int ml = mname.length();
        lname = name.substring(b+1,c);
        int ll = lname.length();
        System.out.println(lname.charAt(0) + lname.charAt(ll) + ag.charAt(0) + fname.charAt(0) + fname.charAt(fl) + ag.charAt(1) + mname.charAt(0) + mname.charAt(ml));
    }
}