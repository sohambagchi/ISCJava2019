import java.util.*;
public class GOcab{
    String cab_no;
    int km;
    int amount;
    String cab_type;
    GOcab(Scanner input){
        cab_no = input.nextLine();
        km = input.nextInt();
        input.nextLine();
        cab_type = input.nextLine();
    }
    void calculate(){
        int d = 0;
        amount = 0;
        if(cab_type == "Sedan") {
            if(km > 4) {
                d = km - 4;
                amount = amount + 100;
                amount = amount + d*17;
            }
            else amount = 100;
        }
        else{
            if(km > 4){
                d = km - 4;
                amount = amount + 150;
                amount = amount + d*22;
            }
            else amount = 150;
        }
    }
    void display(){
        System.out.println("Price is " + amount);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GOcab gC = new GOcab(input);
        gC.calculate();
        gC.display();
    }
}