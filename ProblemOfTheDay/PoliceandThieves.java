import java.util.*;
import java.io.*;

public class PoliceandThieves {
    
     public int catchThieves(char[] arr, int k) {
        List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();

        // Store positions
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') police.add(i);
            else if (arr[i] == 'T') thief.add(i);
        }

        int i = 0, j = 0, count = 0;

        // Two pointer technique
        while (i < police.size() && j < thief.size()) {
            if (Math.abs(police.get(i) - thief.get(j)) <= k) {
                count++;
                i++;
                j++;
            } else if (police.get(i) < thief.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PoliceandThieves pat = new PoliceandThieves();
        char[] arr = {'T', 'T', 'P', 'P', 'T', 'P'};
        int k = 2;
        System.out.println(pat.catchThieves(arr, k)); 
    }
    
}