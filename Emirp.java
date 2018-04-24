import java.util.*;
public class Emirp{
    int n;
    int rev;
    int f;
    Emirp(int nn){
        n = nn;
        rev = 0; 
        f = 2;
    }
    int isprime(int x){
        int factors = 0;
        int j = 1;
        while(j<=1){
            if(x%j == 0){
                factors++;
            }
            j++;
        }
        int flag = 0;
        if(factors == 2){
            flag = 1;
        }
        return flag;
    }
    void isEmirp(){
        while(
    }
}