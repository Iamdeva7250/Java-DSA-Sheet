import java.util.*;
import java.io.*;

public class LastMomentBeforeAllAntsFallOut {
    
    // Your code here
    public int getLastMoment(int n, int[] left, int[] right) {
      int maxTime = 0;

      for(int pos : left){
        maxTime = Math.max(maxTime, pos);
      }
      for(int pos : right){
        maxTime = Math.max(maxTime, n - pos);
      }
      return maxTime;
    }
    public static void main(String[] args) {
      LastMomentBeforeAllAntsFallOut solution = new LastMomentBeforeAllAntsFallOut();
      int n = 4;
      int[] left = {4,3};
      int[] right = {0,1};
      int result = solution.getLastMoment(n, left, right);
      System.out.println("Last moment before all ants fall out: " + result);
    }
}