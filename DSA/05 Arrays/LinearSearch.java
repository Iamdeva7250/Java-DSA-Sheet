import java.util.Scanner;

public class LinearSearch {

    // Linear search function
    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i; // return index if found
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 15, 20, 30, 40, 60, 45, 92};

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        int result = linearSearch(arr, x);

        if (result == -1) {
            System.out.println("Number not found in array.");
        } else {
            System.out.println( + x +" Number found at index: " + result);
        }
    }
}
