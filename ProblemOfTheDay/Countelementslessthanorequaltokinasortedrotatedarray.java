import java.util.*;
import java.io.*;

public class Countelementslessthanorequaltokinasortedrotatedarray {
    
    public static int countElements(int[] arr, int k){

      int count = 0;

      for(int num : arr){
          if(num <= k){
              count++;
          }
      }
      return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int k = 5;
        int result = countElements(arr, k);
        System.out.println("Count of elements less than or equal to " + k + " is: " + result);
    }
    
}