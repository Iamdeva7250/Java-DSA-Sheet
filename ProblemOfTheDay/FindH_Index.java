import java.util.*;
import java.io.*;

public class FindH_Index {
    
    // Your code here
    
      public int hIndex(int[] citations) {
        // Step 1: Sort citations in ascending order
        Arrays.sort(citations);
        
        int n = citations.length;
        int h = 0;
        
        // Step 2: Traverse from the end (highest citations)
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastThisCitation = n - i;
            if (citations[i] >= papersWithAtLeastThisCitation) {
                h = papersWithAtLeastThisCitation;
                break;
            }
        }
        
        return h;
    }

    public static void main(String[] args) {
        FindH_Index solution = new FindH_Index();
        int[] citations = {3, 0, 6, 1, 5};
        int hIndex = solution.hIndex(citations);
        System.out.println("The H-Index is: " + hIndex);
    }
}