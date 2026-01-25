public class ThreeWayPartition {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] > b) {
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                // Do NOT increment mid here because we need to check the new arr[mid]
            } 
            else {
                mid++;
            }
        }
    }

    // For testing
    public static void main(String[] args) {
        ThreeWayPartition sol = new ThreeWayPartition();
        int[] arr = {1, 4, 3, 6, 2, 1};
        int a = 1, b = 3;

        sol.threeWayPartition(arr, a, b);

        System.out.print("Partitioned array: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

  
