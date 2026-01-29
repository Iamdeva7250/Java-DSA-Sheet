import java.util.*;
import java.io.*;

public class PositiveNegativePair {
    
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int v = arr[i];
            int opp = -v;
            
            // if opposite exists in visited set
            if(set.contains(opp)){
                // negative first → then positive
                if(v < 0){
                    result.add(v);      // negative
                    result.add(-v);     // positive
                } else {
                    result.add(-v);     // negative
                    result.add(v);      // positive
                }
            }
            
            set.add(v);
        }
        
        return result;
   }
   
   public static void main(String[] args) {
    int n = 8; 
    int arr[] = {1,3,6,-2,-1,-3,2,7};

    System.out.println("Pair of Positive Ans NEgative is : " + findPairs(arr, n));
   }
}