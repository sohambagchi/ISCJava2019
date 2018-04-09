import java.util.*;
public class Matrix{
    int[][] arr;
    int m;
    int n;
<<<<<<< HEAD
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
=======
    Matrix(int m, int n){

    }

    void fillarray(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print("ARRAY [" + i + "][" + j + "] - ");
                arr[i][j] = input.nextInt();
                System.out.println(" ");
>>>>>>> 3298cfd16ec2faabaf06655c5b87b02a8d67dbcc
            }
        }
    }

    Matrix SubMat(Matrix A){
<<<<<<< HEAD
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
=======
        
        return A;
    }

    void display(){

>>>>>>> 3298cfd16ec2faabaf06655c5b87b02a8d67dbcc
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
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
=======
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
>>>>>>> 3298cfd16ec2faabaf06655c5b87b02a8d67dbcc
