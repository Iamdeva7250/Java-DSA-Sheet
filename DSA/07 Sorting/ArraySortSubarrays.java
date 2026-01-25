import java.util.Arrays;
public class ArraySortSubarrays {

        public static void main(String[] args)
        {
            int[] arr = { 5, 30, 20, 10, 8 };

            // Sorting subarray from index 1 to 4 (i.e., {30,
            // 20, 10})
            Arrays.sort(arr, 1, 4);

            System.out.println(Arrays.toString(arr));
        }
    }

