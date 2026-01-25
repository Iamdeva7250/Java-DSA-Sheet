  import java.util.*;
public class Merge3SortedArrays {

    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // Step 1: Merge a and b
        ArrayList<Integer> firstMerge = mergeTwo(a, b);
        // Step 2: Merge the result with c
        ArrayList<Integer> finalMerge = mergeTwo(firstMerge, c);
        return finalMerge;
    }

    // Merge two int arrays
    private ArrayList<Integer> mergeTwo(int[] a, int[] b) {
        int i = 0, j = 0;
        int n1 = a.length, n2 = b.length;
        ArrayList<Integer> merged = new ArrayList<>(n1 + n2);
        
        while (i < n1 && j < n2) {
            if (a[i] <= b[j])
                merged.add(a[i++]);
            else
                merged.add(b[j++]);
        }

        while (i < n1)
            merged.add(a[i++]);
        while (j < n2)
            merged.add(b[j++]);
        
        return merged;
    }

    // Merge ArrayList and array
    private ArrayList<Integer> mergeTwo(ArrayList<Integer> list, int[] arr) {
        int i = 0, j = 0;
        int n1 = list.size(), n2 = arr.length;
        ArrayList<Integer> merged = new ArrayList<>(n1 + n2);
        
        while (i < n1 && j < n2) {
            if (list.get(i) <= arr[j])
                merged.add(list.get(i++));
            else
                merged.add(arr[j++]);
        }

        while (i < n1)
            merged.add(list.get(i++));
        while (j < n2)
            merged.add(arr[j++]);
        
        return merged;
    }

    // Test
    public static void main(String[] args) {
        Merge3SortedArrays sol = new Merge3SortedArrays();
        int[] a = {1, 4, 7, 10};
        int[] b = {2, 5, 8, 11};
        int[] c = {3, 6, 9, 12};

        ArrayList<Integer> result = sol.mergeThree(a, b, c);
        System.out.println(result);
    }
}

  

