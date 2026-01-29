import java.util.*;
import java.io.*;

public class Subarrayswithequal1sand0s {

  static int countSubarrays(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    map.put(0, 1); 
    
    int count = 0;
    int runningSum = 0;
    
    for (int num : arr) {
        // Convert 0s to -1s
        if (num == 0) {
            runningSum += -1;
        } else {
            runningSum += 1;
        }
        
        // Check if runningSum exists in map
        if (map.containsKey(runningSum)) {
            count += map.get(runningSum);
        }
        
        // Update frequency of current runningSum
        map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
    }
    
    return count;
  }

  public static void main(String[] args) {
    int arr[] = {1, 0, 0, 1, 0, 1, 1};
    
    System.out.println("Total Subarrays with equal 1s and 0s: " + countSubarrays(arr)); 
  }
    
}