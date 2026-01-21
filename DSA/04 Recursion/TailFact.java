import java.util.Scanner;

public class TailFact {
    static void fun(int n, int k) {
        if (n == 0) {
            System.out.println("Factorial = " + k);
            return;
        }
        fun(n - 1, n * k);  // tail recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fun(n, 1); // initial call with k = 1
        sc.close();
    }
}
