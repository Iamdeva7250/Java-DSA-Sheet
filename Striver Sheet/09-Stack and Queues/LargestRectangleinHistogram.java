import java.util.*;
import java.io.*;

public class LargestRectangleinHistogram {
    
    // Your code here
      public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
      LargestRectangleinHistogram solution = new LargestRectangleinHistogram();

      int[] heights = {2, 1, 5, 6, 2, 3};

      int result = solution.largestRectangleArea(heights);
      System.out.println("Largest Rectangle Area: " + result);
      
    }
}