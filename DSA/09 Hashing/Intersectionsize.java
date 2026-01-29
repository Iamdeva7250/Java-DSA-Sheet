import java.util.*;

public class Intersectionsize {

    public static int intersectionSize(int[] a, int[] b) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : b) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                count++;
                freq.put(num, freq.get(num) - 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int a[] = {89, 24, 75, 11, 23};
        int b[] = {89, 2, 4};

        System.out.println("Total Number of Intersection Size is : " + intersectionSize(a, b));
    }
}
