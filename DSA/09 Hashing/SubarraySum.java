import java.util.*;

public class SubarraySum {
  
    static int subArraySum(int arr[], int tar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int count = 0;
        
        map.put(0, 1);   // prefix sum = 0 initially
        
        for (int num : arr) {
            sum += num;
            
            if (map.containsKey(sum - tar)) {
                count += map.get(sum - tar);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int tar = -10;

        System.out.println(  "Total Sum Of Subarrays is : "  + subArraySum( arr, tar));
    }
}
