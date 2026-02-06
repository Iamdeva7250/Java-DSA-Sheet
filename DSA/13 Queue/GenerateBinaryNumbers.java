import java.util.*;
import java.io.*;

public class GenerateBinaryNumbers {
    

    // Your code here
      public ArrayList<String> generateBinary(int n) {
        // code here
        
        ArrayList<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        
        q.offer("1");
        
        for(int i = 0; i < n; i++){
            String curr = q.poll();
            result.add(curr);
            
            
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
       return result;   
    }

    public static void main(String[] args) {
        GenerateBinaryNumbers gbn = new GenerateBinaryNumbers();
        int n = 5;
        ArrayList<String> binaryNumbers = gbn.generateBinary(n);
        System.out.println("First " + n + " binary numbers:");
        for (String num : binaryNumbers) {
            System.out.println(num);
        }
    }
    
}