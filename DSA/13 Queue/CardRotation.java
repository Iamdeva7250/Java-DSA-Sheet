import java.util.*;
import java.io.*;

public class CardRotation {
    
    // Your code here
    // User function Template for Java


    static ArrayList<Integer> rotation(int N) {
       Deque<Integer> dq = new ArrayDeque<>();
       
       for(int i = N; i >= 1; i--){
           if(!dq.isEmpty()){
               dq.addFirst(dq.removeLast());
           }
           dq.addFirst(i);
       }
       
       return new ArrayList<>(dq);
    }

    public static void main(String[] args) {
        CardRotation cr = new CardRotation();
        int N = 4;
        ArrayList<Integer> result = rotation(N);
        System.out.println("Card order after rotation: " + result);
    }
    
}