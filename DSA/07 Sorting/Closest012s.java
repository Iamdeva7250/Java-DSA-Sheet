public class Closest012s {

    // arr[]: Input Array
    // N: Size of the Array arr[]
    // Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int N) {
        
        int low = 0, mid = 0, high = N - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[mid] with arr[low]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                // Swap arr[mid] with arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    // Optional: Test the function
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0};
        segragate012(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 0 0 0 1 1 1 2 2
    }
}

