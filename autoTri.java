import java.util.*;
public class autoTri{
    boolean auto;
    boolean tri;
    void automorphic(int n){
        auto = false;
        int x = n;
        int dig = 1;
        int div = 10;
        //To check number of digits
        while(x > 10){
            dig += 1;
            div = div*10;
            x = x/10;
        }
        int ld = n*n;
        int ck = ld % (div);
        if(ck == n) auto = true;
    }

    void trimorphic(int n){
        tri = false;
        int x = n;
        int dig = 1;
        int div = 10;
        //To check number of digits
        while(x > 10){
            dig += 1;
            div = div*10;
            x = x/10;
        }
        int ld = n*n*n;
        int ck = ld % (div);
        //To get last two digits of square;
        if(ck == n) {tri = true; System.out.println("TRI");}
    }

    void display(){
        if(tri == true) {
            System.out.println("NUMBER IS TRIMORPHIC");
            if(auto == true) System.out.println("NUMBER IS AUTOMORPHIC");
        }
        else System.out.println("NONE");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter the number you want to check - ");
        int nTc = input.nextInt();
        //int nTc = rand.nextInt(1000) + 1;
        //System.out.println(nTc);
        System.out.println(" ");
        autoTri aT = new autoTri();
        aT.automorphic(nTc);
        aT.trimorphic(nTc);
        aT.display();
    }
}