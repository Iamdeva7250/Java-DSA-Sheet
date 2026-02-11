import java.util.*;
import java.io.*;

public class EqualizetheTowers {
    
    public int minCost(int[] heights, int[] cost) {
        int n = heights.length;
        int[][] pairs = new int[n][2];
        
        // Pair heights with costs
        for (int i = 0; i < n; i++) {
            pairs[i][0] = heights[i];
            pairs[i][1] = cost[i];
        }
        
        // Sort by height
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Find weighted median
        long totalCost = 0;
        for (int[] p : pairs) totalCost += p[1];
        
        long cumulative = 0;
        int targetHeight = 0;
        for (int[] p : pairs) {
            cumulative += p[1];
            if (cumulative * 2 >= totalCost) {
                targetHeight = p[0];
                break;
            }
        }
        
        // Compute minimum cost
        long minCost = 0;
        for (int[] p : pairs) {
            minCost += (long) Math.abs(p[0] - targetHeight) * p[1];
        }
        
        return (int) minCost;
    }

    public static void main(String[] args) {
        EqualizetheTowers solver = new EqualizetheTowers();
        
        // Example test case
        int[] heights = {1, 3, 5};
        int[] cost = {2, 3, 1};
        
        int result = solver.minCost(heights, cost);
        System.out.println("Minimum cost: " + result); 
    }
}
