import java.util.Arrays;

public class MedianOfARowSorted {

    public static double findMedian(int mat[][], int r, int c) {
        int min = mat[0][0];
        int max = mat[0][c - 1];

        // Find global min and max from each row
        for (int i = 1; i < r; i++) {
            if (mat[i][0] < min) {
                min = mat[i][0];
            }
            if (mat[i][c - 1] > max) {
                max = mat[i][c - 1];
            }
        }

        int desired = (r * c + 1) / 2;

        while (min < max) {
            int mid = (min + max) / 2;
            int place = 0;

            // Count how many numbers are <= mid
            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(mat[i], mid);

                // If not found, binarySearch returns (-insertionPoint - 1)
                if (pos < 0)
                    pos = Math.abs(pos) - 1;
                else {
                    // If found, move to the rightmost occurrence
                    while (pos < c && mat[i][pos] == mid)
                        pos++;
                }

                place += pos;
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        int r = 3, c = 3;
        System.out.println("Median is " + findMedian(mat, r, c));
    }
}
