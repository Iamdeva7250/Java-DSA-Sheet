import java.util.*;

public class MostFrequentCharacter {

    public char getMaxOccuringChar(String s) {

        int count[] = new int[256];

        int maxFreq = -1;
        char result = 0;

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Find maximum occurring character
        for (int i = 0; i < 256; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
                result = (char) i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MostFrequentCharacter mfc = new MostFrequentCharacter();
        String str = "sample string example";
        char res = mfc.getMaxOccuringChar(str);
        System.out.println("Most frequent character: " + res);
    }
}
