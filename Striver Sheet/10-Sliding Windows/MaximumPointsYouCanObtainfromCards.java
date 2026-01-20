import java.util.*;
import java.io.*;

public class MaximumPointsYouCanObtainfromCards {
    
    // Your code here
     public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Take all cards
        if (k == n) {
            int sum = 0;
            for (int x : cardPoints) sum += x;
            return sum;
        }

        int totalSum = 0;
        for (int x : cardPoints) totalSum += x;

        int windowSize = n - k;
        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Slide window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }

    public static void main(String[] args) {
        MaximumPointsYouCanObtainfromCards solution = new MaximumPointsYouCanObtainfromCards();
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        int result = solution.maxScore(cardPoints, k);
        System.out.println("Maximum points you can obtain: " + result);
    }
    
}