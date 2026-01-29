import java.util.*;
import java.io.*;

public class Subarrayrangewithgivensum {
    static int subArraySum(int arr[], int tar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int count = 0;
        int runningSum = 0;
        
        for (int num : arr) {
            runningSum += num;
            
            // check if runningSum - tar exists in map
            if (map.containsKey(runningSum - tar)) {
                count += map.get(runningSum - tar);
            }
            
            // update frequency of current runningSum
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
        
        return count;
      }
      public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int tar = -10;

        System.out.println("Total Subarrays with given sum: " + subArraySum(arr, tar)); 
      }
    
}