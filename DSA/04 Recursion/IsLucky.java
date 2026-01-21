class IsLucky {
    public static boolean isLuckyno(int n) {
        return isLuckyHelper(n, 2); // start from step=2
    }

    private static boolean isLuckyHelper(int n, int counter) {
        if (counter > n)
            return true;  // survived all eliminations
        if (n % counter == 0)
            return false; // eliminated
        return isLuckyHelper(n - (n / counter), counter + 1);
    }



    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 5;

        System.out.println("Is " + n1 + " Lucky? " + IsLucky.isLuckyno(n1)); // true
        System.out.println("Is " + n2 + " Lucky? " + IsLucky.isLuckyno(n2)); // false
    }
}
