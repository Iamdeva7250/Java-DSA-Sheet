import java.util.*;
import java.io.*;

public class HappiestTriplet {

    int[] smallestDiff(int a[], int b[], int c[]) {

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;

        int x = 0, y = 0, z = 0;

        while (i < a.length && j < b.length && k < c.length) {

            int minVal = Math.min(a[i], Math.min(b[j], c[k]));
            int maxVal = Math.max(a[i], Math.max(b[j], c[k]));

            if (maxVal - minVal < minDiff) {
                minDiff = maxVal - minVal;
                x = a[i];
                y = b[j];
                z = c[k];
            }

            if (minVal == a[i]) i++;
            else if (minVal == b[j]) j++;
            else k++;
        }

        int[] res = {x, y, z};
        Arrays.sort(res);
        return new int[]{res[2], res[1], res[0]};
    }

    public static void main(String[] args) {

        HappiestTriplet sol = new HappiestTriplet();

        int[] a = {5, 2, 8};
        int[] b = {10, 7, 12};
        int[] c = {9, 14, 6};

        int[] ans = sol.smallestDiff(a, b, c);

        System.out.println(Arrays.toString(ans));
    }
}
