import java.util.*;
public class MorenOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 3, 1, 1, 1};
        int n = arr.length;
        int threshold = n / 3;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Elements occurring more than n/3 times:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
  
}
