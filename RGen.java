import java.util.*;
public class RGen{
    public static Random rand = new Random();
    public static int randomInt(int u, int p){
        return rand.nextInt(u) + p;
    }

    public static char randomChar(){
        int tmp = rand.nextInt(25) + 65;
        char tMp = (char)tmp;
        return tMp;
    }

    public static String randomString(){
        int wordLength = rand.nextInt(5) + 4;
        char worD[] = new char[wordLength];
        for(int j = 0; j < wordLength; j++){
            int tmp = rand.nextInt(25) + 65;
            char tMp = (char)tmp;
            worD[j] = tMp;
        }
        String str = String.valueOf(worD);
        return str;
    }

    public static String randomSentence(){
        int sentenceLength = rand.nextInt(6) + 1;
        int potato = sentenceLength - 1;
        int ArrayLength = sentenceLength + potato;
        String worDs[] = new String[ArrayLength];
        for(int i = 0; i < ArrayLength; i += 2){
            if(i%2 == 0){
                int wordLength = rand.nextInt(8) + 1;
                char worD[] = new char[wordLength];
                for(int j = 0; j < wordLength; j++){
                    int tmp = rand.nextInt(26) + 65;
                    char tMp = (char)tmp;
                    worD[j] = tMp;
                }
                String str = String.valueOf(worD);
                worDs[i] = str;
            }
            else worDs[i] = " "; 
        }
        String senTence = " ";
        for(int i = 0; i < worDs.length; i++){
            if(i%2 == 0) senTence = senTence + worDs[i];
            else senTence = senTence + " ";
        }
        return senTence;
    }

    public static double randomDouble(){
        int shift = rand.nextInt(123);
        int x = rand.nextInt(3000) + shift;
        int y = rand.nextInt(3000) + shift;
        double dd = x/y;
        return dd;
    }
}