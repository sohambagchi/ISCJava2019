import java.util.*;
public class examSchedule{
    String[][] threeWeeks;
    String[][] uniqueCombos;
    String[] subjectList;
    String subjects;
    String[] subjectsAdded;
    examSchedule(Scanner cons){
        threeWeeks = new String[15][4];
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
        uniqueCombos = new String[n][7];
        for(int i = 0; i < uniqueCombos.length; i++){
            uniqueCombos[i][1] = "LANGUAGE";
            uniqueCombos[i][2] = "LITERATURE";
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
            for(int j = 3; j < uniqueCombos[0].length; j++){
                System.out.println("Please enter COMBO " + (i+1) + " SUBJECT " + (j));
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
        for(int i = 0; i < threeWeeks.length; i++){
            for(int j = 1; j < threeWeeks[0].length; j++){
                for(int k = 0; k < subjectList.length; k++){
                    if(checkAlreadyPlotted(subjectList[i]) == false){
                        if(j > 1){
                            if(checkCommonSubject(subjectList[i], i, j)){
                                if(checkDateGap() == false){
                                    threeWeeks[i][j] = subjectList[k];
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    boolean checkAlreadyPlotted(String toC){
        for(int i = 0; i < subjectsAdded.length; i++){
            if(subjectsAdded[i].equals(toC)) return true;
        }
        return false;
    }

    boolean checkCommonSubject(String toC, int n, int m){
        for(int i = 0; i < uniqueCombos.length; i++){
            for(int j = 1; j < uniqueCombos[0].length; j++){
                if(uniqueCombos[i][j].equals(toC)){
                    for(int k = 1; k < uniqueCombos[0].length; k++){
                        if(threeWeeks[n][1].equals(uniqueCombos[i][k])) return false;
                        else if(threeWeeks[n][2].equals(uniqueCombos[i][k])) return false;
                        else return true;
                    }
                }
            }
        }
        return false;
    }

    boolean checkDateGap(){
        
        return false;
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