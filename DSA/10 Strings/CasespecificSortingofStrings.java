import java.util.*;

public class CasespecificSortingofStrings {

    public static String caseSort(String str) {

        int[] lower = new int[26];
        int[] upper = new int[26];

        // Count frequency of lowercase and uppercase letters
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a']++;
            } else {
                upper[c - 'A']++;
            }
        }

        StringBuilder result = new StringBuilder();
        int l = 0, u = 0;

        // Rebuild string maintaining case positions
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                while (lower[l] == 0) l++;
                result.append((char) ('a' + l));
                lower[l]--;
            } else {
                while (upper[u] == 0) u++;
                result.append((char) ('A' + u));
                upper[u]--;
            }
        }

        return result.toString();
    }

    // Main method for VS Code execution
    public static void main(String[] args) {
        String s = "GEekS";
        System.out.println(caseSort(s));
    }
}
