import java.util.*;
import java.io.*;

public class SmalleronRight {
    
     public static void SmallerOnRight(int [] arr){
        TreeSet<Integer> res = new TreeSet<>();
        int maxCount = 0;
        
        for(int i = arr.length - 1; i >= 0; i--){
            maxCount = Math.max(maxCount, res.headSet(arr[i]).size());
            res.add(arr[i]);
        }
        System.out.print(maxCount);
    }
    
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            SmallerOnRight(arr);
            System.out.println();
        }
    }
}
