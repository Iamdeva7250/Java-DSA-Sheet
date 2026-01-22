import java.util.*;

class FrequencyCountArray {
    public List<String> frequencyCount(int[] arr) {
        int n = arr.length;

        // Find max element in array
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        // Frequency array for 1..max
        int[] freq = new int[max + 1];

        // Count frequencies
        for (int num : arr) {
            if (num >= 1) {
                freq[num]++;
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            result.add("Element " + i + " -> " + freq[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        FrequencyCountArray sol = new FrequencyCountArray();
        int[] arr = {2, 1, 1, 45, 3, 4, 5, 6, 8, 7, 9, 10 ,22, 23, 25, 24, 12};

        for (String line : sol.frequencyCount(arr)) {
            System.out.println(line);
        }
    }
}
