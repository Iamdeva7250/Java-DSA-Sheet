import java.lang.Thread.State;
import java.util.*;

public class LongestConstiveSubsequence {
       public static int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
            
            int res = 0;
            
            for(int num : set){
            
            if(!set.contains(num - 1)){
                int currNum = num;
                int currLen = 1;
                
                while(set.contains(currNum + 1)){
                currNum++;
                currLen++;
            }
            res = Math.max(res, currLen);
            }
            }
            return res;
    }
   
    }

    public static void main(String[] args) {
        LongestConstiveSubsequence obj = new LongestConstiveSubsequence();
        int arr[] = {100, 4, 200, 1, 3, 2};
        int result = obj.longestConsecutive(arr);
        System.out.println("The length of the longest consecutive elements sequence is: " + result);
    }

