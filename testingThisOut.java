import java.util.*;
public class testingThisOut{
    int a;
    int b;
    testingThisOut(){
        a = 4;
        b = 1;
    }
    void assign(int a){
        int c = a-3;
        this.a = a;
        b = c*10;
    }
    void display(){
        System.out.println("A - " + a);
        System.out.println("T.A - " + this.a);
        System.out.println("B - " + b);
    }
    public static void main(String[] args){
        testingThisOut ttO = new testingThisOut();
        ttO.assign(42);
        ttO.display();
    }
}