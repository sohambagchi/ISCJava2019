import java.util.*;
class Meter{
    long meternum;
    String name;
    double mcharge;
    long prRead;
    Meter(long m, double ch, long p){
        meternum = m;
        mcharge = ch;
        prRead = p;
        readname();
    }

    void readname(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
    }
}
public class ElectricityBill extends Meter{
    long crRead;
    double rate;
    long units;
    double amt;
    ElectricityBill(long c, long mn, double mc, long pr){
        super(mn, mc, pr);
        crRead = c;
        units = crRead - super.prRead;
        amt = 0.0;
        rate = 3.50;
    }
    double calculations(){
        double a = rate * units;
        return a;
    }
    void dispBill(){
        System.out.println("Meter \t Name \t Rental \t Previous \t Current \t Rate \t Total \t Bill");
        System.out.println("Number \t \t Charge \t Reading \t Reading \t Per Unit \t Units \t Amount");
        System.out.println(super.meternum +"\t"+ super.name +"\t"+ super.prRead +"\t"+ crRead +"\t"+ rate +"\t"+ units +"\t"+ amt);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Current Reading - ");
        long cread = input.nextLong();
        System.out.println("Please Enter Previous Reading - ");
        long pread = input.nextLong();
        
    }
}