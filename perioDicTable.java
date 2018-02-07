import java.util.*;
public class perioDicTable
{
    String cheM[];
    int atomNo[];
    int length;
    perioDicTable(Scanner input){
        System.out.println("Please enter the number of elements - ");
        length = input.nextInt();
        cheM = new String[length];
        atomNo = new int[length];
    }
    void input(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < cheM.length; i++){
            System.out.println("Please enter the symbol for chemical " + (i+1));
            cheM[i] = input.nextLine();
            System.out.println("Please enter atomic number of " + cheM[i]);
            atomNo[i] = input.nextInt();
            input.nextLine();
        }
    }
    void sort(){
        for(int i = 0; i < cheM.length; i++){
            int large = i;
            for(int j = i+1; j < cheM.length; j++){
                if(atomNo[large] < atomNo[j]){
                    large = j;
                }
            }
            int tmp1 = atomNo[i];
            String tmp2 = cheM[i];
            atomNo[i] = atomNo[large];
            cheM[i] = cheM[large];
            atomNo[large] = tmp1;
            cheM[large] = tmp2;
        }
    }
    void display(){
        for(int i = 0; i < cheM.length; i++){
            System.out.print(cheM[i] + "\t");
        }
        System.out.println(" ");
        for(int i = 0; i < atomNo.length; i++){
            System.out.print(atomNo[i] + "\t");
        }
    }
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        perioDicTable pT = new perioDicTable(input);
        pT.input();
        pT.sort();
        pT.display();
    }
}
