import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> distinctElements = new HashSet<>();
        
        for (int num : arr) {
            distinctElements.add(num);
        }
        
        System.out.println("Number of distinct elements: " + distinctElements.size());
    }
} 