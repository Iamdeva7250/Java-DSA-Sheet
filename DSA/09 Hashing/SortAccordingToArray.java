import java.util.*;
import java.io.*;

public class SortAccordingToArray {

    static void relativeSort(int[] a1, int[] a2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : a1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int index = 0;
        
        for (int num : a2) {
            if (freq.containsKey(num)) {
                int count = freq.get(num);
                while (count-- > 0) {
                    a1[index++] = num;
                }
                freq.remove(num);
            }
        }
        
        ArrayList<Integer> remaining = new ArrayList<>();
        
        for (int num : freq.keySet()) {
            int count = freq.get(num);
            while (count-- > 0) {
                remaining.add(num);
            }
        }
        
        Collections.sort(remaining);
        
        for (int num : remaining) {
            a1[index++] = num;
        }
    }

    // ✅ Main method to test in VS Code
    public static void main(String[] args) {
        int[] a1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] a2 = {2, 1, 8, 3};
        
        System.out.println("Before sorting: " + Arrays.toString(a1));
        
        relativeSort(a1, a2);
        
        System.out.println("After relative sort: " + Arrays.toString(a1));
    }
}

