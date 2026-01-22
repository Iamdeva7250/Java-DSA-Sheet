public class LeftRotateOne {

    // Function to rotate array left by one
    static void lRotateOne(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        lRotateOne(arr, n);

        System.out.println("\nArray after left rotation by 1:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
