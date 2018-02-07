import java.util.*;
public class ia_jan18_3{
    void polygon(int n, char ch)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
    void polygon(int x, int y)
    {
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
    void polygon()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Square");
        System.out.println("2) Rectangle");
        System.out.println("3) Triangle");
        int choice = input.nextInt();
        ia_jan18_3 iA = new ia_jan18_3();
        if(choice == 1)
        {
            System.out.println("Please enter square size - ");
            int s = input.nextInt();
            input.nextLine();
            System.out.println("Please enter output character - ");
            char o = input.next().charAt(0);
            iA.polygon(s, o);
        }
        else if (choice == 2)
        {
            System.out.println("Please enter length - ");
            int a = input.nextInt();
            System.out.println("Please enter width - ");
            int b = input.nextInt();
            iA.polygon(a, b);
        }
        else if (choice == 3)
        {
            iA.polygon();
        }
    }
}