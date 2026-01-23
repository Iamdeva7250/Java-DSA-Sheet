public class maxWaterInTwoBulding {

        public static int maxWater(int[] height) {
            int n = height.length;
            int left = 0, right = n - 1;
            int maxWater = 0;

            while (left < right) {
                // Calculate water between left and right
                int gap = right - left - 1; // buildings removed
                int water = gap * Math.min(height[left], height[right]);
                maxWater = Math.max(maxWater, water);

                // Move the pointer pointing to the smaller building
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxWater;
        }

        // Test
        public static void main(String[] args) {
            int[] height = {2, 1, 3, 4, 6, 5};
            System.out.println("The maximum water between  Two Building " + maxWater(height)); // Output: 8
        }
    }


