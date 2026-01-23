public class MedianOfTwoSortedArray {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length, n = nums2.length;
            int[] merged = new int[m + n];
            int i = 0, j = 0, k = 0;

            // Merge two sorted arrays
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    merged[k++] = nums1[i++];
                } else {
                    merged[k++] = nums2[j++];
                }
            }
            while (i < m) merged[k++] = nums1[i++];
            while (j < n) merged[k++] = nums2[j++];

            // Find median
            int total = m + n;
            if (total % 2 == 1) {
                return merged[total / 2];
            } else {
                return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0;
            }
        }

        // 🔹 Main method for testing
        public static void main(String[] args) {
            MedianOfTwoSortedArray sol = new MedianOfTwoSortedArray();
            int[] nums1 = {1, 3, 4, 5, 7, 9};
            int[] nums2 = {2, 4, 6, 8, 10};

            double result = sol.findMedianSortedArrays(nums1, nums2);
            System.out.println("Median is: " + result);
        }
    }



