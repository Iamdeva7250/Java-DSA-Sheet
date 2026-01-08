import java.util.*;
import java.io.*;

public class CountSubarraywithkodds {
    
    // Your code here
     public int countSubarrays(int[] arr, int k) {
        return atMost(arr, k) - atMost(arr, k - 1);
    }

    private int atMost(int[] arr, int k) {
        int left = 0, count = 0, odd = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 == 1) odd++;

            while (odd > k) {
                if (arr[left] % 2 == 1) odd--;
                left++;
            }

            count += right - left + 1;
        }
        return count;
    }


    public static void main(String[] args) {
        CountSubarraywithkodds solution = new CountSubarraywithkodds();
        int[] arr = {1, 1, 2, 1, 1};
        int k = 3;
        int result = solution.countSubarrays(arr, k);
        System.out.println("Count of subarrays with exactly " + k + " odd numbers: " + result); 
    }
    
}