public class CapacityofShip {
        public int shipWithinDays(int[] weights, int days) {
            int low = 0, high = 0;

            // low = max(weights), high = sum(weights)
            for (int w : weights) {
                low = Math.max(low, w);
                high += w;
            }

            // Binary search
            while (low <= high) {
                int mid = (low + high) / 2;
                if (canShip(weights, days, mid)) {
                    high = mid - 1; // try smaller capacity
                } else {
                    low = mid + 1;  // need larger capacity
                }
            }
            return low;
        }

        // Check if we can ship with given capacity
        private boolean canShip(int[] weights, int days, int cap) {
            int dayCount = 1; // start with day 1
            int currentLoad = 0;

            for (int w : weights) {
                if (currentLoad + w > cap) {
                    dayCount++;     // need another day
                    currentLoad = 0;
                }
                currentLoad += w;
            }
            return dayCount <= days;
        }

        // Main method to test
        public static void main(String[] args) {
            CapacityofShip sol = new CapacityofShip();
            int[] weights = {1,2,3,4,5,6,7,8,9,10};
            int days = 5;

            int ans = sol.shipWithinDays(weights, days);
            System.out.println("Minimum ship capacity: " + ans);
        }
    }


