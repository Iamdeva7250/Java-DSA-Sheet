public class LeftRotatebyD {
        // Function to left rotate array by d positions
        static void leftRotate(int[] arr, int d) {
            int n = arr.length;
            d = d % n; // in case d > n

            reverse(arr, 0, d - 1);     // Reverse first d elements
            reverse(arr, d, n - 1);     // Reverse remaining elements
            reverse(arr, 0, n - 1);     // Reverse whole array
        }

        // Helper function to reverse array from start to end
        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Driver code
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int d = 2;

            System.out.println("Original Value : ");
            for(int num : arr) {
                System.out.print(num + " ");
            }

            leftRotate(arr, d);

            // Print rotated array
            System.out.println("\n After the Rotate value : ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


