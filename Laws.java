import java.util.*;
public class Laws{
    static double u, v, S, a, t;
    Laws(){
        u = 0;
        v = 0;
        S = 0;
        a = 0;
        t = 0;
    }

    double time(double v, double u, double a, Scanner input){
        System.out.println(" ");
        System.out.print("Please enter initial velocity - "); u = input.nextDouble();
        System.out.print("Please enter final velocity - "); v = input.nextDouble();
        System.out.print("Please enter acceleration - "); a = input.nextDouble();
        t = (v - u)/a;
        return t;
    }

    double acceleration(double v, double u, double S, Scanner input){
        System.out.println(" ");
        System.out.print("Please enter initial velocity - "); u = input.nextDouble();
        System.out.print("Please enter final velocity - "); v = input.nextDouble();
        System.out.print("Please enter displacement - "); S = input.nextDouble();
        double u2 = u*u;
        double v2 = v*v;
        a = (v2 - u2) / (2*S);
        return a;
    }

    double displacement(double u, double a, double t, Scanner input){
        System.out.println(" ");
        System.out.print("Please enter initial velocity - "); u = input.nextDouble();
        System.out.print("Please enter acceleration - "); a = input.nextDouble();
        System.out.print("Please enter time - "); t = input.nextDouble();
        double t2 = t*t;
        S = (u*t) - ((a*t2)/2);
        return S;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1) Calculate time");
        System.out.println("2) Calculate acceleration");
        System.out.println("3) Calculate displacement");
        System.out.print("What's your choice - "); int c = input.nextInt();
        Laws ls = new Laws();
        if(c == 1) System.out.println("Time is " + ls.time(v, u, a, input));
        else if(c == 2) System.out.println("Acceleration is " + ls.acceleration(v, u, S, input));
        else if(c == 3) System.out.println("Displacement is " + ls.displacement(u, a, t, input));
    }
}