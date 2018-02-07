import java.util.Scanner;
public class FruitJuice{
    int product_code;
    int product_price;
    int pack_size;
    String flavour;
    String pack_type;
    FruitJuice(){
        product_code = 0;
        product_price = 0;
        pack_size = 0;
        flavour = "";
        pack_type = "";
    }
    void input(Scanner input){
        System.out.println("Please Enter The Product Code - ");
        product_code = input.nextInt();
        System.out.println("Please Enter The Product Price - ");
        product_price = input.nextInt();
        System.out.println("Please Enter The Pack Size - ");
        int pack_size = input.nextInt();
        this.pack_size = pack_size;
        input.nextLine();
        System.out.println("Please Enter The Flavour - ");
        flavour = input.nextLine();
        System.out.println("Please Enter The Pack Type - ");
        pack_type = input.nextLine();
    }
    void discount(){
        product_price = product_price - (product_price*10/100);
    }
    void display(){
        System.out.println("Product Code - " + product_code);
        System.out.println("Product Price - " + product_price);
        System.out.println("Pack Size - " + pack_size);
        System.out.println("Flavour - " + flavour);
        System.out.println("Pack Type - " + pack_type);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FruitJuice fJ = new FruitJuice();
        fJ.input(input);
        fJ.discount();
        fJ.display();       
    }
}
