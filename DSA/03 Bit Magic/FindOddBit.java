public class FindOddBit {
    static int FindOddBitOccurence(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            // Check if count is odd
            if (count % 2 != 0)
                return arr[i];
        }
        return -1; // If no odd occurrence found
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 6, 9, 10, 11, 12, 15, 326, 45};
        int n = arr.length;
        System.out.println(FindOddBitOccurence(arr, n));
    }
}
