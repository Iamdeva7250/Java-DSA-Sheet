import java.util.*;
public class MoreFrequent {

        public int moreFrequent(List<Integer> arr, int x, int y) {
            int countXX = 0;
            int countYY = 0;

            // count occurrences of x and y
            for (int num : arr) {
                if (num == x) countXX++;
                if (num == y) countYY++;
            }

            // compare counts
            if (countXX > countYY) {
                return x;
            } else if (countYY > countXX) {
                return y;
            } else {
                // if equal frequency, return smaller value
                return Math.min(x, y);
            }
        }

        public static void main(String[] args) {
            MoreFrequent sol = new MoreFrequent();

            List<Integer> arr = Arrays.asList(1, 2, 3, 2, 2, 4, 5, 1, 1);

            int result = sol.moreFrequent(arr, 1, 2);
            System.out.println("More frequent element: " + result);
        }
    }




