import java.util.*;
public class Matrix{
    int[][] arr;
    int m;
    int n;
    Matrix(int mm, int nn){
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    void fillArray(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = RGen.randomInt(100, 1);
                System.out.println("ARRAY [" + i + "][" + j + "] - " + arr[i][j]);
            }
        }
    }

    Matrix SubMat(Matrix A){
        Matrix B = new Matrix(m, n);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                B.arr[i][j] = A.arr[i][j] - this.arr[i][j];
            }
        }
        return B;
    }

    void display(){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size - ");
        int x, y;
        do{
            x = input.nextInt();
            y = input.nextInt();
        }while(x > 25 && y > 25);
        Matrix P = new Matrix(x, y);
        Matrix Q = new Matrix(x, y);
        Matrix R = new Matrix(x, y);
        P.fillArray();
        Q.fillArray();
        R = P.SubMat(Q);
        R.display();
    }
}