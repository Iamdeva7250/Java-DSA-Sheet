import java.util.*;
import java.io.*;

public class MergeK_SortedArrays {
    
    // Your code here
     public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int[] row : mat){
            for(int num : row){
                result.add(num);
            }
        }
        
        Collections.sort(result);
        
        return result;
    }

    public static void main(String[] args) {
        MergeK_SortedArrays solution = new MergeK_SortedArrays();
        int[][] mat = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };
        ArrayList<Integer> merged = solution.mergeArrays(mat);
        System.out.println("Merged and Sorted Array: " + merged);   
    }
    
}