import java.util.*;
import java.io.*;

public class CountInversions {
    
    // Your code here
     static int inversionCount(int arr[]) {
        return mergesort(arr, 0, arr.length - 1 );
    }
        static int mergesort(int[] arr, int left, int right){
            int res = 0;
            
            if(left < right){
                int mid = (left + right) / 2;
                res += mergesort(arr, left, mid);
                res += mergesort(arr, mid + 1, right);
                res += CountandMerge(arr, left, mid, right);
            }
            return res;
        }
        
        static int CountandMerge(int arr[] , int left, int mid, int right){
            int n1 = mid - left + 1;
            int n2 = right - mid;
            
            int[] left1 = new int [n1];
            int[] right1 =new int [n2];
            
            for(int i = 0; i< n1; i++){
                left1[i] = arr[left + i];
            }
            
            for(int i = 0; i < n2; i++){
                right1[i] = arr[mid + 1 + i];
            }
            
            int res = 0, i = 0, j =0, k = left;
            
            while(i < n1 && j < n2){
                if(left1[i] <= right1[j]){
                    arr[k++] = left1[i++];
                    
                }else{
                    arr[k++] = right1[j++];
                    
                    res += (n1 - i);
                }
            
            }
            while(i < n1){
                arr[k++] = left1[i++];
            }
            
            while(j < n2){
                arr[k++] = right1[j++];
            }
        
        return res;
    }

     public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println(inversionCount(arr));
    }
    
}