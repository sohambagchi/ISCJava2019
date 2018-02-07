import java.util.*;
public class RGen{
    Random rand = new Random();
    public int randomInt(int u, int p){
        return rand.nextInt(u) + p;
    }

    public char randomChar(){
        int tmp = rand.nextInt(25) + 65;
        char tMp = (char)tmp;
        return tMp;
    }

    public String randomString(){
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

    public String randomSentence(){
        int sentenceLength = rand.nextInt(6) + 1;
        String worDs[] = new String[sentenceLength + (sentenceLength - 1)];
        for(int i = 0; i < sentenceLength; i=i+2){
            int wordLength = rand.nextInt(5) + 4;
            char worD[] = new char[wordLength];
            for(int j = 0; j < wordLength; j++){
                int tmp = rand.nextInt(26) + 65;
                char tMp = (char)tmp;
                worD[j] = tMp;
            }
            String str = String.valueOf(worD);
            worDs[i] = str;
            if(i < sentenceLength) worDs[i+1] = " ";
        }
        String senTence = String.valueOf(worDs);
        return senTence;
    }

    public double randomDouble(){
        int shift = rand.nextInt(123);
        int x = rand.nextInt(3000) + shift;
        int y = rand.nextInt(3000) + shift;
        double dd = x/y;
        return dd;
    }
}