import java.util.*;
import java.io.*;

public class UnionOfArrayDuplicates {
    
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        // Convert set → result
        ArrayList<Integer> result = new ArrayList<>(set);

        // Sort result
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 2, 3, 3, 2};

        System.out.println("Total Union is : " + findUnion(a, b));
    }
}
