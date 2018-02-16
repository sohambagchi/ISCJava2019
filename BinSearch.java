import java.util.Scanner;
public class BinSearch{
    static int arr[];
    int size;
    static boolean sT;
    BinSearch(int size){
        arr = new int[size];
        this.size = size;
        sT = false;
    }

    void input(Scanner input){
        for(int i = 0; i < size; i++){
            arr[i] = RGen.randomInt(50, 1);
        }
    }

    void output(int[] arrAy){
        for(int i = 0; i < arrAy.length; i++) System.out.print(arrAy[i] + "\t");
        System.out.println(" ");
    }

    void binSearch(int term, int[] arra){
        int low = 0;
        int high = arra.length;
        while(low <= high){
            int m = (low + high)/2;
            if(arra[m] > term) low = m + 1;
            else if(arra[m] > term) high = m - 1;
            else sT = true; break;
        }
    }

    void sortArray(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size - ");
        int n = input.nextInt();
        BinSearch bS = new BinSearch(n);
        bS.input(input);
        bS.output(arr);
        bS.sortArray(arr);
        bS.output(arr);
        System.out.println("Please enter the term to be searched - ");
        int se = input.nextInt();
        bS.binSearch(se, arr);
        System.out.println(sT);
        if(sT) System.out.println("Search term " + se + " found!");
        else System.out.println("Search term not found");
    }
}
