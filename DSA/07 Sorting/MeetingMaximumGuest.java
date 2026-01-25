  import java.util.Arrays;


public class MeetingMaximumGuest {

    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        // Step 1: Sort both arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Step 2: Use two pointers
        int i = 1, j = 0;
        int res = 1;  // result = maximum platforms required
        int curr = 1; // current platforms needed

        while (i < n && j < n) {
            // If next train arrives before the previous one departs
            if (arr[i] <= dep[j]) {
                curr++; // need one more platform
                i++;
            } else {
                curr--; // one train departed → free one platform
                j++;
            }
            res = Math.max(res, curr); // track max platforms
        }

        return res;
    }

    public static void main(String[] args) {
        MeetingMaximumGuest sol = new MeetingMaximumGuest();

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(sol.minPlatform(arr, dep)); // Output: 3
    }
}

  

