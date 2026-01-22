public class SortedAndRotated {
    static boolean sortedandRoted(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        // must have exactly one break
        if (count != 1) return false;

        // exclude already sorted arrays
        if (arr[0] < arr[n - 1]) return false;

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};   // not rotated
        int[] arr2 = {3, 4, 5, 1};   // rotated sorted
        int[] arr3 = {2, 3, 1};      // rotated sorted
        int[] arr4 = {1, 2, 3};      // not rotated

        System.out.println(sortedandRoted(arr1)); // false
        System.out.println(sortedandRoted(arr2)); // true
        System.out.println(sortedandRoted(arr3)); // true
        System.out.println(sortedandRoted(arr4)); // false
    }
}
