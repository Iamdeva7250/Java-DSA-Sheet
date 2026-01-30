import java.util.*;
import java.io.*;

public class RotateString {

    public boolean rotateString(String s, String goal) {
        // Strings must be equal length
        if (s.length() != goal.length()) return false;

        // Rotation check by s+s containing goal
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        RotateString obj = new RotateString();

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(obj.rotateString(s, goal));  // true

        // Try your own test
        System.out.println(obj.rotateString("aa", "a"));  // false
        System.out.println(obj.rotateString("waterbottle", "erbottlewat")); // true
    }
}

    
