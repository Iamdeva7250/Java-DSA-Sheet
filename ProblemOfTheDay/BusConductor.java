import java.util.*;
import java.io.*;

public class BusConductor {
    
     public int findMoves(int[] chairs, int[] passengers) {

      Arrays.sort(chairs);
      Arrays.sort(passengers);

      int moves = 0;

      for(int i = 0; i < chairs.length; i++){

        moves += Math.abs(chairs[i] - passengers[i]);
      }
      return moves;

     }

     public static void main(String[] args) {
       BusConductor bc = new BusConductor();

       int [] chairs = {3, 1, 5};
       int [] passengers = {2, 7, 4};

       int result = bc.findMoves(chairs, passengers);

       System.out.println("Minimum moves required: " + result);
     }


}