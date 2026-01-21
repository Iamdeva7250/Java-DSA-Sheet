import java.util.Scanner;

public class PalindromeStringCheck {

    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: if one or zero chars left
        if (left >= right) {
            return true;
        }
        // If mismatch
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Recursive call: move inward
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome string.");
        } else {
            System.out.println(str + " is NOT a Palindrome string.");
        }

        sc.close();
    }
}
