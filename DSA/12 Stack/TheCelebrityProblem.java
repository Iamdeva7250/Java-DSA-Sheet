import java.util.*;
import java.io.*;

public class TheCelebrityProblem {
    
    // Your code here
      public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int a = 0, b = n - 1;
        
        
        while(a < b){
            if(mat[a][b] == 1){
                a++;
            } else{
                b--;
            }
        }
        int cand = a;
        
        for(int i = 0; i < n; i++){
            if( i  != cand){
                if(mat[cand][i] == 1 || mat[i][cand] == 0){
                    return -1;
                }
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        TheCelebrityProblem tcp = new TheCelebrityProblem();
        int[][] mat = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };
        int result = tcp.celebrity(mat);
        if (result == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("The celebrity is person " + result);
        }
    }
    
}