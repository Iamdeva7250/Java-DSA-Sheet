import java.util.*;
import java.io.*;

public class CountXinRangeofaSortedArray {
    
public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {

        // Step 1: Preprocess indices of each value
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Step 2: Process each query
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int x = q[2];

            if (!map.containsKey(x)) {
                ans.add(0);
                continue;
            }

            ArrayList<Integer> list = map.get(x);

            // count indices in [l, r]
            int left = lowerBound(list, l);
            int right = upperBound(list, r);

            ans.add(right - left);
        }

        return ans;
    }

    // First index >= target
    private int lowerBound(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (list.get(mid) < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    // First index > target
    private int upperBound(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (list.get(mid) <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static void main(String[] args) {
        CountXinRangeofaSortedArray counter = new CountXinRangeofaSortedArray();
        int[] arr = {1, 2, 2, 3, 4, 2, 5};
        int[][] queries = {{0, 6, 2}, {1, 4, 3}, {2, 5, 4}};
        ArrayList<Integer> result = counter.countXInRange(arr, queries);
        System.out.println(result); // Output: [3, 1, 1]  
    }
}

    
