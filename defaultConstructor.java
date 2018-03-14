import java.util.*;
public class defaultConstructor{
    String str;
    int abc;
    void display(){
        System.out.println(str);
        System.out.println(abc);
    }
    public static void main(String[] args){
        defaultConstructor dC = new defaultConstructor();
        dC.display();
    }
}