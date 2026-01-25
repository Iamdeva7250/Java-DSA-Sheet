
  import java.util.*;
public class FindTriplet {



    // Function to find a triplet (a, b, c) such that a + b = c
    public static ArrayList<Integer> findTriplet(int arr[], int n) {
        Arrays.sort(arr); // Sort array first

        ArrayList<Integer> result = new ArrayList<>();

        // Iterate from the largest element
        for (int i = n - 1; i >= 0; i--) {
            int l = 0, r = i - 1;

            while (l < r) {
                int sum = arr[l] + arr[r];

                if (sum == arr[i]) {
                    // Found triplet
                    result.add(arr[l]);
                    result.add(arr[r]);
                    result.add(arr[i]);
                    return result;
                } else if (sum < arr[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return result; // Empty if no triplet found
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        ArrayList<Integer> triplet = findTriplet(arr, n);

        if (triplet.size() > 0) {
            System.out.println("Triplet found: " + triplet);
        } else {
            System.out.println("No triplet found");
        }
    }

}
