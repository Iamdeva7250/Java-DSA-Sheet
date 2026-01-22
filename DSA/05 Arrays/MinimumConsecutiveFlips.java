class MinimumConsecutiveFlips {

    static void printGroups(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        for (int i = 1; i <= n; i++) {
            if (i == n || arr[i] != arr[i - 1]) {
                // Check if previous element is different from first element
                if (arr[i - 1] != arr[0]) {
                    int start = i - 1;
                    int end = i - 1;
                    while (end + 1 < n && arr[end + 1] != arr[0]) {
                        end++;
                    }
                    System.out.println("From " + start + " to " + end);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1};
        printGroups(arr);
    }
}
