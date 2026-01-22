public class GetLargestNo {
    static int getLargest(int[] arr) {
        int n = arr.length;
        int largestIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static void main(String[] args) {
        int[] arr = {12, 20, 60, 100, 50, 40, 200, 80, 90};
        System.out.println("Index of largest: " + getLargest(arr));
        System.out.println("Largest element: " + arr[getLargest(arr)]);
    }
}
