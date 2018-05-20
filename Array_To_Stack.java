import java.util.*;
public class Array_To_Stack{
    int m[];
    int st[];
    int cap;
    int top;
    Array_To_Stack(int n){
        cap = n;
        top = -1;
        m = new int[cap];
        st = new int[cap];
    }

    void input_marks(){
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        m[++top] = temp;
        pushmarks(temp);
    }

    void pushmarks(int n){
        if(top < cap - 1){
            st[top] = n;
        }
        else System.out.println("Stack Overflow");
    }

    int popmarks(){
        if(top == -1) return -999;
        else return st[top--];
    }

    void display(){
        for(int i = 0; i < cap; i++){
            System.out.print(st[i] + "\t");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter cap size - ");
        int x = in.nextInt();
        Array_To_Stack aTs = new Array_To_Stack(x);
        int choice = -999;
        while(choice != 0){
            System.out.println("1) Input");
            System.out.println("2) Pop It");
            System.out.println("3) Show 'em all");
            System.out.println("State your choice - ");
            choice = in.nextInt();
            if(choice == 1) aTs.input_marks();
            else if(choice == 2) aTs.popmarks();
            else aTs.display();
        }
    }
}