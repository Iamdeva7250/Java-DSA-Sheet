public class BinarySearRecursive {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1; //Base case.

        // Perform the steps:
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (target > arr[mid])
            return binarySearch(arr, mid + 1, high, target);
        return binarySearch(arr, low, mid - 1, target);
    }

    public static int search(int[] arr, int target) {
        return binarySearch(arr, 0, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}
