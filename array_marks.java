import java.util.Scanner;
public class array_marks{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of marks - ");
        int n = in.nextInt();
        double[] marksArray = new double[n];
        for(int i = 0; i < marksArray.length; i++){
            System.out.print("Please enter the marks - ");
            marksArray[i] = in.nextDouble();
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("The marks entered are - ");        
        for(int i = 0; i < marksArray.length; i++){
            System.out.println(marksArray[i]);
            System.out.println(" ");
        }
        double totalMarks = 0;
        for(int i = 0; i < marksArray.length; i++){
            totalMarks += marksArray[i];
        }
        double averageMarks = totalMarks/(marksArray.length);
        System.out.println("The total marks are - " + totalMarks);
        System.out.println("The average marks are - " + averageMarks);
    }
}