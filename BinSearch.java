import java.util.Scanner;
public class BinSearch{
    int arr[];
    int size;
    static boolean sT;
    BinSearch(int size){
        arr = new int[size];
        this.size = size;
        sT = false;
    }
    void input(Scanner input){
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
    }
    void binSearch(boolean sS){
        int low = 0;
        int high = arr.length;
        int m = high/2;
        for(int i = low; i < high; i++){
            
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size - ");
        int n = input.nextInt();
        BinSearch bS = new BinSearch(n);
        bS.input(input);
        System.out.println("Please enter the term to be searched - ");
        int se = input.nextInt();
        bS.binSearch(sT);
    }
}