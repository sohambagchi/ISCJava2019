import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        for(int i = 0; i < a.length; i++){
            int a1 = 0;
            int a2 = 0;
            for(int j = 0; j < i; j++){
                 a1 += a[j];               
            }
            for(int j = i+1; j < a.length; j++){
                a2 += a[j];
            }
            if(a1 == a2) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
