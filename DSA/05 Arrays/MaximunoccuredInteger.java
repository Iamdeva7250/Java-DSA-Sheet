import java.util.*;
public class MaximunoccuredInteger {

        public int maxOccured(List<Integer> L, List<Integer> R) {
            int n = L.size();

            // Find maximum number in R (range upper bound)
            int maxVal = 0;
            for (int x : R) {
                maxVal = Math.max(maxVal, x);
            }

            // Frequency array
            int[] freq = new int[maxVal + 2];

            // Step 1: Apply prefix difference technique
            for (int i = 0; i < n; i++) {
                freq[L.get(i)] += 1;
                freq[R.get(i) + 1] -= 1;
            }

            // Step 2: Prefix sum and track max
            int maxIndex = 0;
            int maxCount = freq[0];

            for (int i = 1; i <= maxVal; i++) {
                freq[i] += freq[i - 1];

                if (freq[i] > maxCount) {
                    maxCount = freq[i];
                    maxIndex = i;
                }
            }

            return maxIndex;
        }


        public static void main(String[] args) {
            MaximunoccuredInteger sol = new MaximunoccuredInteger();

            // Example input
            List<Integer> L = Arrays.asList(1, 2, 3);
            List<Integer> R = Arrays.asList(3, 5, 7);

            int result = sol.maxOccured(L, R);

            System.out.println("The maximum occurred integer is: " + result);
        }
    }


