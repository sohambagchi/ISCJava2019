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
        
    }
    void pushmarks(int n){
        if(top < cap - 1){
            st[++top] = n;
        }
        System.out.println("Stack Overflow");
    }
}