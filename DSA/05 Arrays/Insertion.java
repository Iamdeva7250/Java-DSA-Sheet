import java.lang.*;

class Insertion {
    static int insert(int arr[], int n, int x, int cap, int pos) {
        // If array is already full
        if (n == cap)
            return n;

        int idx = pos - 1; // convert to 0-based index

        // Shift elements to the right
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x; // Insert new element

        return n + 1; // New size
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        int cap = 5, n = 3;

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = 7, pos = 2;

        n = insert(arr, n, x, cap, pos);

        System.out.println("After Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
