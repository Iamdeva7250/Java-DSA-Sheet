import java.util.*;
import java.io.*;

public class SubarrayWith0Sum {
    
    public static boolean subarraySum(int arr[]) {

        HashSet<Integer> seen = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            // If prefix sum becomes zero OR repeats → zero-sum subarray exists
            if (sum == 0 || seen.contains(sum))
                return true;

            seen.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};

        if (subarraySum(arr)) {
            System.out.println("YES, zero-sum subarray exists.");
        } else {
            System.out.println("NO, zero-sum subarray doesn't exist.");
        }
    }
}
