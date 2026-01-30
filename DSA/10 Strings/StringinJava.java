import java.util.*;

public class StringinJava {

    public static void main(String[] args) {

        System.out.println("=== String Creation ===");
        String s = "GeeksforGeeks";
        System.out.println("String s = " + s);

        String s1 = new String("GeeksforGeeks");
        System.out.println("String s1 = " + s1);

        System.out.println("\n=== equals() Comparison (case-sensitive) ===");
        String string1 = "Geeksforgeeks";
        String string2 = "Practice";
        String string3 = "Geeks";
        String string4 = "Geeks";
        String string5 = "geeks";

        System.out.println(string1 + " equals " + string2 + " : " + string1.equals(string2));
        System.out.println(string3 + " equals " + string4 + " : " + string3.equals(string4));
        System.out.println(string4 + " equals " + string5 + " : " + string4.equals(string5));

        System.out.println("\n=== equalsIgnoreCase() Comparison ===");
        System.out.println(string3 + " equalsIgnoreCase " + string5 + " : " + string3.equalsIgnoreCase(string5));
        System.out.println(string1 + " equalsIgnoreCase " + string4 + " : " + string1.equalsIgnoreCase(string4));

        System.out.println("\n=== Objects.equals() (null-safe comparison) ===");
        String string6 = null;
        String string7 = null;
        System.out.println("string1 and string6 : " + Objects.equals(string1, string6));
        System.out.println("string6 and string7 : " + Objects.equals(string6, string7));









         String str1 = "GeeksforGeeks";
        String str2 = "Geeks";
        String str3 = "geeks";
        String str4 = "Practice";

        System.out.println("=== equals() (case-sensitive) ===");
        System.out.println(str1.equals(str2));  // false
        System.out.println(str2.equals("Geeks")); // true

        System.out.println("\n=== equalsIgnoreCase() ===");
        System.out.println(str2.equalsIgnoreCase(str3)); // true

        System.out.println("\n=== compareTo() (lexicographical) ===");
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
        System.out.println("str2.compareTo(str3) = " + str2.compareTo(str3));

        System.out.println("\n=== contains() ===");
        System.out.println(str1.contains("for")); // true
        System.out.println(str4.contains("Geek")); // false

        System.out.println("\n=== indexOf() ===");
        System.out.println("Index of 'for' in str1: " + str1.indexOf("for")); // position
        System.out.println("Index of 'z' in str1: " + str1.indexOf("z")); // -1 (not found)
    }

  
}
