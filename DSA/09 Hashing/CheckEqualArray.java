import java.util.*;
import java.io.*;

public class CheckEqualArray {
    
    public static boolean checkequal(int a[], int b[]) {  // made static
        if (a.length != b.length) return false;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};
        int b[] = {2, 4, 5, 0, 1};

        System.out.println("Check equal Array: " + checkequal(a, b));
    }
}



// import java.util.*;

// class Solution {
//     public static boolean checkEqual(int[] a, int[] b) {
//         if (a.length != b.length) return false;

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Count frequency in array a
//         for (int num : a)
//             map.put(num, map.getOrDefault(num, 0) + 1);

//         // Decrease frequency based on array b
//         for (int num : b) {
//             if (!map.containsKey(num)) return false;
//             map.put(num, map.get(num) - 1);
//             if (map.get(num) == 0) map.remove(num);
//         }

//         // If all elements matched, map should be empty
//         return map.isEmpty();
//     }

//     public static void main(String[] args) {
//         int[] a = {1, 2, 2, 3};
//         int[] b = {2, 3, 1, 2};
//         System.out.println(checkEqual(a, b)); // ✅ true
//     }
// }
