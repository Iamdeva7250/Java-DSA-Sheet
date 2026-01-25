public class InversionCount {

    static int inversionCount(int arr[]) {
        if (arr == null || arr.length == 0) return 0;

        int n = arr.length;
        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    // test method
    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 1};
        System.out.println(inversionCount(arr)); // Output: 6
    }
}

  

