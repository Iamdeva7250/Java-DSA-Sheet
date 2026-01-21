

class BaseCondition {
    static void fun1(int n) {
        // Base condition
        if (n == 0) return;

        System.out.println("GFG!");
        fun1(n - 1); // Recursive call with reduced problem size
    }

    public static void main(String[] args) {
        fun1(5); // will print "GFG!" 5 times
    }
}
