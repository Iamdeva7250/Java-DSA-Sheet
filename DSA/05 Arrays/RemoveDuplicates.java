public class RemoveDuplicates {
    static int removeDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;  // edge case for empty array

        int res = 1; // first element is always unique
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res; // returns length of unique elements
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40, 50, 50};

        int newLength = removeDuplicate(arr);

        System.out.println("Number of elements after removing duplicates: " + newLength);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}