import java.util.*;
public class Matrix{
    int[][] arr;
    int m;
    int n;
    Matrix(int m, int n){

    }

    void fillarray(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print("ARRAY [" + i + "][" + j + "] - ");
                arr[i][j] = input.nextInt();
                System.out.println(" ");
            }
        }
    }

    Matrix SubMat(Matrix A){
        
        return A;
    }

    void display(){

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        Matrix m1 = new Matrix(m, n);
        Matrix m2 = new Matrix(m, n);
        m1.fillarray();
        m2.fillarray();
        m1.arr = m1.SubMat(m2);
        m1.display();
    }
}
