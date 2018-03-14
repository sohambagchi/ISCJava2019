import java.util.*;
public class constructorStuffs{
    String name;
    int age;
    int cvv;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        constructorStuffs[] arr = new constructorStuffs[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new constructorStuffs();
        }
        for(int i = 0; i < arr.length; i++){
            arr[i].display();
        }
    }
    constructorStuffs(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name - ");
        name = input.nextLine();
        System.out.println("Please enter age - ");
        age = input.nextInt();
        System.out.println("Please enter cvv - ");
        cvv = input.nextInt();
    }
    void display(){
        System.out.println("NAME - " + name);
        System.out.println("AGE - " + age);
        System.out.println("CVV - " + cvv);
    }
}