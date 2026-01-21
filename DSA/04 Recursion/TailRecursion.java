public class TailRecursion {
    public static void printN(int N) {
        if (N == 0)
            return;
        else
            System.out.print(N + " ");
        printN(N - 1);
    }
    public static void main(String[] args) {
        printN(5);
    }
}


