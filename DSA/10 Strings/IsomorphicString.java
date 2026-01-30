import java.util.*;
import java.io.*;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] != 0 && map1[c1] != c2)
                return false;

            if (map2[c2] != 0 && map2[c2] != c1)
                return false;

            map1[c1] = c2;
            map2[c2] = c1;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        IsomorphicString sol = new IsomorphicString();
        
        boolean result = sol.isIsomorphic(s, t);

        System.out.println(result
                ? "✅ Strings are isomorphic."
                : "❌ Strings are NOT isomorphic.");

        sc.close();
    }
}
