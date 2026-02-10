import java.util.*;

public class KokoEatingBananas {
    
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = 0;
        for (int bananas : arr) {
            high = Math.max(high, bananas);
        }

        int result = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canEatAll(arr, k, mid)) {
                result = mid;
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1; // need faster speed
            }
        }
        return result;
    }

    private boolean canEatAll(int[] arr, int k, int speed) {
        int hours = 0;
        for (int bananas : arr) {
            hours += (bananas + speed - 1) / speed; // ceil division
        }
        return hours <= k;
    }

    public static void main(String[] args) {
        KokoEatingBananas sol = new KokoEatingBananas();
        int arr[] = {5, 10, 3};
        int k = 4;

        int minSpeed = sol.kokoEat(arr, k);
        System.out.println("Minimum eating speed: " + minSpeed);
    }
}
