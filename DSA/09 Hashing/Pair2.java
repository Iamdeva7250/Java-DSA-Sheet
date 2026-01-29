import java.util.*;
import java.io.*;

public class Pair2 {
    
    public static int pairtwo(int [] arr, int sum, int N){

      HashSet<Integer> result = new HashSet<>();

      for(int i = 0; i < N; i++){
        int complement = sum - arr[i];

        if(result.contains(complement)){
          return 1;
        }
        result.add(arr[i]);
      }
      return 0;
    }
    public static void main(String[] args) {
      int N = 10;
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sum = 14;

      System.out.println("the pair exists : "  + pairtwo(arr, sum, N) );
    }
    
}