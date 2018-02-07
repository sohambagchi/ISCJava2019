import java.util.*;
public class Marksbak
{
    int students[][];
    String sName[];
    String subject[];
    double percent[];

    Marksbak(int m, int n)
    {
        students = new int[m][n];
        sName = new String[m];
        subject = new String[n];
        percent = new double[m];
    }

    void input(Scanner input, Random rand)
    {
        input.nextLine();
        for(int i = 0; i < sName.length; i++)
        {
            System.out.print("Please enter name of Student " + (i+1) + ": ");
            sName[i] = randomName();
            System.out.println(sName[i]);
        }
        for(int i = 0; i < subject.length; i++)
        {
            System.out.print("Please enter subject " + (i+1) + ": ");
            subject[i] = randomName();
            System.out.println(subject[i]);
        }
        for(int i = 0; i < sName.length; i++)
        {
            for(int j = 0; j < subject.length; j++)
            {
                System.out.print("Please enter " + sName[i] + "'s marks in " + subject[j] + ": ");
                students[i][j] = rand.nextInt(100) + 1;
                System.out.println(students[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    void calculate()
    {
        for(int i = 0; i < percent.length; i++)
        {
            for(int j = 0; j < subject.length; j++)
            {
                percent[i] = percent[i] + students[i][j];
            }
            percent[i] /= subject.length;
        }
        System.out.print("S. \t Name \t");
        for(int i = 0; i < subject.length; i++){
            System.out.print(subject[i] + "\t");
        }
        System.out.println("Percentage");
        for(int i = 0; i < percent.length; i++)
        {
            System.out.print((i+1) + "\t" + sName[i] + "\t");
            for(int j = 0; j < students[0].length; j++){
                System.out.print(students[i][j] + "\t");
            }
            System.out.println(percent[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    void sort()
    {
        for(int i = 0; i < percent.length - 1; i++)
        {
            int large = i;
            for(int j = i + 1; j < percent.length; j++)
            {
                if(percent[large] < percent[j]) large = j;
            }
            double tmpP = percent[i];
            String tmpN = sName[i];
            percent[i] = percent[large];
            sName[i] = sName[large];
            percent[large] = tmpP;
            sName[large] = tmpN;
        }
    }

    void display()
    {
        System.out.println("Sorted Percentage by Rank");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("S. \t Name \t Average Percentage");
        for(int i = 0; i < percent.length; i++){
            System.out.println(i + "\t" + sName[i] + "\t" + percent[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    String randomName()
    {
        Random randS = new Random();
        int wordLength = randS.nextInt(6) + 1;
        char worD[] = new char[wordLength];
        for(int j = 0; j < wordLength; j++){
            int tmp = randS.nextInt(25) + 65;
            char tMp = (char)tmp;
            worD[j] = tMp;
        }
        String str = String.valueOf(worD);
        return str;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter number of students - ");
        int stu = input.nextInt();
        System.out.println("Please enter number of subjects - ");
        int sub = input.nextInt();
        Marksbak mS = new Marksbak(stu, sub);
        mS.input(input, rand);
        mS.calculate();
        mS.sort();
        mS.display();
    }
}
