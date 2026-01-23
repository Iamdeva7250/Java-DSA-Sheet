public class Count1inArray {

        static int countOnes(int arr[], int n) {
            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2; // safe midpoint

                if (arr[mid] == 0) {
                    low = mid + 1; // move right
                } else {
                    if (mid == 0 || arr[mid - 1] == 0) {
                        return (n - mid); // total ones = length - firstOneIndex
                    } else {
                        high = mid - 1; // move left
                    }
                }
            }
            return 0; // no ones found
        }

        public static void main(String args[]) {
            int arr[] = {0, 0, 1, 1, 1, 1};
            int n = arr.length;

            System.out.println("Count of 1s = " + countOnes(arr, n));
        }
    }

