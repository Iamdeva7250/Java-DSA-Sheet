import java.util.*;

public class MinimumCostofropes {
    
    // Function to return minimum cost of connecting ropes
    public static int minCost(int[] arr) {
        // Step 1: Create a min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Step 2: Add all rope lengths to the heap
        for (int num : arr) {
            pq.add(num);
        }
        
        int totalCost = 0;
        
        // Step 3: Keep combining the two smallest ropes
        while (pq.size() > 1) {
            int first = pq.poll();   // smallest rope
            int second = pq.poll();  // second smallest rope
            
            int cost = first + second;
            totalCost += cost;
            
            pq.add(cost); // push back the combined rope
        }
        
        return totalCost;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr)); 
        
    }
}
