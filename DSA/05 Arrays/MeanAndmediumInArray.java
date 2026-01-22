import java.util.Arrays;

public class MeanAndmediumInArray {
    public int mean(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / n;
    }

    public int median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2]; // odd length
        } else {
            return (arr[(n - 1) / 2] + arr[n / 2]) / 2; // even length
        }
    }

    public static void main(String[] args) {
        MeanAndmediumInArray sol = new MeanAndmediumInArray();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 2, 1, 8, 9};

        System.out.println("Array 1: mean = " + sol.mean(arr1) + ", median = " + sol.median(arr1));
        System.out.println("Array 2: mean = " + sol.mean(arr2) + ", median = " + sol.median(arr2));
    }
}
