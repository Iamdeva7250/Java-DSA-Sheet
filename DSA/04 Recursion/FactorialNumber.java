import java.util.Scanner;

public class FactorialNumber {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        }
        return n * fact(n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println("Factorial is " + result);

        sc.close();
    }
}
