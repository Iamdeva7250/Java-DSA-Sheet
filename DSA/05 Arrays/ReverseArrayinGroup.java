import java.util.*;
public class ReverseArrayinGroup {

        public void reverseInGroups(int[] arr, int k) {
            int n = arr.length;
            for (int i = 0; i < n; i += k) {
                int low = i;
                int high = Math.min(i + k - 1, n - 1); // last group may be smaller

                // reverse current group
                while (low < high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // input array
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // input group size
            System.out.print("Enter group size k: ");
            int k = sc.nextInt();

            // call function
            ReverseArrayinGroup sol = new ReverseArrayinGroup();
            sol.reverseInGroups(arr, k);

            // print result
            System.out.println("Array after reversing in groups:");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }


