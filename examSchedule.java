import java.util.*;
public class examSchedule{
    String[][] threeWeeks;
    String[][] uniqueCombos;
    String[] subjectList;
    String subjects;
    String[] subjectsAdded;
    examSchedule(Scanner cons){
        threeWeeks = new String[15][3];
        for(int i = 0; i < 15; i += 5){
            threeWeeks[i][0] = "Monday";
            threeWeeks[i + 1][0] = "Tuesday";
            threeWeeks[i + 2][0] = "Wednesday";
            threeWeeks[i + 3][0] = "Thursday";
            threeWeeks[i + 4][0] = "Friday";            
        }
        subjects = "LANGUAGE LITERATURE";
        System.out.println("Please enter number of unique combinations - ");
        int n = cons.nextInt();
        uniqueCombos = new String[n][6];
        for(int i = 0; i < uniqueCombos.length; i++){
            uniqueCombos[i][0] = "LANGUAGE";
            uniqueCombos[i][1] = "LITERATURE";
        }
        for(int i = 0; i < threeWeeks.length; i++){
            for(int j = 0; j < threeWeeks[0].length; j++){
                System.out.print(threeWeeks[i][j] + "\t");
            }
            System.out.println(" ");
        }
        cons.nextLine();
    }

    void createUniqueCombos(Scanner sub, examSchedule eV){
        for(int i = 0; i < uniqueCombos.length; i++){
            for(int j = 2; j < uniqueCombos[0].length; j++){
                System.out.println("Please enter COMBO " + (i) + " SUBJECT " + (j));
                String temp = sub.nextLine();
                uniqueCombos[i][j] = temp.toUpperCase();
                eV.addToSL(uniqueCombos[i][j]);
            }
        }
        eV.SLtoArray();
    }

    void addToSL(String subA){
        boolean temp = false;
        if(subA.equals("ART")){
            temp = subjects.contains("ART1");
            if(temp == false){
                subjects += " ";
                subjects += "ART1 ";
                subjects += "ART2";
            }
        }
        else{
            temp = subjects.contains(subA);
            if(temp == false){
                subjects += " ";
                subjects += subA;
            }
        }
    }

    void createSchedule(){

    }

    void SLtoArray(){
        subjectList = subjects.split(" "); 
        subjectsAdded = new String[subjectList.length];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        examSchedule eS = new examSchedule(input);
        eS.createUniqueCombos(input, eS);

    }
}