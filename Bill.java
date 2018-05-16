import java.util.*;
class Detail{
    String name;
    String address;
    long telno;
    int rent;
    Detail(String s1, String s2, long l1, int i1){
        name = s1;
        address = s2;
        telno = l1;
        rent = i1;
    }

    void show(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Tel. No: " + telno);
        System.out.println("Rent: " + rent);
    }
}
public class Bill extends Detail{
    int n;
    double amt;
    Bill(String s1, String s2, long l1, int i1){
        super(s1, s2, l1, i1);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Calls - ");
        n = in.nextInt();
        amt = 0.0;
    }

    void cal(){
        if(n > 0 && n < 101) amt = rent;
        else if(n < 201) amt = n*0.6 + rent;
        else if(n < 301) amt = n*0.8 + rent;
        else amt = n + rent;
    }

    void show(){
        super.show();
        System.out.println("Total Calls: " + n);
        System.out.println("Total Amount: " + amt);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name - ");
        String na = input.nextLine();
        System.out.println("Enter Address - ");
        String ad = input.nextLine();
        System.out.println("Enter Telephone Number - ");
        long te = input.nextLong();
        System.out.println("Enter Monthly Rent - ");
        int re = input.nextInt();
        Bill B = new Bill(na, ad, te, re);
        B.cal();
        B.show();
    }
}