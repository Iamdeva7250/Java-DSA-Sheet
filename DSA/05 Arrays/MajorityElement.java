public class MajorityElement {

    // Function to find majority element
    public static int findMajority(int[] arr, int n) {
        int res = 0, count = 1;

        // Step 1: Find a candidate
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        // Step 2: Check if candidate is actually majority
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }

        if (count > n / 2) {
            return arr[res]; // return the element itself
        } else {
            return -1; // no majority element
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;

        int result = findMajority(arr, n);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}
