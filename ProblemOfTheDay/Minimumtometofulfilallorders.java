import java.util.*;
import java.io.*;

public class Minimumtometofulfilallorders {
    
      public int minTime(int[] ranks, int n) {
        int low = 0;
        int high = Integer.MAX_VALUE;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canCook(ranks, n, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canCook(int[] ranks, int n, int time) {
        int count = 0;

        for (int r : ranks) {
            int t = 0;
            int j = 1;

            while (t + r * j <= time) {
                t += r * j;
                count++;
                j++;

                if (count >= n) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
      Minimumtometofulfilallorders solver = new Minimumtometofulfilallorders();
      int[] ranks = {1, 2, 3, 4};
      int n = 10;
      int result = solver.minTime(ranks, n);
      System.out.println("Minimum time to fulfill all orders: " + result);
    }
    
}