import java.util.*;

class LargAndSecondLargeNo {
    public static ArrayList<Integer> largestAndSecondLargest(int arr[]) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(second == Integer.MIN_VALUE ? -1 : second);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        int[] arr2 = {2, 2};
        int[] arr3 = {10, 5, 20};

        System.out.println(LargAndSecondLargeNo.largestAndSecondLargest(arr1)); // [2, 1]
        System.out.println(LargAndSecondLargeNo.largestAndSecondLargest(arr2)); // [2, -1]
        System.out.println(LargAndSecondLargeNo.largestAndSecondLargest(arr3)); // [20, 10]
    }
}
