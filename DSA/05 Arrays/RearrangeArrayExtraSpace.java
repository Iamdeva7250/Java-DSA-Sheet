import java.util.*;

public class RearrangeArrayExtraSpace {
    // Function to rearrange the array
    public void arrange(long[] arr) {
        int n = arr.length;

        // Step 1: Encode new values into arr[i]
        for (int i = 0; i < n; i++) {
            long newVal = arr[(int) arr[i]] % n; // get original value
            arr[i] = arr[i] + newVal * n;
        }

        // Step 2: Decode new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        long[] arr = new long[n];

        System.out.println("Enter array elements (0 to n-1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();  // ✅ FIX: actually read values
        }

        RearrangeArrayExtraSpace sol = new RearrangeArrayExtraSpace();
        sol.arrange(arr);

        System.out.println("Rearranged Array:");
        for (long x : arr) {
            System.out.print(x + " ");
        }
    }
}
