public class EquilibriumPoin {


        // Function to check if there is an equilibrium point
        public boolean ePoint(int arr[], int n) {
            int rs = 0; // right sum
            for (int i = 0; i < n; i++) {
                rs += arr[i];
            }

            int ls = 0; // left sum
            for (int i = 0; i < n; i++) {
                rs -= arr[i];  // remove current element from right sum

                if (ls == rs) {
                    return true;  // equilibrium point found
                }

                ls += arr[i]; // add current element to left sum
            }

            return false;
        }

        // Main method to test
        public static void main(String[] args) {
            EquilibriumPoin sol = new EquilibriumPoin();

            int[] arr1 = {3, 4, 8, -9, 20, 6};
            int[] arr2 = {4, 2, -2};
            int[] arr3 = {2, -2, 4};

            System.out.println(sol.ePoint(arr1, arr1.length)); // true
            System.out.println(sol.ePoint(arr2, arr2.length)); // true
            System.out.println(sol.ePoint(arr3, arr3.length)); // false
        }
    }

