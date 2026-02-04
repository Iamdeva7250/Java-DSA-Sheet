import java.util.*;
import java.io.*;

public class ImmediateSmallerElement {
    
    // Your code here

    void printImmediatesmaller(int[] arr, int n){
      for(int i = 0; i < n - 1; i++){
        if(arr[i] > arr[i + 1])
          arr[i] = arr[i + 1];
        else
          arr[i] = -1;
      }Geeky Buildings
      arr[n - 1] = -1;
    }

    public static void main(String[] args) {
        ImmediateSmallerElement obj = new ImmediateSmallerElement();
        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        obj.printImmediatesmaller(arr, n);
        System.out.println(Arrays.toString(arr)); 
    }
    
}