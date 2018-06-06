import java.util.*;
public class PrintJob{
    int[] job;
    int Capacity;
    int Front;
    int Rear;
    int Newjob; 
    PrintJob(){
        Capacity = 20;
        Front = -1;
        Rear = -1;
        createJob();
    }

    void createJob(){
        job = new int[Capacity];
    }

    void addJob(){
        Scanner input = new Scanner(System.in);
        Newjob = input.nextInt();
        if(Rear == Capacity) System.out.println("Printjob is full, cannot add any more");
        else job[++Rear] = Newjob;
    }

    void removeJob(){
        if(Front == Rear) System.out.println("Printjob is empty");
        else Front++;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        PrintJob pJ = new PrintJob();
        do{
            System.out.println("1) Add a Job");
            System.out.println("2) Remove a Job");
            System.out.println("Please Enter Your Choice - ");
            choice = in.nextInt();
            if(choice == 1) pJ.addJob();
            else pJ.removeJob();
        }while(choice != 999);
    }
}