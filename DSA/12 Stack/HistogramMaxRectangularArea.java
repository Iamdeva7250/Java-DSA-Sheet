import java.util.*;
import java.io.*;

public class HistogramMaxRectangularArea {
    
    // Your code here
      public static int getMaxArea(int arr[]) {
        // code here
        int n = arr.length;
        
        Stack<Integer> s = new Stack<>();
        
        int maxArea = 0;
        
        for(int i = 0; i <= n; i++){
            int currHeight = (i == n) ? 0 : arr[i];
            
            while(!s.isEmpty() && currHeight < arr[s.peek()]){
                int height = arr[s.pop()];
                int width = s.isEmpty() ? i : i - s.peek() -1;
                maxArea = Math.max(maxArea, height * width);
            }
            s.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int n = arr.length;

        int result = getMaxArea(arr);
        System.out.println(result);
    }
    
}