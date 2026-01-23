import java.util.*;

public class HappiestTriplet {

    int[] smallestDifferenceTriplet(int arr1[], int arr2[], int arr3[]) {
        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[3];

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            int a = arr1[i];
            int b = arr2[j];
            int c = arr3[k];

            int currentMax = Math.max(a, Math.max(b, c));
            int currentMin = Math.min(a, Math.min(b, c));
            int diff = currentMax - currentMin;

            if (diff < minDiff) {
                minDiff = diff;
                result[0] = a;
                result[1] = b;
                result[2] = c;
            }

            if (currentMin == a) i++;
            else if (currentMin == b) j++;
            else k++;
        }

        Arrays.sort(result);
        return new int[]{result[2], result[1], result[0]}; // descending order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HappiestTriplet sol = new HappiestTriplet();

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        // Input third array
        System.out.print("Enter size of third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements of third array:");
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        // Get triplet
        int[] triplet = sol.smallestDifferenceTriplet(arr1, arr2, arr3);

        // Print result
        System.out.println("Triplet with smallest difference (descending): " +
                triplet[0] + " " + triplet[1] + " " + triplet[2]);

        sc.close();
    }
}
