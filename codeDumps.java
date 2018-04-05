import java.util.*;
public class codeDumps{
    void examSchedule1(){
    /*for(int i = 0; i < threeWeeks.length; i++){
        for(int k = 0; k < subjectList.length; k++){
        for(int j = 1; j < threeWeeks[0].length; j++){

        }
        }
        }*/

        int x = 0;
        for(int i = 0; i < threeWeeks.length; i++){
            System.out.println("LANDMARK 1");
            for(int k = 0; k < subjectList.length; k++){
                for(int j = 1; j < threeWeeks[0].length; j++){
                    if(threeWeeks[i][j] == "-"){
                        System.out.println("REACHES HERE");
                        if(checkAlreadyPlotted(subjectList[k]) == false){
                            System.out.println("PASSED FIRST CONDITIONAL; J = " + j + "; I = " + i + "; K = " + k);
                            if(j > 1){
                                System.out.println("PASSED j > 1; J = " + j + "; I = " + i + "; K = " + k);
                                if(checkCommonSubject(subjectList[k], i, j) == true){
                                    System.out.println("LANDMARK 7; J = " + j + "; I = " + i + "; K = " + k);
                                    if(eV.checkDateGap(subjectList[k]) < 1){
                                        System.out.println("LANDMARK 6; J = " + j + "; I = " + i + "; K = " + k);
                                        threeWeeks[i][j] = subjectList[k];
                                        subjectsAdded[x] = subjectList[k];
                                        eV.dateGap(threeWeeks[i][j]);
                                        x += 1;
                                        //j+=1;
                                        eV.printSchedule();
                                    }
                                }
                                //else{
                                //   j+=1;
                                //}
                            }
                            else{
                                System.out.println("PASSED j < 1; J = " + j + "; I = " + i + "; K = " + k);
                                if(eV.checkDateGap(subjectList[k]) < 1){
                                    System.out.println("LANDMARK 5; J = " + j + "; I = " + i + "; K = " + k);
                                    threeWeeks[i][j] = subjectList[k];
                                    subjectsAdded[x] = subjectList[k];
                                    eV.dateGap(threeWeeks[i][j]);
                                    x += 1;
                                    //j+=1;
                                    eV.printSchedule();
                                }
                            }
                            //if(j>=3) j = 1;
                            System.out.println("LANDMARK 2; J = " + j + "; I = " + i + "; K = " + k);
                        }
                        System.out.println("LANDMARK 3; J = " + j + "; I = " + i + "; K = " + k);
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.println("LANDMARK 4; J = " + j + "; I = " + i + "; K = " + k);
                }
                eV.datePassed();
            }
            eV.printSchedule();
        }
        
        /**void createSchedule(ExamSchedule eV){
    subjects1:
    for(int k = 0; k < subjectList.length; k++){
    if(eV.checkAlreadyPlotted(subjectList[k])){
    threeweeks1:
    for(int i = 0; i < threeWeeks.length; i++){
    threeweeks2:
    for(int j = 1; j < threeWeeks[0].length; j++){

    }
    }
    }
    }
    }**/

    void createSchedule(ExamSchedule eV){
        int x = 0;
        for(int i = 0; i < threeWeeks.length; i++){
            System.out.println("LANDMARK 1");
            loop1:
            for(int k = 0; k < subjectList.length; k++){
                loop2:
                for(int j = 1; j < threeWeeks[0].length; j++){
                    loop3:
                    if(threeWeeks[i][j] == "-"){
                        System.out.println("REACHES HERE");
                        loop4:
                        if(checkAlreadyPlotted(subjectList[k]) == false){
                            System.out.println("PASSED FIRST CONDITIONAL; J = " + j + "; I = " + i + "; K = " + k);
                            loop5:
                            if(j > 1){
                                System.out.println("PASSED j > 1; J = " + j + "; I = " + i + "; K = " + k);
                                loop6:
                                if(checkCommonSubject(subjectList[k], i) == true){
                                    System.out.println("LANDMARK 7; J = " + j + "; I = " + i + "; K = " + k);
                                    loop7:
                                    if(eV.checkDateGap(subjectList[k]) < 1){
                                        System.out.println("LANDMARK 6; J = " + j + "; I = " + i + "; K = " + k);
                                        threeWeeks[i][j] = subjectList[k];
                                        subjectsAdded[x] = subjectList[k];
                                        eV.dateGap(threeWeeks[i][j]);
                                        x += 1;
                                        //j+=1;
                                        eV.printSchedule();
                                    }
                                }
                                //else{
                                //   j+=1;
                                //}
                            }
                            else{
                                System.out.println("PASSED j < 1; J = " + j + "; I = " + i + "; K = " + k);
                                if(eV.checkDateGap(subjectList[k]) < 1){
                                    System.out.println("LANDMARK 5; J = " + j + "; I = " + i + "; K = " + k);
                                    threeWeeks[i][j] = subjectList[k];
                                    subjectsAdded[x] = subjectList[k];
                                    eV.dateGap(threeWeeks[i][j]);
                                    x += 1;
                                    //j+=1;
                                    eV.printSchedule();
                                }
                            }
                            //if(j>=3) j = 1;
                            System.out.println("LANDMARK 2; J = " + j + "; I = " + i + "; K = " + k);
                        }
                        System.out.println("LANDMARK 3; J = " + j + "; I = " + i + "; K = " + k);
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.println("LANDMARK 4; J = " + j + "; I = " + i + "; K = " + k);
                }
                eV.datePassed();
            }
            eV.printSchedule();
        }
    }
        
    }
}