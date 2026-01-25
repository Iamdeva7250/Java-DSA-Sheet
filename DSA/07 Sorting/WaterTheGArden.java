import java.util.*;
public class WaterTheGArden {

    int min_sprinklers(int gallery[], int n) {
        ArrayList<int[]> ranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (gallery[i] != -1) {
                int left = Math.max(0, i - gallery[i]);
                int right = Math.min(n - 1, i + gallery[i]);
                ranges.add(new int[] {left, right});
            }
        }

        // Sort by starting point
        ranges.sort((a, b) -> a[0] - b[0]);

        int sprinklers = 0;
        int i = 0;
        int target = 0;
        int maxright = -1;

        while (target < n) {
            boolean found = false;

            // Extend coverage with all sprinklers that start before or at target
            while (i < ranges.size() && ranges.get(i)[0] <= target) {
                maxright = Math.max(maxright, ranges.get(i)[1]);
                i++;
                found = true;
            }

            if (!found) {
                return -1; // Impossible to cover gallery
            }

            sprinklers++;
            target = maxright + 1;
        }

        return sprinklers;
    }



    public static void main(String[] args) {
        WaterTheGArden sol = new WaterTheGArden();

        // Sample input
        int[] gallery = {1, 0, 4, 2, 0, 6, 2, 4};
        int n = gallery.length;

        int result = sol.min_sprinklers(gallery, n);
        System.out.println("Minimum sprinklers needed: " + result);
    }

  
}
