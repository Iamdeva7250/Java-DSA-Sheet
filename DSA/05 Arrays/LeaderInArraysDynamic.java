import java.util.ArrayList;
public class LeaderInArraysDynamic {

        static ArrayList<Integer> leaders(int arr[]) {
            int n = arr.length;
            ArrayList<Integer> result = new ArrayList<>();

            int currentLeader = arr[n - 1];
            result.add(currentLeader); // last element is always a leader

            // traverse from right to left
            for(int i = n - 2; i >= 0; i--){
                if(arr[i] >= currentLeader){  // include equal elements
                    currentLeader = arr[i];
                    result.add(currentLeader);
                }
            }

            // reverse to maintain original order
            ArrayList<Integer> finalResult = new ArrayList<>();
            for(int i = result.size() - 1; i >= 0; i--){
                finalResult.add(result.get(i));
            }
            return finalResult;
        }

        public static void main(String[] args) {
            int arr1[] = {16, 17, 4, 3, 5, 2};
            System.out.println(leaders(arr1));  // Output: [17, 5, 2]

            int arr2[] = {10, 4, 2, 4, 1};
            System.out.println(leaders(arr2));  // Output: [10, 4, 4, 1]

            int arr3[] = {5, 10, 20, 40};
            System.out.println(leaders(arr3));  // Output: [40]

            int arr4[] = {30, 10, 10, 5};
            System.out.println(leaders(arr4));  // Output: [30, 10, 10, 5]
        }
    }


