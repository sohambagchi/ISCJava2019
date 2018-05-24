import java.util.*;
public class Queue{
    int[] arr;
    int[] st;
    int front;
    int rear;
    int cap;
    Queue(int n){
        cap = n;
        arr = new int[n];
        st = new int[n];
        front = 0;
        rear = 0;
    }
    void insert(int n){
        arr[rear] = n;
        st[rear++] = n;
    }
    
}