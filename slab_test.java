import java.util.Scanner;

class slab_test{
    public static void main(String[] args){
        System.out.println("Welcome to Soham's Electricity Bill Calculator");
        System.out.println("Billing is done as follows");
        System.out.println("0-100 Units: Rs. 3/unit");
        System.out.println("100-200 Units: Rs. 4/unit");
        System.out.println(">200 Units: Rs. 5/unit");
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number of units consumed - ");
        int units=inp.nextInt();
        int x;
        int y;
        int price = 0;
        if (units>=200)    price=100*3 + 100*4 + (units-200)*5;
        else if(units<200) price = 100*3 + (units-100)*4;
        else if(units<100) price = units*3;
        System.out.println("Your electricity bill is Rs." + price);
    }
}