import java.util.*;
public class Marks{
    int students[][];
    String sName[];
    String subject[];
    double percent[];

    Marks(int m, int n){
        students = new int[m][n];
        sName = new String[m];
        subject = new String[n];
        percent = new double[m];
    }

    void input(Scanner input, Random rand){
        for(int i = 0; i < sName.length; i++){
            System.out.println("Please enter name of Student " + (i+1));
            sName[i] = input.nextLine();
        }
        for(int i = 0; i < subject.length; i++){
            System.out.println("Please enter subject " + (i+1));
            subject[i] = input.nextLine();
        }
        for(int i = 0; i < students[0].length; i++){
            for(int j = 0; j < students.length; j++){
                System.out.println("Please enter " + sName[i] + "'s marks in " + subject[j] + ": ");
                students[i][j] = rand.nextInt(100) + 1;
            }
        }
    }

    void calculate(){
        for(int i = 0; i < percent.length; i++){
            for(int j = 0; j < students.length; j++){
                percent[i] += students[i][j];
            }
            percent[i] = percent[i]/5;
        }        
    }

    void sort(){
        
    }
    
    void display(){
        for(int i = 0; i < percent.length; i++){
            System.out.println(sName[i] + "'s average percentage = " + percent.length);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter number of students - ");
        int stu = input.nextInt();
        System.out.println("Please enter number of subjects - ");
        int sub = input.nextInt();
        Marks mS = new Marks(stu, sub);
        mS.input(input, rand);

    }
}