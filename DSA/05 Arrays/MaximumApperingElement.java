public class MaximumApperingElement {

        public static int maximumOccurredElement(int[] l, int[] r, int n) {
            // Find the maximum value in r[]
            int maxVal = 0;
            for (int i = 0; i < n; i++) {
                if (r[i] > maxVal)
                    maxVal = r[i];
            }

            // Frequency array
            int[] freq = new int[maxVal + 2];

            // Step 1: Mark +1 at l[i] and -1 at r[i] + 1
            for (int i = 0; i < n; i++) {
                freq[l[i]]++;
                freq[r[i] + 1]--;
            }

            // Step 2: Build prefix sum to calculate frequencies
            int res = 0, maxFreq = freq[0];
            for (int i = 1; i <= maxVal; i++) {
                freq[i] += freq[i - 1];
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    res = i;
                }
            }

            return res;
        }

        public static void main(String[] args) {
            int[] L = {1, 5, 9, 13, 21};
            int[] R = {15, 8, 12, 20, 30};
            int n = L.length;

            System.out.println(maximumOccurredElement(L, R, n)); // Output: 5
        }
    }

