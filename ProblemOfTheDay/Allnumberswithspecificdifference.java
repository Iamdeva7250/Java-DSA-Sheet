import java.util.*;
import java.io.*;

public class Allnumberswithspecificdifference {
    
    // Your code here
      public int getCount(int n, int d) {
        int low = 1, high = n, ans = n + 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid - digitSum(mid) >= d) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        // If ans never updated, no numbers satisfy condition
        if (ans == n + 1) return 0;
        
        return n - ans + 1;
    }
    
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Allnumberswithspecificdifference solution = new Allnumberswithspecificdifference();
        int n = 100, d = 10;
        int count = solution.getCount(n, d);
        System.out.println("Count of numbers from 1 to " + n + " with difference >= " + d + ": " + count);
    }
    
}