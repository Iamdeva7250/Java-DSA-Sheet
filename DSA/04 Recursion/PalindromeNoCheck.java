import java.util.Scanner;

public class PalindromeNoCheck {

    // Recursive function to reverse a number
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;   // base case
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = reverse(n, 0);

        if (n == reversed) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is NOT a Palindrome number.");
        }

        sc.close();
    }
}
