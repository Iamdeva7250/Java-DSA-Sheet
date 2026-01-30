import java.util.*;
public class PalindromeCheck {

    public static void main(String[] args) {

      // /// Navie Method
      //   String str = "madam";
      //   String reversedStr = new StringBuilder(str).reverse().toString();

      //   if (str.equals(reversedStr)) {
      //       System.out.println(str + " is a palindrome.");
      //   } else {
      //       System.out.println(str + " is not a palindrome.");
      //   }



      // Optimized Method
        String str = "madam";
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
  
}
