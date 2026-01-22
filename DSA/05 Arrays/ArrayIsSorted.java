import java.util.Scanner;

public class ArrayIsSorted {
    static boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false; // Found an unsorted pair
            }
        }
        return true; // No unsorted pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
