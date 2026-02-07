import java.util.*;
import java.io.*;

public class Insertionindeque {
    
    // Your code here

     public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> d = new LinkedList<>();
        
        for(Integer num : arr){
            d.addLast(num);
        }
        return d;
        
    }

    public static void main(String[] args) {
        Insertionindeque obj = new Insertionindeque();
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        Deque<Integer> result = obj.dqInsertion(arr);
        System.out.println("Deque after insertion: " + result);
    }
    
}