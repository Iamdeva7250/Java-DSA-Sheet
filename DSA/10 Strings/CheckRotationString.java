import java.util.*;

public class CheckRotationString {

    boolean areRotate(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // If lengths are not equal, they cannot be rotations
        if (n != m) {
            return false;
        }

        // Check if s2 is a substring of s1 + s1
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        CheckRotationString obj = new CheckRotationString();

        String s1 = "ABCD";
        String s2 = "CDAB";

        if (obj.areRotate(s1, s2))
            System.out.println(s2 + " is a rotation of " + s1);
        else
            System.out.println(s2 + " is NOT a rotation of " + s1);
    }
}
