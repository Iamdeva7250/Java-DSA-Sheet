import java.util.*;
public class LongestSubarraywGSum {
  public int Longestsubarraywithgivensum(int[] arr, int sum){

    HashMap<Integer, Integer> prefixsum = new HashMap<>();

    int n = arr.length;
    int presum = 0;
    int maxlength = 0;

    for(int i = 0; i < n; i++){
      presum  += arr[i];

      if(presum == sum){
        maxlength  =  i + 1;
      }

        if(prefixsum.containsKey(presum) == false);
        prefixsum.put(presum, i);
        
        if(prefixsum.containsKey(presum - sum)){
          maxlength = Math.max(maxlength, i - prefixsum.get(presum - sum));
    }

    }
    return maxlength;
 }

 public static void main(String[] args) {
    LongestSubarraywGSum obj = new LongestSubarraywGSum();
    int arr[] = {10, 5, 2, 7, 1, 9};
    int targetSum = 15;
    int result = obj.Longestsubarraywithgivensum(arr, targetSum);
    System.out.println("Length of longest subarray with given sum is: " + result);
 }
}
  

