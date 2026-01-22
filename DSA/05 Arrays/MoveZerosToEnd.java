public class MoveZerosToEnd {

    // Function to move zeros to the end
    static void moveZeros(int[] arr) {
        int n = arr.length;
        int count = 0; // points to position of non-zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[count]
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++; // move count forward
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 13, 0, 5, 0, 0, 3, 12};

        moveZeros(arr);

        // Print updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
