import java.util.*;
import java.io.*;

public class GameWithString {
    
    static int minValue(String s, int k) {
        // code here
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int f : freq){
            if(f > 0) 
            pq.add(f);
            
        }
        
        while(k > 0 && !pq.isEmpty()){
            int top = pq.poll();
            top--;
            k--;
            if(top > 0) {
            pq.add(top);
            }
        }
        
        int ans = 0;
        
        while(!pq.isEmpty()){
            long f = pq.poll();
            ans += f * f;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aaabcc";
        int k = 2;
        int result = minValue(s, k);
        System.out.println("Minimum value: " + result);
    }
}
    
