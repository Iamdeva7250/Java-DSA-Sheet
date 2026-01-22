import java.util.Arrays;

public class FrequencyInArray {

    static void printFreq(int arr[], int N) {

        // ✅ Step 1: Sort the array
        Arrays.sort(arr);

        // Stores the frequency of an element
        int freq = 1;

        // Traverse the array
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println("Frequency of " + arr[i - 1] + " is: " + freq);
                freq = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println("Frequency of " + arr[N - 1] + " is: " + freq);
    }

    // Driver Code
    public static void main(String args[]) {
        // You can give unsorted input now
        int arr[] = { 5, 3, 8, 3, 1, 9, 8, 1, 8, 5, 10, 9, 1 };
        int N = arr.length;

        printFreq(arr, N);
    }
}
