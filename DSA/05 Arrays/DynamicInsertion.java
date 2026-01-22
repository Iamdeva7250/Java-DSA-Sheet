import java.util.Arrays;

class DynamicInsertion {
    // Function to insert element, resizing if full
    static int[] insert(int arr[], int n, int x, int pos) {
        // Resize array if full
        if (n == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }

        int idx = pos - 1;

        // Shift elements
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return arr; // return updated array
    }

    public static void main(String args[]) {
        int arr[] = new int[3]; // small initial capacity
        int n = 3;

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = 7, pos = 2;

        // Call insert and resize if needed
        arr = insert(arr, n, x, pos);
        n++;

        System.out.println("After Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
