import java.util.Arrays;

public class PendulumArrangement {

    public int[] pendulumArrangement(int[] arr, int n) {
        Arrays.sort(arr);
        int[] res = new int[n];

        int mid = n / 2;
        // place smallest in the middle
        res[mid] = arr[0];

        int left = mid - 1;
        int right = mid + 1;

        for (int i = 1; i < n; i++) {
            if ((i & 1) == 1) {
                if (right < n) res[right++] = arr[i];
                else res[left--] = arr[i];
            } else {
                if (left >= 0) res[left--] = arr[i];
                else res[right++] = arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        PendulumArrangement sol = new PendulumArrangement();
        int[] arr = {1, 3, 2, 5, 4};
        int[] res = sol.pendulumArrangement(arr, arr.length);
        System.out.println(Arrays.toString(res)); // prints [5, 3, 1, 2, 4]
    }
}
