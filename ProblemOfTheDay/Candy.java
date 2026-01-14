import java.util.*;
import java.io.*;

public class Candy {
    
    public int minCandy(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] candies = new int[n];

        // Step 1: Give each child 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum candies
        int sum = 0;
        for (int c : candies) {
            sum += c;
        }

        return sum;
    }

    public static void main(String[] args) {
        Candy candyDistribution = new Candy();
        int[] ratings = {1, 0, 2};
        int result = candyDistribution.minCandy(ratings);
        System.out.println("Minimum candies needed: " + result); 
    }
}

    
