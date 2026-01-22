import java.util.Arrays;

public class RearrangeAlternate {

    public void rearrange(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        int maxIdx = n - 1;
        int minIdx = 0;
        int maxElem = arr[n - 1] + 1; // any number greater than the max element

        // Encode new values
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // place max element
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                // place min element
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Decode the new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {
        RearrangeAlternate sol = new RearrangeAlternate();

        int[] arr = {1, 2, 3, 4, 5, 6, 15, 10, 12, 30, 45, 12};

        sol.rearrange(arr);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
