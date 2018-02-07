import java.util.*;
public class ia_jan18_4{
    public void pattern1()
    {              
        int o = 3;
        for(int j = 1; j <= 5; j++){
            System.out.print("\t");
        }
        System.out.print("2");
        System.out.println(" ");
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j < 6 - 2*i; j++){
                System.out.print("\t");
            }
            for(int j = 2*i; j >= 1; j--){
                int m = j/2;
                System.out.println("J = " + j + "M = " + m + "I = " + i);
                if(j % 2 == 0){
                    System.out.print((o+i-1)*m*-1);
                    System.out.print("\t");
                }
                else{
                    System.out.print((o+i-1)*m);
                    System.out.print("\t");
                }
                
            }
            System.out.println(" ");
        }
    }

}