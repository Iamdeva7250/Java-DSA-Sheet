import java.util.*;
import java.io.*;

public class RulingPair {

    static int RulingPair(int arr[], int n) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Group numbers by digit sum
        for (int num : arr) {
            int sum = digitSum(num);
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(num);
        }

        int maxSum = -1;

        // Check each group
        for (ArrayList<Integer> list : map.values()) {
            if (list.size() >= 2) {
                Collections.sort(list, Collections.reverseOrder());
                maxSum = Math.max(maxSum, list.get(0) + list.get(1));
            }
        }

        return maxSum;
    }

    static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = RulingPair(arr, n);
        System.out.println("Ruling Pair Sum: " + result); 
    }
}

    
