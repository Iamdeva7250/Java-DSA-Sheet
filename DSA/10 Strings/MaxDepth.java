import java.util.*;

public class MaxDepth {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        
        return maxDepth;
    }

    // Main method inside the class
    public static void main(String[] args) {
        MaxDepth solution = new MaxDepth();
        
        // Test cases
        String[] testCases = {
            "(1+(2*3)+((8)/4))+1",  // Expected: 3
            "(1)+((2))+(((3)))",     // Expected: 3
            "1+(2*3)/(2-1)",         // Expected: 1
            "1",                     // Expected: 0
            "()",                    // Expected: 1
            "()()",                  // Expected: 1
            "((()))",                // Expected: 3
        };
        
        for (String test : testCases) {
            int result = solution.maxDepth(test);
            System.out.println("Input: " + test);
            System.out.println("Max Depth: " + result);
            System.out.println();
        }
    }
}