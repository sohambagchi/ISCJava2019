import java.util.Scanner;
public class Patterns
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("This prints a alternate symbol triangle");
        int a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else 
            {
                for(int k=1;k<=i;k++)
                {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}