public class KokoBananaEating {
    public static int findMax(int[] v) {
        int maxi = v[0];
        for (int val : v) {
            maxi = Math.max(maxi, val);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        for (int val : v) {
            // Using integer math instead of Math.ceil
            totalH += (val + hourly - 1) / hourly;
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1, high = findMax(v);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);

            if (totalH <= h) {
                high = mid - 1; // try slower
            } else {
                low = mid + 1; // need faster
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
