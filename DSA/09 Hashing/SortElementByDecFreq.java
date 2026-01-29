import java.util.*;

public class SortElementByDecFreq {

    public static ArrayList<Integer> sortByFreq(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Convert array to list
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort by frequency (descending), then by value (ascending)
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqA = freq.get(a);
                int freqB = freq.get(b);

                // Higher frequency first
                if (freqA != freqB)
                    return freqB - freqA;

                // If same frequency, smaller number first
                return a - b;
            }
        });

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 4, 6, 4};

        ArrayList<Integer> result = sortByFreq(arr);
        System.out.println(result);
    }
}
