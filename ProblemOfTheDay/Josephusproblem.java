import java.util.*;
import java.io.*;

public class Josephusproblem {
    
    // Your code here

     public int josephus(int n, int k) {
        if (n == 1) return 1;
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Josephusproblem jp = new Josephusproblem();
        int n = 7; // number of people
        int k = 3; // step count
        int safePosition = jp.josephus(n, k);
        System.out.println("The safe position is: " + safePosition);
    }
    
}