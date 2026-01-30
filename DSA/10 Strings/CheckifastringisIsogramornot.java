import java.util.*;
import java.io.*;

public class CheckifastringisIsogramornot {
 
   public static boolean isIsogram(String data) {

        boolean[] seen = new boolean[256];

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);

            if (seen[c]) {
                return false;   // character repeated
            }

            seen[c] = true;
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "machine";

        if (isIsogram(str)) {
            System.out.println(str + " is an Isogram.");
        } else {
            System.out.println(str + " is not an Isogram.");
        }
    }
}

