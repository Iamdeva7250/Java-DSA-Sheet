import java.util.*;
import java.io.*;

public class MaximumDiamonds {
    
   
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : A){
            max.add(num);
        }
        
        long total = 0;
        for(int i  = 0; i < K; i++){
            int maxBag = max.poll();
            total += maxBag;
            max.add(maxBag / 2);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 7, 4, 2};
        int N = A.length;
        int K = 3;
        long result = maxDiamonds(A, N, K);
        System.out.println("Maximum diamonds collected: " + result);
    }
}

    
