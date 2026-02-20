import java.util.*;

public class KMostoccurringelements {
    
    // Function to print the sum of frequencies of k numbers
    // with most occurrences in an array.
    int kMostFrequent(int arr[], int n, int k) {
        // Step 1: Count frequencies using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store frequencies in a list
        List<Integer> freqList = new ArrayList<>(freqMap.values());

        // Step 3: Sort in descending order
        Collections.sort(freqList, Collections.reverseOrder());

        // Step 4: Sum top k frequencies
        int sum = 0;
        for (int i = 0; i < k && i < freqList.size(); i++) {
            sum += freqList.get(i);
        }

        return sum;
    }


    public static void main(String[] args) {
        KMostoccurringelements obj = new KMostoccurringelements();
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4};
        int n = arr.length;
        int k = 2;
        System.out.println(obj.kMostFrequent(arr, n, k));
       
    }
}
